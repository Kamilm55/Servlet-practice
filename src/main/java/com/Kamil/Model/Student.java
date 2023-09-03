package com.Kamil.Model;

public class Student {
    private int id;
    private String userName;
    private int userPoint;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Student(int id, String userName, int userPoint) {
        this.id = id;
        this.userName = userName;
        this.userPoint = userPoint;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getUserPoint() {
        return userPoint;
    }
    public void setUserPoint(int userPoint) {
        this.userPoint = userPoint;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", userName=" + userName + ", userPoint=" + userPoint + "]";
    }

}
