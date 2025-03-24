public class Livro {
    String titulo;
    String autor;
    int anoDePublicacao;

    //Construtor
    public Livro(String titulo, String autor, int anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo: " + titulo + ".");
        System.out.println("Autor: " + autor + ".");
        System.out.println("Ano de Publicação: " + anoDePublicacao + ".");
        System.out.println("----------------------------");
        System.out.println(); //Cria uma linha em branco.
    }

}