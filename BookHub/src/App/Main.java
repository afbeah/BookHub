package App;

import Biblioteca.Livros;

public class Main {
    public static void main(String[] args){
        Livros livro1 = new Livros("Pink Lemonade", "G.B. Baldassari", 2025, "Independente" );
        Livros livro2 = new Livros ("De repente Namoradas", "G.B Baldassari", 2024, "Independente");
        Livros livro3 = new Livros ("The Guardian", "Natália Moreira", 2020, "Independente");
        livro3.adicionarResenha("Eu amei ler esse livro antes mesmo dele ser livro kkkk, quando li a fic original já fiquei apaixonada.", 5);

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
        livro3.exibirDetalhes();
    }
}