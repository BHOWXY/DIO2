public class singleton2 {

    //apressado

    private static singleton2 instancia = new singleton2();

    private singleton2() {
        super();
    }

    public static singleton2 getInstancia() {
        return instancia;
    }
}
