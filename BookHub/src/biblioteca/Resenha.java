package biblioteca;

public class Resenha{
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
}