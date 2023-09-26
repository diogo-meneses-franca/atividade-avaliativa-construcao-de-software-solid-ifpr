package org.example.ex3;

import java.util.HashMap;
import java.util.Map;

public class PortuguesImpl implements Portugues{

    private Map<Integer, String> diasDaSemana = new HashMap<>(){{
        put(1, "Domingo");
        put(2, "Segunda-feira");
        put(3, "Terça-feira");
        put(4, "Quarta-feira");
        put(5, "Quinta-Feira");
        put(6, "Sexta-feira");
        put(7, "Sabado");
        put(8, "Domingo");
    }};

    public String getDiaDaSemana(Integer dia) {
        return diasDaSemana.get(dia);
    }

    public void setDiaDaSemana(Integer key, String newValue) {
        this.diasDaSemana.replace(key, newValue);
    }
}
