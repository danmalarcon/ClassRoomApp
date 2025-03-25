package com.example.APIClassRoom.modelos;

import jakarta.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCourse;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int credits;

    public Course() {
    }

    public Course(int idCourse, String name, int credits) {
        this.idCourse = idCourse;
        this.name = name;
        this.credits = credits;
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

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
