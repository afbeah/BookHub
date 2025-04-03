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

    //Getters
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public String getEditora(){
        return editora;
    }

    public Resenha getResenha(){
        return resenha;
    }

    //Setters
    public void setTitulo(String titulo){
        if(titulo != null && !titulo.isEmpty()){
            this.titulo = titulo;
        } else {
            System.out.println("Título inválido!");
        }
    }

    public void setAutor(String autor){
        if(autor != null && !autor.isEmpty()){
            this.autor = autor;
        } else {
            System.out.println("Autor inválido!");
        }
    }

    public void setAnoPublicacao(int anoPublicacao){
        if(anoPublicacao > 0){
            this.anoPublicacao = anoPublicacao;
        } else {
            System.out.println("Ano de Publicação inválido!");
            this.anoPublicacao = 0;
        }
    }

    public void setEditora(String editora){
        if(editora != null && editora.isEmpty()){
            this.editora = editora;
        } else {
            System.out.println("Editora Inválida!");
        }
    }


    @Override
    public void exibirDetalhes(){
        System.out.println("Titulo: " + titulo + ".");
        System.out.println("Autor: " + autor + ".");
        System.out.println("Ano de Publicação: " +(anoPublicacao > 0 ? anoPublicacao : "Desconhecido") + ".");
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