package com.example.APIClassRoom.modelos;

public class Teacher {
    private int idTeacher;
    private String specialty;

    public Teacher() {
    }

    public Teacher(int idTeacher, String specialty) {
        this.idTeacher = idTeacher;
        this.specialty = specialty;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

}
