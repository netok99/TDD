package code.cap7.Strategy;



public enum  Cargo {
    DESENVOLVEDOR (new DezOuVintePorCentoStrategy()),
    DBA(new QuinzeOuVintePorCentoStrategy()),
    TESTADOR(new QuinzeOuVintePorCentoStrategy());

    private final RegraDeCalculoStrategy regra;

    Cargo (RegraDeCalculoStrategy regra) {
        this.regra = regra;
    }

    public RegraDeCalculoStrategy getRegra() {
        return regra;
    }
}