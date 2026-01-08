package br.edu.ifpb.ads.padroes.atv1.rpg;


import br.edu.ifpb.ads.padroes.atv1.rpg.model.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.abstractfactory.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.factory.method.*;

public class Main {
    public static void main(String[] args) {

        // -------------------------------------------------------------------------------
        // Commit 1: Camada de Modelo (Itens)
        // -------------------------------------------------------------------------------
        System.out.println(">> Teste Commit 1: Modelos Básicos (Arma/Armadura)");
        Arma espada = new Arma("Espada Teste", 10, "Cortante");
        Armadura elmo = new Armadura("Elmo Teste", 5, "Leve");
        System.out.println("Arma criada: " + espada.getNome());
        System.out.println("Armadura criada: " + elmo.getNome());

        // -------------------------------------------------------------------------------
        // Commit 2: Core e Padrão Prototypex
        // -------------------------------------------------------------------------------
        System.out.println("\n>> Teste Commit 2: Padrão Prototype");
        Personagem p1 = new Personagem();
        p1.setNome("Heroi Original");
        p1.setForca(10);

        Personagem clone = p1.clone();
        clone.setNome("Heroi Clone");

        System.out.println("Original: " + p1.getNome());
        System.out.println("Clone: " + clone.getNome());
        System.out.println("Força Clone: " + clone.getForca());

        // -------------------------------------------------------------------------------
        // Commit 3: Padrão Builder
        // -------------------------------------------------------------------------------
        System.out.println("\n>> Teste Commit 3: Padrão Builder");
        Personagem pBuilder = new PersonagemBuilder()
                .comNome("Builder Man")
                .daRaca("Humano")
                .daClasse("Guerreiro")
                .comAtributos(10, 10, 10, 100, 50)
                .build();
        System.out.println("Personagem via Builder: " + pBuilder.toString());

        // -------------------------------------------------------------------------------
        // Commit 4: Padrão Abstract Factory (Famílias de Itens)
        // -------------------------------------------------------------------------------
        System.out.println("\n>> Teste Commit 4: Padrão Abstract Factory");
        RacaFactory fabricaElfo = new ElfoFactory();
        Arma armaElfo = fabricaElfo.criarArmaArqueiro();
        Armadura armaduraElfo = fabricaElfo.criarArmaduraArqueiro();
        System.out.println("Item Criado (Elfo): " + armaElfo.getNome());
        System.out.println("Armadura Criada (Elfo): " + armaduraElfo.getNome());


        RacaFactory fabricaOrc = new OrcFactory();
        Arma armaOrc = fabricaOrc.criarArmaGuerreiro();
        System.out.println("Item Criado (Orc): " + armaOrc.getNome());

        // -------------------------------------------------------------------------------
        // Commit 5: Padrão Factory Method
        // -------------------------------------------------------------------------------
        System.out.println("\n>> Teste Commit 5: Padrão Factory Method");
        RacaFactory fabricaHumano = new HumanoFactory();
        ClassePersonagemFactory fabricaGuerreiro = new GuerreiroFactory();

        Personagem guerreiroHumano = fabricaGuerreiro.criarPersonagem("Arthur", fabricaHumano, "Humano");

        System.out.println(guerreiroHumano.toString());
    }
}
