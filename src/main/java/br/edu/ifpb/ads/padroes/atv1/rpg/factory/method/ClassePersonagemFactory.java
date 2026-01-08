package br.edu.ifpb.ads.padroes.atv1.rpg.factory.method;

import br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractfactory.RacaFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Personagem;

public interface ClassePersonagemFactory {
    Personagem criarPersonagem(String nome, RacaFactory racaFactory, String nomeRaca);
}