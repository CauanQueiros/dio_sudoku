package Exerc3;

public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente("João");

        Conta corrente = new ContaCorrente(joao);
        Conta poupanca = new ContaPoupanca(joao);

        corrente.depositar(1000);
        corrente.transferir(200, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

