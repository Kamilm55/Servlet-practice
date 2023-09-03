package com.Kamil;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

@WebServlet("/UploadFile")
@MultipartConfig
public class UploadFile extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uploadPath = getServletContext().getRealPath("/uploads") ;
        File uploadDir = new File(uploadPath);

        if(!uploadDir.exists())uploadDir.mkdir();

        Collection<Part> parts = req.getParts();
        System.out.println(parts);
        for(Part part : parts){
            System.out.println("works");
            String fileName = part.getSubmittedFileName();
            part.write(uploadPath + File.separator + fileName);
            System.out.println("downloaded");
        }

    }
}
