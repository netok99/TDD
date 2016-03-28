package code.cap7.TemplateMethod;

public class QuinzeOuVintePorCentoTemplateMethod extends RegraDeCalculoTemplateMethod{

    @Override
    protected int limite() {
        return 2500;
    }

    @Override
    protected double procentagemAcimaDoLimite() {
        return 0.75;
    }

    @Override
    protected double procentagemBase() {
        return 0.85;
    }
}
