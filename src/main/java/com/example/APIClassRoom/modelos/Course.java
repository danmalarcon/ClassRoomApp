package com.example.APIClassRoom.modelos;

import jakarta.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCourse;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int credits;

    @ManyToOne
    @JoinColumn(name = "teacher_id", referencedColumnName = "idTeacher", nullable = false)
    private Teacher teacher;

    public Course() {
    }

    public Course(Integer idCourse, String name, int credits, Teacher teacher) {
        this.idCourse = idCourse;
        this.name = name;
        this.credits = credits;
        this.teacher = teacher;
    }

    public Integer getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Integer idCourse) {
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
