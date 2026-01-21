package br.edu.ifpb.ads.padroes.atv1.rpg.model;

import br.edu.ifpb.ads.padroes.atv1.rpg.prototype.Prototype;

public class Personagem implements Prototype<Personagem> {
    private String nome;
    private String raca;
    private String classe;
    private int forca;
    private int inteligencia;
    private int agilidade;
    private int vida;
    private int mana;
    private Arma arma;
    private Armadura armadura;
    private String[] habilidades;

    public Personagem() {}

    public Personagem(String nome, String raca, String classe, int forca, int inteligencia, int agilidade, int vida, int mana, Arma arma, Armadura armadura, String[] habilidades) {
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.agilidade = agilidade;
        this.vida = vida;
        this.mana = mana;
        this.arma = arma;
        this.armadura = armadura;
        this.habilidades = habilidades;
    }

    @Override
    public Personagem clone() {
        return new Personagem(this.nome, this.raca, this.classe, this.forca, this.inteligencia, this.agilidade, this.vida, this.mana, this.arma, this.armadura, this.habilidades);
    }

    public String getNome() { return nome; }
    public String getRaca() { return raca; }
    public String getClasse() { return classe; }
    public int getForca() { return forca; }
    public int getInteligencia() { return inteligencia; }
    public int getAgilidade() { return agilidade; }
    public int getVida() { return vida; }
    public int getMana() { return mana; }
    public Arma getArma() { return arma; }
    public Armadura getArmadura() { return armadura; }
    public String[] getHabilidades() { return habilidades; }

    public void setNome(String nome) { this.nome = nome; }
    public void setRaca(String raca) { this.raca = raca; }
    public void setClasse(String classe) { this.classe = classe; }
    public void setForca(int forca) { this.forca = forca; }
    public void setInteligencia(int inteligencia) { this.inteligencia = inteligencia; }
    public void setAgilidade(int agilidade) { this.agilidade = agilidade; }
    public void setVida(int vida) { this.vida = vida; }
    public void setMana(int mana) { this.mana = mana; }
    public void setArma(Arma arma) { this.arma = arma; }
    public void setArmadura(Armadura armadura) { this.armadura = armadura; }
    public void setHabilidades(String[] habilidades) { this.habilidades = habilidades; }

    @Override
    public String toString() {
        return String.format("%s - %s %s (F:%d, I:%d, A:%d, V:%d, M:%d)",
                nome, raca, classe, forca, inteligencia, agilidade, vida, mana);
    }
}