package com.Kamil.Dao;

import com.Kamil.Model.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
    public Student displayStudent(int id){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/resumeapp","root","root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from students where id="+id);

            if(resultSet.next()){
                int userId = resultSet.getInt("id");
                String userName = resultSet.getString("userName");
                int userPoint = resultSet.getInt("userPoint");

                Student student = new Student(userId,userName,userPoint);

                return student;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
