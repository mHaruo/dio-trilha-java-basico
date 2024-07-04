import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();

        int quantidadeTransacoes = scanner.nextInt();

        List<String> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {
            char tipoTransacao = scanner.next().toUpperCase().charAt(0);
            double valorTransacao = scanner.nextDouble();

            if (tipoTransacao == 'D') {
                saldo += valorTransacao;
                transacoes.add(i + ". Depósito de " + valorTransacao);
            } else if (tipoTransacao == 'S') {
                saldo -= valorTransacao;
                transacoes.add(i +  ". Saque de " + valorTransacao);
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--;
            }
        }

        System.out.println("Saldo: "+ saldo);

        System.out.println("Transacoes: ");
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }

        scanner.close();
    }
}