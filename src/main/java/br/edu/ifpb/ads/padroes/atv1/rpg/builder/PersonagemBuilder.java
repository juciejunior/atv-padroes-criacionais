package br.edu.ifpb.ads.padroes.atv1.rpg.builder;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Personagem;

public class PersonagemBuilder {
    private Personagem personagem;

    public PersonagemBuilder() {
        this.personagem = new Personagem();
    }

    public PersonagemBuilder comNome(String nome) {
        this.personagem.setNome(nome);
        return this;
    }

    public PersonagemBuilder daRaca(String raca) {
        this.personagem.setRaca(raca);
        return this;
    }

    public PersonagemBuilder daClasse(String classe) {
        this.personagem.setClasse(classe);
        return this;
    }

    public PersonagemBuilder comAtributos(int forca, int inteligencia, int agilidade, int vida, int mana) {
        this.personagem.setForca(forca);
        this.personagem.setInteligencia(inteligencia);
        this.personagem.setAgilidade(agilidade);
        this.personagem.setVida(vida);
        this.personagem.setMana(mana);
        return this;
    }

    public PersonagemBuilder comEquipamento(Arma arma, Armadura armadura) {
        this.personagem.setArma(arma);
        this.personagem.setArmadura(armadura);
        return this;
    }

    public PersonagemBuilder comHabilidades(String[] habilidades) {
        this.personagem.setHabilidades(habilidades);
        return this;
    }

    public Personagem build() {
        return this.personagem;
    }
}