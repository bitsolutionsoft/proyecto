package com.example.orientacion.bd.Model;

public class resultados {
    int idResultado;
    int idCarrera;

    float  logica,matenatica,gusto,social, resultado;

    public resultados() {
    }

    public resultados(int idResultado, int idCarrera, float logica, float matenatica, float gusto, float social, float resultado) {
        this.idResultado = idResultado;
        this.idCarrera = idCarrera;
        this.logica = logica;
        this.matenatica = matenatica;
        this.gusto = gusto;
        this.social = social;
        this.resultado = resultado;
    }

    public int getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(int idResultado) {
        this.idResultado = idResultado;
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public float getLogica() {
        return logica;
    }

    public void setLogica(float logica) {
        this.logica = logica;
    }

    public float getMatenatica() {
        return matenatica;
    }

    public void setMatenatica(float matenatica) {
        this.matenatica = matenatica;
    }

    public float getGusto() {
        return gusto;
    }

    public void setGusto(float gusto) {
        this.gusto = gusto;
    }

    public float getSocial() {
        return social;
    }

    public void setSocial(float social) {
        this.social = social;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
}