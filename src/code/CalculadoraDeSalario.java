package code;

public class CalculadoraDeSalario {

    public double caucularSalario(Funcionario funcionario) {
        return funcionario.getCargo().getRegra().calcula(funcionario);
    }
}
