import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha um comodo:");
            System.out.println("1. Cozinha");
            System.out.println("2. Sala");
            System.out.println("3. Quarto");
            System.out.println("4. Encerrar");

            int escolhaSala = scanner.nextInt();
            scanner.nextLine();
            switch (escolhaSala) {
                case 1:
                    Cozinha cozinha = new Cozinha();
                    cozinha.escolherAparelho();
                    break;
                case 2:
                    Sala sala = new Sala();
                    sala.escolherAparelho();
                    break;
                case 3:
                    Quarto quarto = new Quarto();
                    quarto.escolherAparelho();
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inesperada: " + escolhaSala);
                    break;
            }
        }
    }
}
