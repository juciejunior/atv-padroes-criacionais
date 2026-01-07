package br.edu.ifpb.ads.padroes.atv1.rpg.factory;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;

public interface RacaFactory {
    Arma criarArmaGuerreiro();
    Armadura criarArmaduraGuerreiro();
    Arma criarArmaMago();
    Armadura criarArmaduraMago();
    Arma criarArmaArqueiro();
    Armadura criarArmaduraArqueiro();
}