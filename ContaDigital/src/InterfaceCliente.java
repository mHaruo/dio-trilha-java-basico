
import java.util.Scanner;

public class InterfaceCliente {
    public static void executar(Banco banco) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o numero da conta para operar (ou 0 para voltar ao Menu Principal):");
            int opcaoConta = sc.nextInt();
            sc.nextLine();

            if (opcaoConta == 0) {
                return;
            }

            Conta contaSelecionada = null;
            for (Conta conta : banco.getContas()) {
                if (conta.getNumero() == opcaoConta) {
                    contaSelecionada = conta;
                    break;
                }
            }

            if (contaSelecionada == null) {
                System.out.println("Conta nao encontrada.");
                continue;
            }

            while (true) {
                System.out.println("Escolha uma operacao:");
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Transferir");
                System.out.println("4 - Voltar");

                int opcaoOperacao = sc.nextInt();
                sc.nextLine();

                switch (opcaoOperacao) {
                    case 1:
                        System.out.println("Digite o valor para depósito:");
                        double valorDeposito = sc.nextDouble();
                        sc.nextLine();
                        contaSelecionada.depositar(valorDeposito);
                        break;

                    case 2:
                        System.out.println("Digite o valor para saque:");
                        double valorSaque = sc.nextDouble();
                        sc.nextLine();
                        contaSelecionada.sacar(valorSaque);
                        break;

                    case 3:
                        System.out.println("Digite o valor para transferencia:");
                        double valorTransferencia = sc.nextDouble();
                        System.out.println("Digite o numero da conta destino:");
                        int numeroContaDestino = sc.nextInt();
                        sc.nextLine();

                        Conta contaDestino = null;
                        for (Conta conta : banco.getContas()) {
                            if (conta.getNumero() == numeroContaDestino) {
                                contaDestino = conta;
                                break;
                            }
                        }

                        if (contaDestino == null) {
                            System.out.println("Conta destino nao encontrada.");
                        } else {
                            boolean sucesso = contaSelecionada.transferir(valorTransferencia, contaDestino);
                            if (sucesso) {
                                System.out.println("Transferencia realizada com sucesso.");
                            } else {
                                System.out.println("Falha na transferencia.");
                            }
                        }
                        break;

                    case 4:
                        return;

                    default:
                        System.out.println("Opcao invalida.");
                        break;
                }

                System.out.println("Informacoes da conta:");
                System.out.println("Titular: " + contaSelecionada.getCliente().getNome());
                System.out.println("Numero da conta: " + contaSelecionada.getNumero());
                System.out.println("Agencia: " + contaSelecionada.getAgencia());
                System.out.println("Saldo: " + contaSelecionada.getSaldo());
                System.out.println("--------------------------------------");
            }
        }
    }
}
