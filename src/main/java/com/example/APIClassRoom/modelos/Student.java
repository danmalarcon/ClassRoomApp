package com.example.APIClassRoom.modelos;

import java.time.LocalDate;

public class Student {
    private int idStudent;
    private int grade;
    private LocalDate birthday;
    private String address;

    public Student() {
    }

    public Student(int idStudent, int grade, LocalDate birthday, String address) {
        this.idStudent = idStudent;
        this.grade = grade;
        this.birthday = birthday;
        this.address = address;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
