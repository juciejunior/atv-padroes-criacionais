package br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractfactory;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;

public class OrcFactory implements RacaFactory {
    @Override
    public Arma criarArmaGuerreiro() {
        return new Arma("Machado de Guerra", 30, "Machado");
    }

    @Override
    public Armadura criarArmaduraGuerreiro() {
        return new Armadura("Armadura Brutal", 25, "Pesada");
    }

    @Override
    public Arma criarArmaMago() {
        return new Arma("Cajado Tribal", 12, "Cajado");
    }

    @Override
    public Armadura criarArmaduraMago() {
        return new Armadura("Vestes Xamânicas", 6, "Leve");
    }

    @Override
    public Arma criarArmaArqueiro() {
        return new Arma("Arco de Osso", 24, "Arco");
    }

    @Override
    public Armadura criarArmaduraArqueiro() {
        return new Armadura("Couro de Besta", 16, "Média");
    }
}