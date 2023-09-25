package org.example.ex2;

import java.text.DecimalFormat;

public class Circulo implements FormaGeomatrica {

    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        DecimalFormat df = new DecimalFormat("0.00");
        double area = (Math.PI * Math.pow(raio, 2));
        return Math.round(area);
    }
}
