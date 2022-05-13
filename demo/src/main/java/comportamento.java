public abstract class comportamento {
    public abstract void mover();

    //strategy: simplicar a variação de algoritmos para a resolução de um mesmo problema

    public interface Comportamento {
        void mover();
    }

}
