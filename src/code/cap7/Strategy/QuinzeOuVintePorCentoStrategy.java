package code.cap7.Strategy;

import code.Funcionario;

public class QuinzeOuVintePorCentoStrategy implements RegraDeCalculoStrategy {

    @Override
    public double calcula(Funcionario funcionario) {
        if (funcionario.getSalario() < 2500)
            return funcionario.getSalario() * 0.85;
        return funcionario.getSalario() * 0.75;
    }
}
