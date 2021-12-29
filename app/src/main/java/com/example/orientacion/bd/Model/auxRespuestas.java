package com.example.orientacion.bd.Model;

import java.util.ArrayList;

public class auxRespuestas {
    int idresultado, idcarrera, numerorespuesta, totalPunto;

    public auxRespuestas(int idresultado,int idcarrera, int numerorespuesta, int totalPunto) {
        this.idresultado=idresultado;
        this.idcarrera = idcarrera;
        this.numerorespuesta = numerorespuesta;
        this.totalPunto = totalPunto;
    }


    public auxRespuestas() {
    }

    public int getIdresultado() {
        return idresultado;
    }

    public void setIdresultado(int idresultado) {
        this.idresultado = idresultado;
    }

    public int getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(int idcarrera) {
        this.idcarrera = idcarrera;
    }

    public int getNumerorespuesta() {
        return numerorespuesta;
    }

    public void setNumerorespuesta(int numerorespuesta) {
        this.numerorespuesta = numerorespuesta;
    }

    public int getTotalPunto() {
        return totalPunto;
    }

    public void setTotalPunto(int totalPunto) {
        this.totalPunto = totalPunto;
    }


    public ArrayList<auxRespuestas> res(){
        ArrayList<auxRespuestas> res=new ArrayList<>();
        res.add(new auxRespuestas(1,1,0,0));
        res.add(new auxRespuestas(2,2,0,0));
        res.add(new auxRespuestas(3,3,0,0));
        res.add(new auxRespuestas(4,4,0,0));
        res.add(new auxRespuestas(5,5,0,0));
        res.add(new auxRespuestas(6,6,0,0));
        res.add(new auxRespuestas(7,7,0,0));
        res.add(new auxRespuestas(8,8,0,0));
        res.add(new auxRespuestas(9,9,0,0));
        res.add(new auxRespuestas(10,10,0,0));
        res.add(new auxRespuestas(11,11,0,0));
        res.add(new auxRespuestas(12,12,0,0));
        res.add(new auxRespuestas(13,13,0,0));
        res.add(new auxRespuestas(14,14,0,0));
        res.add(new auxRespuestas(15,15,0,0));
        res.add(new auxRespuestas(16,16,0,0));
        res.add(new auxRespuestas(17,17,0,0));

        return res;
    }

}
