package com.example.APIClassRoom.ayudas;

public enum MessagesAPI {
    DOCENTE_NO_ENCONTRADO("El docente que buscas no se encuentra en la DB");

    private String texto;

    MessagesAPI(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
