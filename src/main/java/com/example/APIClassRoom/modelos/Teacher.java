package com.example.APIClassRoom.modelos;

import jakarta.persistence.*;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTeacher;

    @Column(nullable = false)
    private String subject;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "idUser")
    private User user;

    public Teacher() {
    }

    public Teacher(int idTeacher, String subject, User user) {
        this.idTeacher = idTeacher;
        this.subject = subject;
        this.user = user;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Integer idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
