import org.example.ex2.Circulo;
import org.example.ex2.FormaGeomatrica;
import org.example.ex2.Quadrado;
import org.example.ex2.Triangulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FormaGeometricaTest {


    @Test
    public void calculaAreaDoQuadrado(){
        FormaGeomatrica quadrado = new Quadrado(2);
        double resultado = quadrado.calcularArea();
        Assertions.assertEquals(4, resultado);
    }

    @Test
    public void caculaAreadoTriangulo(){
        FormaGeomatrica triangulo = new Triangulo(3,5);
        double resultado = triangulo.calcularArea();
        Assertions.assertEquals(7.5, resultado);
    }

    @Test
    public void calculaAreaDoCirculo(){
        FormaGeomatrica ciculo = new Circulo(3);
        double resultado = ciculo.calcularArea();
        Assertions.assertEquals(28, resultado);
    }
}
