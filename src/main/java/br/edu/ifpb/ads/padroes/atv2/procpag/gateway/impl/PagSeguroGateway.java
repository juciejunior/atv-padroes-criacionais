package br.edu.ifpb.ads.padroes.atv2.procpag.gateway.impl;

import br.edu.ifpb.ads.padroes.atv2.procpag.gateway.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.procpag.sdk.pagseguro.PagSeguroSDK;

public class PagSeguroGateway implements PagamentoGateway {

    private final PagSeguroSDK pagSeguroSDK = new PagSeguroSDK();

    @Override
    public void pagar(double valor) {
        pagSeguroSDK.realizarPagamento(valor);
    }

}
