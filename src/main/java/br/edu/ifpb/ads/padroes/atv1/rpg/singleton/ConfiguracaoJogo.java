package br.edu.ifpb.ads.padroes.atv1.rpg.singleton;

public class ConfiguracaoJogo {
    private static ConfiguracaoJogo instance;
    private int nivelDificuldade;

    private ConfiguracaoJogo() {
        this.nivelDificuldade = 1;
    }

    public static synchronized ConfiguracaoJogo getInstance() {
        if (instance == null) {
            instance = new ConfiguracaoJogo();
        }
        return instance;
    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivel) {
        this.nivelDificuldade = nivel;
    }
}
