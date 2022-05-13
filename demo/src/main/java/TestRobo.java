public class TestRobo {

    public static void main(String[] args) {

        comportamento normal = new comportamentoNormal();
        comportamento defensivo = new comportamentoDefensivo();
        comportamento agressivo = new comportamentoAgressivo();

        robo robo = new robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();


    }
}
