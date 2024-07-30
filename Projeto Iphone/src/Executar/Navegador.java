package Executar;

import Interface.NavegadorInternet;

public class Navegador implements NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarAba(String url) {
        System.out.println("Adicionando nova aba com a página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página atual.");
    }
}