package br.edu.ifpb.ads.padroes.atv2.procpag.gateway.impl;

import br.edu.ifpb.ads.padroes.atv2.procpag.gateway.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.procpag.sdk.stripe.StripeSDK;

public class StripeGateway implements PagamentoGateway {

    private final StripeSDK stripeSDK = new StripeSDK();

    @Override
    public void pagar(double valor) {
        stripeSDK.realizarPagamento(valor);
    }
}
