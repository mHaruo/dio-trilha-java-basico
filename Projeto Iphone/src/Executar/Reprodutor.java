package Executar;

import Interface.ReprodutorMusical;

public class Reprodutor implements ReprodutorMusical {
    private String musicaAtual;

    @Override
    public void tocar() {
        System.out.println("Reproduzindo a música: " + musicaAtual);
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada: " + musicaAtual);
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Musica selecionada: " + musica);
    }
}