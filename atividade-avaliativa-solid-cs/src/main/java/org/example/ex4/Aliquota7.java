package org.example.ex4;

public class Aliquota7 implements EstrategiaDeCalculoDeImposto{
    @Override
    public double calculaImposto(double salario) {
        System.out.println(salario);
        System.out.println(salario* 0.075);
        String resultado = String.format("%.2f",(salario * 0.075)).replace(",", ".");
        return Double.parseDouble(resultado);
    }
}
