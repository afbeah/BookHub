package biblioteca;

public class Livro implements Detalhavel{
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String editora;
    private Resenha resenha;

    public void adicionarResenha(String texto, double avaliacao){
        this.resenha = new Resenha(texto,avaliacao);
    }

    //Construtor
    public Livro(String titulo, String autor, int anoPublicacao, String editora){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Titulo: " + titulo + ".");
        System.out.println("Autor: " + autor + ".");
        System.out.println("Ano de Publicação: " + anoPublicacao + ".");
        System.out.println("Editora: " + editora + ".");

        if(resenha != null){
            resenha.exibirResenha();
        } else {
            System.out.println("Ainda não há resenha e avaliação para este livro.");
        }

        System.out.println("----------------------------");
        System.out.println(); //Cria uma linha em branco.
    }

}