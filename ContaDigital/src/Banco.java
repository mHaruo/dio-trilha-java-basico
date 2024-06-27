import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public boolean removerConta(int numeroConta) {
        contas.removeIf(conta -> conta.getNumero() == numeroConta);
        return false;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void exibirContas() {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
        } else {
            for (Conta conta : contas) {
                conta.imprimirInfosComuns();
                System.out.println("-----------------------");
            }
        }
    }
}
