package one.digitalinnovation.gof.susistema2cep;

import one.digitalinnovation.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }
    public String recuperarCidade(String cep){
    return "Goiânia";
    }
    public String recuperarEstado(String cep){
        return "GO";
    }
}
