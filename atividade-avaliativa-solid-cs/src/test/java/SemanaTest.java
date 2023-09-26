import org.example.ex3.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SemanaTest {

    private Semana semana = new Semana();

    @Test
    public void idiomaPadraoEhPortugues(){
        String resultado = semana.getIdioma().getClass().getSimpleName();
        Assertions.assertEquals("PortuguesImpl", resultado);
    }

    @Test
    public void diaDaSemanaPadrao(){
        String resultado = semana.imprimeDiaSemana(1);
        Assertions.assertEquals("Domingo", resultado);
    }

    @Test
    public void diaDaSemanaNoIdiomaIngles(){
        Idioma ingles = new InglesImpl();
        semana.setIdioma(ingles);
        String resultado = semana.imprimeDiaSemana(1);
        Assertions.assertEquals("Sunday", resultado);
    }

    @Test
    public void diaDaSemananoIdiomaPortugues(){
        Idioma portugues = new PortuguesImpl();
        semana.setIdioma(portugues);
        String resultado = semana.imprimeDiaSemana(2);
        Assertions.assertEquals("Segunda-feira", resultado);
    }
}
