package biblioteca;

class Livro implements Detalhavel{
    String titulo;
    String autor;
    int anoPublicacao;

    //Construtor
    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Titulo: " + titulo + ".");
        System.out.println("Autor: " + autor + ".");
        System.out.println("Ano de Publicação: " + anoPublicacao + ".");
        System.out.println("----------------------------");
        System.out.println(); //Cria uma linha em branco.
    }

}