public class singleton3 {

    private static class holder {
        public static singleton3 instancia = new singleton3();
    }
       private singleton3 () {
        super();
    }

    public static singleton3 getInstancia() {
        return holder.instancia;
    }
}
