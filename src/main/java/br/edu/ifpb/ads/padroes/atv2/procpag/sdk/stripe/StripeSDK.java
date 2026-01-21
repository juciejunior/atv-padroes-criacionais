package br.edu.ifpb.ads.padroes.atv2.procpag.sdk.stripe;

public class StripeSDK {
    public void realizarPagamento(double valor) {
        System.out.println("Stripe SDK: Pagamento de R$ " + valor + " processado.");
    }
}
