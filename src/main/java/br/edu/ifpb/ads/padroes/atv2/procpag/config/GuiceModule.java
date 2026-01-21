package br.edu.ifpb.ads.padroes.atv2.procpag.config;

import br.edu.ifpb.ads.padroes.atv2.procpag.gateway.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.procpag.gateway.impl.PayPalGateway;
import com.google.inject.AbstractModule;

public class GuiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(PagamentoGateway.class).to(PayPalGateway.class);
    }
}
