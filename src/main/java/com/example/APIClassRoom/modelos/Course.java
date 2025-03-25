package com.example.APIClassRoom.modelos;

public class Course {
    private int idCourse;
    private String name;

    public Course() {
    }

    public Course(int idCourse, String name) {
        this.idCourse = idCourse;
        this.name = name;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
