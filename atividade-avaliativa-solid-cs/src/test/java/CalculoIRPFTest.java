import org.example.ex4.IRPF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculoIRPFTest {

    private IRPF irpf = new IRPF();

    @Test
    public void testaAliquotaZero(){
        double resultado = this.irpf.calculaImposto(1900);
        Assertions.assertEquals(0, resultado);
    }

    @Test
    public void testaAliquotaDe7EMeioPorCento(){
        double resultado = this.irpf.calculaImposto(1930);
        System.out.println(resultado);
        Assertions.assertEquals(144.75, resultado);
    }

    @Test
    public void testaAliquotaDe15PorCento(){
        double resultado = this.irpf.calculaImposto(2900);
        Assertions.assertEquals(435, resultado);
    }

    @Test
    public void testaAliquotaDe22EMeioPorCento(){
        double resultado = this.irpf.calculaImposto(3800);
        Assertions.assertEquals(855, resultado);
    }
    @Test void testaAliquotaDe27EMeioPorCento(){
        double resultado = this.irpf.calculaImposto(7000);
        Assertions.assertEquals(1925.00, resultado);
    }
}
