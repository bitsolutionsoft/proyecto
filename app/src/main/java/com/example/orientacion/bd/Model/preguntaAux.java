package com.example.orientacion.bd.Model;

public class preguntaAux {
    int  idCarrera,idPregunta;

    public preguntaAux( int idPregunta,int idCarrera) {
        this.idPregunta = idPregunta;
        this.idCarrera = idCarrera;

    }

    public preguntaAux() {
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }
}
