package app;

import biblioteca.Livro;

public class Main {
    public static void main(String[] args){
        Livro livro1 = new Livro("Pink Lemonade", "G.B. Baldassari", 2025 );
        livro1.adicionarResenha("Um dos livros mais legais que já li! Trata com cuidado os sacrificios que algumas pessoas fazem por amor.", 4.8);
        Livro livro2 = new Livro ("De repente Namoradas", "G.B Baldassari", 2024);
        Livro livro3 = new Livro ("The Guardian", "Natália Moreira", 2020);

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
        livro3.exibirDetalhes();
    }
}