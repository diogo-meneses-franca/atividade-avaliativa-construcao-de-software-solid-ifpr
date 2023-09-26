package org.example.ex4;

public class IRPF {

    public double calculaImposto(double salario){
        double imposto;
        if(ehZeroAliquota(salario)){
            return 0;
        } else if (ehAliquota7(salario)) {
           imposto = calculoAliquota7eMeio(salario);
        } else if (ehAliquota15(salario)) {
            imposto = calculoAliquota15(salario);
        } else if (ehAliquota22(salario)) {
            imposto = calculoAliquota22EMeio(salario);
        }else if(ehAliquota27(salario)){
            imposto = calculoAliquota27EMeio(salario);
        }else{
            imposto = -1;
        }
        return imposto;
    }

    private static boolean ehZeroAliquota(double salario){
        return (salario <= 1903.98)? true : false;
    }

    private static boolean ehAliquota7(double salario){
        return (salario > 1903.98 && salario <= 2826.65)? true : false;
    }
    private boolean ehAliquota15(double salario){
        return (salario > 2826.65 && salario <= 3751.05 )? true : false;
    }

    private boolean ehAliquota22(double salario){
        return (salario > 3751.05 && salario <= 4664.68)? true : false;
    }

    private boolean ehAliquota27(double salario){
        return (salario > 4664.68)? true : false;
    }

    private double calculoAliquota7eMeio(double salario){
        String resultado = String.format("%.2f",(salario * 0.075)).replace(",", ".");
        return Double.parseDouble(resultado);
    }

    private double calculoAliquota15(double salario){
        String resultado = String.format("%.2f",(salario * 0.15)).replace(",", ".");
        return Double.parseDouble(resultado);
    }

    private double calculoAliquota22EMeio(double salario){
        String resultado = String.format("%.2f",(salario * 0.225)).replace(",", ".");
        return Double.parseDouble(resultado);
    }

    private double calculoAliquota27EMeio(double salario){
        String resultado = String.format("%.2f",(salario * 0.275)).replace(",", ".");
        return Double.parseDouble(resultado);
    }
}
