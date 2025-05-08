package com.example.APIClassRoom.modelos;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Calification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCalification;

    @Column(nullable = false)
    private Double score;

    @Column(nullable = false)
    private LocalDate evaluationDate;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    public Calification() {
    }

    public Calification(Integer idCalification, Double score, LocalDate evaluationDate, Student student, Subject subject) {
        this.idCalification = idCalification;
        this.score = score;
        this.evaluationDate = evaluationDate;
        this.student = student;
        this.subject = subject;
    }

    public Integer getIdCalification() {
        return idCalification;
    }

    public void setIdCalification(Integer idCalification) {
        this.idCalification = idCalification;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public LocalDate getEvaluationDate() {
        return evaluationDate;
    }

    public void setEvaluationDate(LocalDate evaluationDate) {
        this.evaluationDate = evaluationDate;
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
