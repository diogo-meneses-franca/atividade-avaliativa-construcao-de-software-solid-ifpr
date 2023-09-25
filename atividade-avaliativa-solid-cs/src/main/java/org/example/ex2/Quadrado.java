package org.example.ex2;

public class Quadrado implements FormaGeomatrica {
    private double lado;


    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.lado, 2);
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
}
