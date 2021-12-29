package com.example.orientacion.bd.Model;

public class respuestas {
    int idRespuesta, idPreguntas;
    String respuesta;
    int correcta;

    public respuestas(int idRespuesta, int idPreguntas, String respuesta, int correcta) {
        this.idRespuesta = idRespuesta;
        this.idPreguntas = idPreguntas;
        this.respuesta = respuesta;
        this.correcta=correcta;
    }

    public respuestas() {
    }

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public int getIdPreguntas() {
        return idPreguntas;
    }

    public void setIdPreguntas(int idPreguntas) {
        this.idPreguntas = idPreguntas;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getCorrecta() {
        return correcta;
    }

    public void setCorrecta(int correcta) {
        this.correcta = correcta;
    }
}
