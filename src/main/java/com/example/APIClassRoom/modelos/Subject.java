package com.example.APIClassRoom.modelos;

import jakarta.persistence.*;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSubject;

    @Column(nullable = false)
    private String name;

    private String description;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    public Subject() {
    }

    public Subject(int idSubject, String name, String description, Course course) {
        this.idSubject = idSubject;
        this.name = name;
        this.description = description;
        this.course = course;
    }

    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
