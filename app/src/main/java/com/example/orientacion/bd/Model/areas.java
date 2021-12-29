package com.example.orientacion.bd.Model;

public class areas {
    int idArea;
    String area;

    public areas(int idArea, String area) {
        this.idArea = idArea;
        this.area = area;
    }

    public areas() {
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
