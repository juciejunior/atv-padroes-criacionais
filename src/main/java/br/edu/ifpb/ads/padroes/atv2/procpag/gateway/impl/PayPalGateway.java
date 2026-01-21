package br.edu.ifpb.ads.padroes.atv2.procpag.gateway.impl;

import br.edu.ifpb.ads.padroes.atv2.procpag.gateway.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.procpag.sdk.paypal.PayPalSDK;

public class PayPalGateway implements PagamentoGateway {

    private final PayPalSDK payPalSDK = new PayPalSDK();

    @Override
    public void pagar(double valor){
        payPalSDK.realizarPagamento(valor);
    }
}
