package org.example.ex3;

public class Semana {
    private Idioma idioma = new PortuguesImpl();


    public String imprimeDiaSemana(int dia){
        return idioma.getDiaDaSemana(dia);
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }
}
