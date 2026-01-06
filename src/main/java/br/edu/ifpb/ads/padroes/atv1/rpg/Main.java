package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.prototype.*;

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

    }
}
