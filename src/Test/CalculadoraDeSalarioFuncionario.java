package Test;

import code.CalculadoraDeSalario;
import code.cap7.Strategy.Cargo;
import code.Funcionario;
import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraDeSalarioFuncionario {

    CalculadoraDeSalario calculadora;

    @Before
    public void initConfig() {
        calculadora = new CalculadoraDeSalario();
    }

    @Test
    public void deveCalcularSalarioparaDesenvolvedoresComSalarioAbaixoDoLimite() {
        Funcionario desenvolvedor = new Funcionario("Neto", 1500.0, Cargo.DESENVOLVEDOR);

        double salario = calculadora.caucularSalario(desenvolvedor);

        assertEquals(1500.0 * 0.9, salario, 0.00001);
    }

    @Test
    public void deveCalcularSalarioparaDesenvolvedoresComSalarioAcimaDoLimite() {
        Funcionario desenvolvedor = new Funcionario("Neto", 4000.0, Cargo.DESENVOLVEDOR);

        double salario = calculadora.caucularSalario(desenvolvedor);

        assertEquals(4000.0 * 0.8, salario, 0.00001);
    }

    @Test
    public void
    deveCalcularSalarioParaDBAsComSalarioAbaixoDoLimite() {
        Funcionario dba = new Funcionario("Neto", 500.0, Cargo.DBA);

        double salario = calculadora.caucularSalario(dba);
        assertEquals(500.0 * 0.85, salario, 0.00001);
    }
}