import Executar.Navegador;
import Executar.Reprodutor;
import Executar.Telefone;

public class Main {
    public static void main(String[] args) {
        Reprodutor reprodutor = new Reprodutor();
        reprodutor.selecionarMusica("Jumento Celestino");
        reprodutor.tocar();
        reprodutor.pausar();

        Telefone telefone = new Telefone();
        telefone.ligar("1199999999");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        Navegador navegador = new Navegador();
        navegador.exibirPagina("http://www.google.com");
        navegador.adicionarAba("http://www.google.com");
        navegador.atualizarPagina();
    }
}