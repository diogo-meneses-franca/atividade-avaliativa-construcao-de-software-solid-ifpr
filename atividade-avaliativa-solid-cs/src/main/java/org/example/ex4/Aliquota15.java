package org.example.ex4;

public class Aliquota15 implements EstrategiaDeCalculoDeImposto{
    @Override
    public double calculaImposto(double salario) {
        String resultado = String.format("%.2f",(salario * 0.15)).replace(",", ".");
        return Double.parseDouble(resultado);
    }
}
