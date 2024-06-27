import java.util.Scanner;

public class InterfaceBanco {
    public static void executar(Banco banco) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Abrir Conta");
            System.out.println("2 - Fechar Conta");
            System.out.println("3 - Exibir Contas");
            System.out.println("4 - Voltar ao Menu Principal");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("1 - Conta Corrente 2 - Conta Poupanca");
                    int tipoConta = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o nome do cliente: ");
                    String nomeCliente = sc.nextLine();
                    System.out.println("Digite o cpf do cliente: ");
                    String cpfCliente = sc.nextLine();

                    Cliente cliente = new Cliente(nomeCliente, cpfCliente);
                    Conta conta;
                    if (tipoConta == 1) {
                        conta = new ContaCorrente(cliente);
                    } else if (tipoConta == 2) {
                        conta = new ContaPoupanca(cliente);
                    } else {
                        System.out.println("Opcao invalida");
                        continue;
                    }

                    banco.adicionarConta(conta);
                    System.out.println("Conta criada com sucesso.");
                    break;

                case 2:
                    System.out.println("Digite o numero da conta que deseja encerrar: ");
                    int excluirConta = sc.nextInt();
                    sc.nextLine();

                    boolean removido = banco.removerConta(excluirConta);
                    if (removido) {
                        System.out.println("Conta removida com sucesso.");
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 3:
                    System.out.println("Contas existentes:");
                    for (Conta c : banco.getContas()) {
                        System.out.println("Numero: " + c.getNumero());
                        System.out.println("Tipo: " + c.getClass().getSimpleName());
                        System.out.println("Titular: " + c.getCliente().getNome());
                        System.out.println("CPF: " + c.getCliente().getCpf());
                        System.out.println("Saldo: " + c.getSaldo());
                        System.out.println("--------------------------------------");
                    }
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }
    }
}
