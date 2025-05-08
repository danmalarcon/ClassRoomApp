package com.example.APIClassRoom.modelos;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRegistration;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "idStudent", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "idCourse", nullable = false)
    private Course course;

    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime registrationDate;

    public Registration() {
        // Se inicializa con la hora actual por defecto
        this.registrationDate = LocalDateTime.now();
    }

    public Registration(Integer idRegistration, Student student, Course course, LocalDateTime registrationDate) {
        this.idRegistration = idRegistration;
        this.student = student;
        this.course = course;
        this.registrationDate = registrationDate;
    }

    public Integer getIdRegistration() {
        return idRegistration;
    }

    public void setIdRegistration(Integer idRegistration) {
        this.idRegistration = idRegistration;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }
}
