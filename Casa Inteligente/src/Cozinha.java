import java.util.Scanner;

public class Cozinha {
    public void processar(String nome, Funcao.OpcaoEstadoAparelho estado) {
        switch (estado) {
            case Ligar:
                Funcao.INSTANCE.ligar(nome);
                break;
            case Desligar:
                Funcao.INSTANCE.desligar(nome);
                break;
            default:
                throw new IllegalArgumentException("Funcao inesperada: " + estado);
        }
    }

    public void escolherAparelho() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um aparelho:");
        System.out.println("1. Microondas");
        System.out.println("2. Geladeira");
        System.out.println("3. Lampada");


        int escolhaAparelho = scanner.nextInt();
        scanner.nextLine();

        String nomeAparelho;
        switch (escolhaAparelho) {
            case 1:
                nomeAparelho = "Microondas";
                break;
            case 2:
                nomeAparelho = "Geladeira";
                break;
            case 3:
                nomeAparelho = "Lampada";
                break;

            default:
                throw new IllegalArgumentException("Aparelho inesperado: " + escolhaAparelho);
        }

        System.out.println("Escolha uma opção:");
        System.out.println("1. Ligar");
        System.out.println("2. Desligar");

        int escolhaEstado = scanner.nextInt();

        Funcao.OpcaoEstadoAparelho estado;
        switch (escolhaEstado) {
            case 1:
                estado = Funcao.OpcaoEstadoAparelho.Ligar;
                break;
            case 2:
                estado = Funcao.OpcaoEstadoAparelho.Desligar;
                break;
            default:
                throw new IllegalArgumentException("Opcao inesperada: " + escolhaEstado);
        }

        processar(nomeAparelho, estado);
    }
}
