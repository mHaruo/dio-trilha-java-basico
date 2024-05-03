import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        String numero;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.println("Digite sua agencia");
        agencia = sc.next();

        System.out.println("Digite sua conta");
        numero = sc.next();

        System.out.println("Olá " + nomeCliente + ", " +
                "obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero +
                " e seu saldo de " + saldo +" já está disponível para saque");
    }
}