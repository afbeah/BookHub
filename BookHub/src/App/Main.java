package App;

import Model.Livros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Livros> listaLivros = new ArrayList<>();
        int opcao;

        do{
            System.out.println("\n===> MENU <===");
            System.out.println("1. Cadastrar novo livro.");
            System.out.println("2. Listar todos os livros.");
            System.out.println("3. Adicionar resenha ao livro.");
            System.out.println("4. Editar Informações do livro.");
            System.out.println("5. Deletar");
            System.out.println("6. Sair.");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.println("Autor: ");
                    String autor = scanner.nextLine();

                    System.out.println("Ano de Publicação: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Editora: ");
                    String editora = scanner.nextLine();

                    Livros novoLivro = new Livros(titulo, autor, ano, editora);
                    listaLivros.add(novoLivro);
                    System.out.println("Livro cadastrado com sucesso!");
                    break;

                case 2:
                    if(listaLivros.isEmpty()){
                        System.out.println("Nenhum livro cadastrado.");
                    } else {
                        System.out.println("\n=== LISTA DE LIVROS ===");
                        for(int i = 0; i < listaLivros.size(); i++){
                            System.out.println("ID: " + i + ":");
                            listaLivros.get(i).exibirDetalhes();
                        }
                    }
                    break;

                case 3:
                    if(listaLivros.isEmpty()){
                        System.out.println("Nenhum livro disponível para adicionar resenha.");
                    } else {
                        System.out.println("=== LIVROS DISPONÍVEIS ===");
                        for(int i = 0; i < listaLivros.size(); i++){
                            System.out.println("ID: " + i + " - " + listaLivros.get(i).getTitulo());
                        }

                        System.out.print("Digite o ID do livro para adicionar resenha: ");
                        int idLivro = scanner.nextInt();
                        scanner.nextLine();

                        if(idLivro >= 0 && idLivro < listaLivros.size()){
                            System.out.println("Digite a resenha: ");
                            String texto = scanner.nextLine();

                            System.out.println("Insira a nota de 0 a 5: ");
                            double nota = scanner.nextDouble();
                            scanner.nextLine();

                            listaLivros.get(idLivro).adicionarResenha(texto, nota);
                            System.out.println("Resenha adicionada com sucesso!");
                        } else {
                            System.out.println("ID inválido!");
                        }
                    }
                    break;

                case 4:
                    if (listaLivros.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado.");
                        break;
                    }

                    System.out.print("Digite o ID do livro que deseja editar: ");
                    int idEditar = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer

                    if (idEditar >= 0 && idEditar < listaLivros.size()) {
                        Livros livroParaEditar = listaLivros.get(idEditar);

                        System.out.println("\nInformações atuais do livro:");
                        livroParaEditar.exibirDetalhes();

                        System.out.println("\nDigite as novas informações (pressione ENTER para manter o valor atual):");

                        System.out.print("Novo título: ");
                        String novoTitulo = scanner.nextLine();
                        if (!novoTitulo.isEmpty()) {
                            livroParaEditar.setTitulo(novoTitulo);
                        }

                        System.out.print("Novo autor: ");
                        String novoAutor = scanner.nextLine();
                        if (!novoAutor.isEmpty()) {
                            livroParaEditar.setAutor(novoAutor);
                        }

                        System.out.print("Novo ano de publicação: ");
                        String anoStr = scanner.nextLine();
                        if (!anoStr.isEmpty()) {
                            try {
                                int novoAno = Integer.parseInt(anoStr);
                                livroParaEditar.setAnoPublicacao(novoAno);
                            } catch (NumberFormatException e) {
                                System.out.println("Ano inválido. Mantendo o valor atual.");
                            }
                        }

                        System.out.print("Nova editora: ");
                        String novaEditora = scanner.nextLine();
                        if (!novaEditora.isEmpty()) {
                            livroParaEditar.setEditora(novaEditora);
                        }

                        System.out.println("Informações do livro atualizadas com sucesso!");
                    } else {
                        System.out.println("ID inválido.");
                    }
                    break;



                case 5:
                    if(listaLivros.isEmpty()){
                        System.out.println("Nenhum livro selecionado para deletar.");
                    }

                    System.out.println("Digite o ID do livro que deseja deletar:");
                    int idDeletar = scanner.nextInt();
                    scanner.nextLine();

                    if(idDeletar >= 0 && idDeletar < listaLivros.size()){
                        Livros livroParaDeletar = listaLivros.get(idDeletar);
                        System.out.println("\nVocê selecionou o seguinte livro: ");
                        livroParaDeletar.exibirDetalhes();

                        System.out.println("Certeza que deseja deletar?");
                        String confirmacao = scanner.nextLine();

                        if (confirmacao.equalsIgnoreCase("s")) {
                            listaLivros.remove(idDeletar);

                            System.out.println("Livro removido!");
                        } else {
                            System.out.println("Operação cancelada!");
                        }

                    } else {
                        System.out.println("ID Inválido!");
                    }
                    break;

                case 6:
                    System.out.println("Saindo do programa.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while(opcao != 6);

        scanner.close();

    }
}