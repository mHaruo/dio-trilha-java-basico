import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();
        boolean exit = false;

        while (!exit) {
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Interface Banco");
            System.out.println("2 - Interface Cliente");
            System.out.println("0 - Sair");

            int opcao;
            try {
                opcao = sc.nextInt();
                sc.nextLine();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada invalida. Por favor, insira um numero.");
                sc.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    InterfaceBanco.executar(banco);
                    break;

                case 2:
                    if (!banco.getContas().isEmpty()) {
                        InterfaceCliente.executar(banco);
                    } else {
                        System.out.println("Crie contas usando a Interface Banco primeiro.");
                    }
                    break;

                case 0:
                    exit = true;
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opcao invalida.");
                    break;
            }
        }
        sc.close();
    }
}
