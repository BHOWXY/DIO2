public class cepApi {

    private static cepApi intsancia = new cepApi();

    private cepApi() {
        super();
    }

    public static cepApi getIntsancia() {
        return intsancia;
    }

    public String recuperarCidade(String cep) {
        return "Santos";
    }
    public String recuperarEstado(String estado) {
        return "São Paulo";
    }
}
