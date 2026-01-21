package br.edu.ifpb.ads.padroes.atv2.procpag.service;

import br.edu.ifpb.ads.padroes.atv2.procpag.gateway.PagamentoGateway;
import com.google.inject.Inject;

public class PagamentoService {
    private final PagamentoGateway pagamentoGateway;

    @Inject
    public PagamentoService(PagamentoGateway pagamentoGateway) {
        this.pagamentoGateway = pagamentoGateway;
    }

    public void pagar(double valor) {
        pagamentoGateway.pagar(valor);
    }
}
