package br.edu.ifpb.ads.padroes.atv2.procpag.app;

import br.edu.ifpb.ads.padroes.atv2.procpag.config.GuiceModule;
import br.edu.ifpb.ads.padroes.atv2.procpag.gateway.impl.PagSeguroGateway;
import br.edu.ifpb.ads.padroes.atv2.procpag.gateway.impl.StripeGateway;
import br.edu.ifpb.ads.padroes.atv2.procpag.service.PagamentoService;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {

        // Pagamento com PayPal
        Injector injectorPayPal = Guice.createInjector(new GuiceModule());
        PagamentoService pagamentoServicePayPal =
                injectorPayPal.getInstance(PagamentoService.class);
        pagamentoServicePayPal.pagar(100.00);

        // Pagamento com Stripe
        Injector injectorStripe = Guice.createInjector(binder ->
                binder.bind(br.edu.ifpb.ads.padroes.atv2.procpag.gateway.PagamentoGateway.class)
                        .to(StripeGateway.class)
        );
        PagamentoService pagamentoServiceStripe =
                injectorStripe.getInstance(PagamentoService.class);
        pagamentoServiceStripe.pagar(200.00);

        // Pagamento com PagSeguro
        Injector injectorPagSeguro = Guice.createInjector(binder ->
                binder.bind(br.edu.ifpb.ads.padroes.atv2.procpag.gateway.PagamentoGateway.class)
                        .to(PagSeguroGateway.class)
        );
        PagamentoService pagamentoServicePagSeguro =
                injectorPagSeguro.getInstance(PagamentoService.class);
        pagamentoServicePagSeguro.pagar(300.00);
    }
}
