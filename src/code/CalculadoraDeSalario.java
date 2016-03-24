package code;

public class CalculadoraDeSalario {

    public double caucularSalario(Funcionario funcionario) {
        if (funcionario.getSalario() > 3000) {
            return funcionario.getSalario() * 0.8;
        }
        return funcionario.getSalario() * 0.9;
    }
}
