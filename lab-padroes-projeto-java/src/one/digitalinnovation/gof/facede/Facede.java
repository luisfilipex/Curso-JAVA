package one.digitalinnovation.gof.facede;

import one.digitalinnovation.gof.subsistema.crm.CrmService;
import one.digitalinnovation.gof.susistema2cep.CepApi;

public class Facede {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCleinte(nome, cep, cidade, estado);
    }
}
