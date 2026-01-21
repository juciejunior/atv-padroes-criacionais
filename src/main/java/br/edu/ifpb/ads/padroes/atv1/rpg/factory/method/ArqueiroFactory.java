package br.edu.ifpb.ads.padroes.atv1.rpg.factory.method;

import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractfactory.RacaFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Personagem;

public class ArqueiroFactory implements ClassePersonagemFactory {
    @Override
    public Personagem criarPersonagem(String nome, RacaFactory racaFactory, String nomeRaca) {
        int forca = 10;
        int inteli = 12;
        int agi = 16;
        int vida = 100;
        int mana = 70;
        String[] skills = {"Tiro Certeiro", "Chuva de Flechas"};

        if(nomeRaca.equals("Elfo")) {
            forca = 8; inteli = 16; agi = 20; vida = 90; mana = 100;
            skills = new String[]{"Tiro Múltiplo", "Camuflagem"};
        } else if (nomeRaca.equals("Orc")) {
            forca = 14; inteli = 8; agi = 12; vida = 120; mana = 40;
            skills = new String[]{"Tiro Brutal", "Intimidação"};
        }

        return new PersonagemBuilder()
                .comNome(nome)
                .daRaca(nomeRaca)
                .daClasse("Arqueiro")
                .comAtributos(forca, inteli, agi, vida, mana)
                .comEquipamento(racaFactory.criarArmaArqueiro(), racaFactory.criarArmaduraArqueiro())
                .comHabilidades(skills)
                .build();
    }
}