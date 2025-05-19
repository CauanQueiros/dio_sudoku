package Exerc3;

public abstract class Conta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta destino) {
        if (saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Transferência falhou: saldo insuficiente!");
        }
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta ===");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Saldo: R$ " + saldo);
    }
}
