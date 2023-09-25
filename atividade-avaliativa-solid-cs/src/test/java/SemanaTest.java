import org.example.ex3.Idioma;
import org.example.ex3.Ingles;
import org.example.ex3.Semana;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SemanaTest {

    private Semana semana = new Semana();

    @Test
    public void idiomaPadraoEhPortugues(){
        String resultado = semana.getIdioma().getClass().getSimpleName();
        Assertions.assertEquals("Portugues", resultado);
    }

    @Test
    public void diaDaSemanaPadrao(){
        String resultado = semana.imprimeDiaSemana(1);
        Assertions.assertEquals("Domingo", resultado);
    }

    @Test
    public void diaDaSemanaNoIdiomaIngles(){
        Idioma ingles = new Ingles();
        semana.setIdioma(ingles);
        String resultado = semana.imprimeDiaSemana(1);
        Assertions.assertEquals("Sunday", resultado);
    }
}
