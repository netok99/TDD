package code.cap7.TemplateMethod;

public class DezOuVintePorCentoTemplateMethod extends RegraDeCalculoTemplateMethod {

    @Override
    protected int limite() {
        return 3000;
    }

    @Override
    protected double procentagemAcimaDoLimite() {
        return 0.8;
    }

    @Override
    protected double procentagemBase() {
        return 0.9;
    }
}
