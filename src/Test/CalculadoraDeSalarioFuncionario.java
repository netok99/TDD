package Test;

import code.CalculadoraDeSalario;
import code.Cargo;
import code.Funcionario;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

public class CalculadoraDeSalarioFuncionario {

    @Test
    public void deveCalcularSalarioparaDesenvolvedoresComSalarioAbaixoDoLimite() {
        CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
        Funcionario desenvolvedor = new Funcionario("Neto", 1500.0, Cargo.DESENVOLVEDOR);

        double salario = calculadora.caucularSalario(desenvolvedor);

        assertEquals(1500.0 * 0.9, salario, 0.00001);
    }

    @Test
    public void deveCalcularSalarioparaDesenvolvedoresComSalarioAcimaDoLimite() {
        CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
        Funcionario desenvolvedor = new Funcionario("Neto", 4000.0, Cargo.DESENVOLVEDOR);

        double salario = calculadora.caucularSalario(desenvolvedor);

        assertEquals(4000.0 * 0.8, salario, 0.00001);
    }

    @Test
    public void
    deveCalcularSalarioParaDBAsComSalarioAbaixoDoLimite() {
        CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
        Funcionario dba = new Funcionario("Neto", 500.0, Cargo.DBA);

        double salario = calculadora.caucularSalario(dba);
        assertEquals(500.0 * 0.85, salario, 0.00001);
    }
}