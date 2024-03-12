package Desafio;

public abstract class Iphone2007 {
    private int numeroDoModelo;
    private String name;

    public void ligarAparelho(){
        System.out.println("Ligando Iphone");
    }

    public void desligarAparelho(){
        System.out.println("Desligando Iphone");
    }

    public void modoVibrar() {
        System.out.println("Modo 'vibrar' ativado");
    }

    public void modoTocar(){
        System.out.println("Modo 'tocar' ativado");
    }

    public void aumentarVolume(){
        System.out.println("Aumentando volume...");
    }

    public void diminuirVolume(){
        System.out.println("Diminuindo volume...");
    }
}
