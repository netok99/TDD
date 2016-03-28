package code.cap7.Strategy;

import code.Funcionario;

public class DezOuVintePorCentoStrategy implements RegraDeCalculoStrategy {

    @Override
    public double calcula(Funcionario funcionario) {
        if (funcionario.getSalario() > 3000)
            return funcionario.getSalario() * 0.8;
        return funcionario.getSalario() * 0.9;
    }
}
