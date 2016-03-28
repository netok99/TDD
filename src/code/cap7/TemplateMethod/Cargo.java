package code.cap7.TemplateMethod;

public enum Cargo {
    DESENVOLVEDOR (new DezOuVintePorCentoTemplateMethod()),
    DBA(new QuinzeOuVintePorCentoTemplateMethod()),
    TESTADOR(new QuinzeOuVintePorCentoTemplateMethod());

    private final RegraDeCalculoTemplateMethod regra;

    Cargo(RegraDeCalculoTemplateMethod regra) {
        this.regra = regra;
    }

    public RegraDeCalculoTemplateMethod getRegra() {
        return regra;
    }
}