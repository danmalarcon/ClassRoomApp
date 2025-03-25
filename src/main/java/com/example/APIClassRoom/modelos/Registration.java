package com.example.APIClassRoom.modelos;

import java.time.LocalDateTime;

public class Registration {
    private int idRegistration;
    private LocalDateTime creationDate;

    public Registration() {
    }

    public Registration(int idRegistration, LocalDateTime creationDate) {
        this.idRegistration = idRegistration;
        this.creationDate = creationDate;
    }

    public int getIdRegistration() {
        return idRegistration;
    }

    public void setIdRegistration(int idRegistration) {
        this.idRegistration = idRegistration;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
