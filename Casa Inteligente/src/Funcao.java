public class Funcao {
    public enum OpcaoEstadoAparelho {
        Ligar,
        Desligar
    }

    public static final Funcao INSTANCE = new Funcao();

    private Funcao() {
    }
    public void ligar(String nome) {
        System.out.println("Ligando: " + nome);
    }
    public void desligar(String nome) {
        System.out.println("Desligando: " + nome);
    }
}