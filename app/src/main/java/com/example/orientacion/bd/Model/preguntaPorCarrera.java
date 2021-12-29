package com.example.orientacion.bd.Model;

public class preguntaPorCarrera {
    int codigo, numeroPregiunta,total;

    public preguntaPorCarrera() {
    }

    public preguntaPorCarrera(int codigo, int numeroPregiunta,int total) {
        this.codigo = codigo;
        this.numeroPregiunta = numeroPregiunta;
        this.total=total;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroPregiunta() {
        return numeroPregiunta;
    }

    public void setNumeroPregiunta(int numeroPregiunta) {
        this.numeroPregiunta = numeroPregiunta;
    }

    public  int getTotal(){
      return total;
    }
    public  void setTotal(int total){
        this.total=total;
    }
}

