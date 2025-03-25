package com.example.APIClassRoom.modelos;

import jakarta.persistence.*;

@Entity
public class Qualification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idQualification;

    @Column(nullable = false)
    private double score;

    @ManyToOne
    @JoinColumn(name = "idStudent", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "idSubject", nullable = false)
    private Subject subject;

    public Qualification() {
    }

    public Qualification(int idQualification, double score, Student student, Subject subject) {
        this.idQualification = idQualification;
        this.score = score;
        this.student = student;
        this.subject = subject;
    }

    public int getIdQualification() {
        return idQualification;
    }

    public void setIdQualification(int idQualification) {
        this.idQualification = idQualification;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
