import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro Parametro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo Parametro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
    }

    public static class ParametrosInvalidosException extends Exception{}
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroDois < parametroUm){
            throw new ParametrosInvalidosException();
        }
        else {
        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o numero: " + i);
        }
        }
}
}

