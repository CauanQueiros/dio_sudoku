package Exerc2;

public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();


        meuIphone.selecionarMusica("Slipkot - Duality");
        meuIphone.tocar();
        meuIphone.pausar();

        System.out.println();


        meuIphone.ligar("11999999999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println();


        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
