package com.example.orientacion.bd.Model;

public class preguntas {
    int idPrenguta, idArea;
    String pregunta;

    public preguntas(int idPrenguta,  int idArea, String pregunta) {
        this.idPrenguta = idPrenguta;

        this.idArea = idArea;
        this.pregunta = pregunta;
    }

    public preguntas() {
    }

    public int getIdPrenguta() {
        return idPrenguta;
    }

    public void setIdPrenguta(int idPrenguta) {
        this.idPrenguta = idPrenguta;
    }



    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
}
