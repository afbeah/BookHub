package Model;

import Interfaces.Avaliacao;

public class Resenha implements Avaliacao {
    private String texto;
    private double avaliacao;

    public Resenha(String texto, double avaliacao){
        this.texto = texto;
        this.avaliacao = avaliacao;
    }

    public void exibirResenha(){
        System.out.println("Resenha: " + texto);
        System.out.println("Avaliação: " + avaliacao + " estrelas.");
    }

    @Override
    public void exibirAvaliavel() {
        exibirResenha();
    }
}