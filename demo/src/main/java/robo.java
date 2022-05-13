public class robo {
    private comportamento comportamento;

    public void setComportamento (comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        this.comportamento.mover();
    }
}
