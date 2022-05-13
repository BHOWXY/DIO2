public class Facade {

    //facade: prover uma interface que reduza a complexidade nas integraçõees de subsistemas

    public void migrarCliente(String nome, String cep ) {
        String estado = cepApi.getIntsancia().recuperarCidade(cep);
        String cidade = cepApi.getIntsancia().recuperarCidade(cep);

        crmService.gravarCliente(nome, cep, cidade, estado);
    }


}
