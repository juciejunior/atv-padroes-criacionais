package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractfactory.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.method.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.*;

import java.util.HashMap;
import java.util.Map;

public class CriadorPersonagem {
    private Map<String, RacaFactory> racas;
    private Map<String, ClassePersonagemFactory> classes;

    public CriadorPersonagem() {
        racas = new HashMap<>();
        racas.put("Humano", new HumanoFactory());
        racas.put("Elfo", new ElfoFactory());
        racas.put("Orc", new OrcFactory());

        classes = new HashMap<>();
        classes.put("Guerreiro", new GuerreiroFactory());
        classes.put("Mago", new MagoFactory());
        classes.put("Arqueiro", new ArqueiroFactory());
    }

    public Personagem criarPersonagem(String nome, String racaStr, String classeStr) {
        RacaFactory racaFactory = racas.get(racaStr);
        ClassePersonagemFactory classeFactory = classes.get(classeStr);

        if (racaFactory == null || classeFactory == null) {
            System.out.println("Combinação inválida: " + racaStr + " " + classeStr);
            return null;
        }

        return classeFactory.criarPersonagem(nome, racaFactory, racaStr);
    }

    public Personagem criarPersonagemEspecial(String nome, String racaStr, String classeStr) {
        Personagem base = criarPersonagem(nome, racaStr, classeStr);

        if (base != null && "Humano".equals(racaStr) && "Guerreiro".equals(classeStr)) {
            Personagem lendario = base.clone();
            lendario.setNome(nome + " o Lendário");
            lendario.setForca(18);
            lendario.setInteligencia(10);
            lendario.setAgilidade(12);
            lendario.setVida(140);
            lendario.setMana(40);
            lendario.setArma(new Arma("Excalibur", 35, "Espada"));
            lendario.setArmadura(new Armadura("Armadura do Rei", 30, "Pesada"));
            lendario.setHabilidades(new String[]{"Investida", "Bloqueio", "Liderança"});
            return lendario;
        }
        return base;
    }
}