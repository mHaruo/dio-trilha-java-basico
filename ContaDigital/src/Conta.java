import static java.lang.System.*;

public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Seu saldo agora e de: " + saldo);
        } else {
            out.println("Valor de saque invalido ou maior que o saldo disponivel");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Seu saldo agora e de: " + saldo);
        } else {
            System.out.println("Valor de deposito invalido");
        }
    }

    public boolean transferir(double valor, Conta contaDestino) {
        if (valor > 0 && valor <= saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            return true;
        } else {
            out.println("Valor de transferencia invalido ou maior que o saldo disponivel");
            return false;
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Cliente getCpf() {
        return this.getCpf();
    }

    protected void imprimirInfosComuns() {
        out.println(String.format("Titular: %s", this.cliente.getNome()));
        out.println(String.format("CPF: %s", this.cliente.getCpf()));
        out.println(String.format("Agencia: %d", this.agencia));
        out.println(String.format("Numero: %d", this.numero));
        out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
