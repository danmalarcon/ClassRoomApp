package com.example.APIClassRoom.modelos;

import jakarta.persistence.*;

@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAttendance;

    @ManyToOne
    @JoinColumn(name = "idStudent", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "idCourse", nullable = false)
    private Course course;

    @Column(nullable = false)
    private boolean present;

    public Attendance() {
    }

    public Attendance(int idAttendance, Student student, Course course, boolean present) {
        this.idAttendance = idAttendance;
        this.student = student;
        this.course = course;
        this.present = present;
    }

    public int getIdAttendance() {
        return idAttendance;
    }

    public void setIdAttendance(int idAttendance) {
        this.idAttendance = idAttendance;
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

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }
}
