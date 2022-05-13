public class Test {

    public static void main(String[] args) {

        singleton lazy = singleton.getInstancia();
        System.out.println(lazy);
        lazy = singleton.getInstancia();
        System.out.println(lazy);

        singleton2 lazy2 = singleton2.getInstancia();
        System.out.println(lazy2);
        lazy2 = singleton2.getInstancia();
        System.out.println(lazy2);

        singleton3 lazy3 = singleton3.getInstancia();
        System.out.println(lazy3);
        lazy3 = singleton3.getInstancia();
        System.out.println(lazy3);
    }
}
