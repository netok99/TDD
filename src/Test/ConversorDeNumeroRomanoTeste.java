package Test;

import code.ConversorDeNumeroRomano;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class ConversorDeNumeroRomanoTeste {

    ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();

    @Test
    public void deveEntenderoSmboloI() {
        assertEquals(1, romano.converte("I"));
    }

    @Test
    public void deveEntenderoSmboloV() {
        assertEquals(5, romano.converte("V"));
    }

    @Test
    public void deveEntenderDoisSimbolosComoII() {
        assertEquals(2, romano.converte("II"));
    }

    @Test
    public void deveEntenderQuatroSimbolosDoisaDoisComoXXII() {
        assertEquals(22, romano.converte("XXII"));
    }

    @Test
    public void deveEntenderNumerosComoIX() {
        assertEquals(9, romano.converte("IX"));
    }

    @Test
    public void deveEntenderNumerosComoXXIV() {
        assertEquals(24, romano.converte("XXIV"));
    }
}