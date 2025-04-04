package Biblioteca;

public class Livros extends Publicacao {
    private Resenha resenha;

    public Livros(String titulo, String autor, int anoPublicacao, String editora) {
        super(titulo, autor, anoPublicacao, editora);
    }

    public void adicionarResenha(String texto, double avaliacao){
        super.adicionarResenha(texto, avaliacao);

    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); //Exibe os detalhes básicos da publicação
    }
}
