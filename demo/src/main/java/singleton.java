//preguiçoso

public class singleton {

//singleton permite a criação de uma unica instancia de uma classe e fornerce um modo de recuperla

        private static  singleton instancia;

        private singleton() { //construtor tem que ser privado, para garantir que ninguem va externamente acessa-lo
            super();
        }

        public static singleton getInstancia () {
            if (instancia == null) {
                instancia = new singleton();
            }
            return instancia;
        }
    }

