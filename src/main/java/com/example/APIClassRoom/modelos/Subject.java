package com.example.APIClassRoom.modelos;

public class Subject {
    private int idSubject;
    private String name;

    public Subject() {
    }

    public Subject(int idSubject, String name) {
        this.idSubject = idSubject;
        this.name = name;
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
}
