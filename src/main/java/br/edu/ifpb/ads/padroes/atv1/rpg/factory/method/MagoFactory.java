package br.edu.ifpb.ads.padroes.atv1.rpg.factory.method;

import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractfactory.RacaFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Personagem;

public class MagoFactory implements ClassePersonagemFactory {
    @Override
    public Personagem criarPersonagem(String nome, RacaFactory racaFactory, String nomeRaca) {
        int forca = 6;
        int inteli = 18;
        int agi = 8;
        int vida = 80;
        int mana = 150;
        String[] skills = {"Bola de Fogo", "Cura"};

        if(nomeRaca.equals("Elfo")) {
            forca = 4; inteli = 20; agi = 14; vida = 70; mana = 180;
            skills = new String[]{"Magia da Natureza", "Teleporte"};
        } else if (nomeRaca.equals("Orc")) {
            forca = 10; inteli = 14; agi = 6; vida = 100; mana = 120;
            skills = new String[]{"Magia Sombria", "Invocação"};
        }

        return new PersonagemBuilder()
                .comNome(nome)
                .daRaca(nomeRaca)
                .daClasse("Mago")
                .comAtributos(forca, inteli, agi, vida, mana)
                .comEquipamento(racaFactory.criarArmaMago(), racaFactory.criarArmaduraMago())
                .comHabilidades(skills)
                .build();
    }
}