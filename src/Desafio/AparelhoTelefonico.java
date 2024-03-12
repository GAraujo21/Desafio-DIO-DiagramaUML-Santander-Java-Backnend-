package Desafio;

public class AparelhoTelefonico extends Iphone2007 implements ReprodutorMusical, NavegadorInternet{
    private int id;
    private String name;

    public void ligarChamada(){
        System.out.println("Chamando...");
    }

    public void deslgiarChamada(){
        System.out.println("Desligando...");
    }

    public void atender(){
        System.out.println("Atendendo chamada...");
    }

    public void inicarCorreioDeVoz(){
        System.out.println("Iniciando correio de voz...");
    }

    @java.lang.Override
    public void exibirPagina(String nomePagina) {
        System.out.println("Abrindo a página " + nomePagina);
    }

    @java.lang.Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @java.lang.Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @java.lang.Override
    public void tocarMusica() {
        System.out.println("Play");
    }

    @java.lang.Override
    public void pausarMusica() {
        System.out.println("Pause");
    }

    @java.lang.Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
}
