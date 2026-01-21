package br.edu.ifpb.ads.padroes.atv1.rpg.factory.method;

import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractfactory.RacaFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Personagem;

public class GuerreiroFactory implements ClassePersonagemFactory {
    @Override
    public Personagem criarPersonagem(String nome, RacaFactory racaFactory, String nomeRaca) {
        int forca = 15;
        int inteli = 8;
        int agi = 10;
        int vida = 120;
        int mana = 30;
        String[] skills = {"Investida", "Bloqueio"};

        if(nomeRaca.equals("Elfo")) {
            forca = 12; inteli = 14; agi = 16; vida = 100; mana = 60;
            skills = new String[]{"Dança das Lâminas", "Agilidade Élfica"};
        } else if (nomeRaca.equals("Orc")) {
            forca = 20; inteli = 6; agi = 8; vida = 150; mana = 20;
            skills = new String[]{"Fúria", "Pancada Devastadora"};
        }

        return new PersonagemBuilder()
                .comNome(nome)
                .daRaca(nomeRaca)
                .daClasse("Guerreiro")
                .comAtributos(forca, inteli, agi, vida, mana)
                .comEquipamento(racaFactory.criarArmaGuerreiro(), racaFactory.criarArmaduraGuerreiro())
                .comHabilidades(skills)
                .build();
    }
}