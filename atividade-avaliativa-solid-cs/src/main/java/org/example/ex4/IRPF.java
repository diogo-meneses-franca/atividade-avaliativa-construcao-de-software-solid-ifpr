package org.example.ex4;

public class IRPF {

    private EstrategiaDeCalculoDeImposto estrategia;

    public double calculaImposto(double salario){
        double imposto = 0;
        if(ehZeroAliquota(salario)){
            return 0;
        } else if (ehAliquota7(salario)) {
           this.estrategia = new Aliquota7();
           imposto = estrategia.calculaImposto(salario);
        } else if (ehAliquota15(salario)) {
            this.estrategia = new Aliquota15();
            imposto = estrategia.calculaImposto(salario);
        } else if (ehAliquota22(salario)) {
            this.estrategia = new Aliquota22();
            imposto = estrategia.calculaImposto(salario);

        }else if(ehAliquota27(salario)){
            this.estrategia = new Aliquota27();
            imposto = estrategia.calculaImposto(salario);
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
}
