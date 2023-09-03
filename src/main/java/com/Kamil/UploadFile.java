package com.Kamil;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload2.*;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.RequestContext;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.servlet.ServletRequestContext;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class UploadFile extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
        try {
            ServletRequestContext requestContext = new ServletRequestContext(req);
            List<FileItem> fileItems = sf.parseRequest(requestContext);
            for(FileItem file : fileItems){
                file.write(new File("C:\\Users\\User\\IdeaProjects\\MavenProjects\\ServletApp\\uploads\\"+file.getName()));
            }
            PrintWriter out = resp.getWriter();
            out.println("Uploaded succesfully");
        } catch (FileUploadException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
