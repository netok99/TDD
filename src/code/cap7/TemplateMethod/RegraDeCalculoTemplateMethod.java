package code.cap7.TemplateMethod;

import code.Funcionario;

public abstract class RegraDeCalculoTemplateMethod {

    public double calcula(Funcionario funcionario) {
        if (funcionario.getSalario() > limite())
            return funcionario.getSalario() * procentagemAcimaDoLimite();
        return funcionario.getSalario() * procentagemBase();
    }

    protected abstract int limite();

    protected abstract double procentagemAcimaDoLimite();

    protected abstract double procentagemBase();
}
