# BookHub API

## Descrição

A BookHub API é uma aplicação desenvolvida em Java para uso pessoal, com o objetivo de gerenciar minhas leituras. Ela permite a inserção, edição e exclusão de registros de livros, gibis e fanfics.

## Tecnologias Utilizadas

* **Linguagem:** Java
* **Versão do Java:** 21.0.4 LTS
* **Ambiente de Execução:** Java(TM) SE Runtime Environment
* **Máquina Virtual:** Java HotSpot(TM) 64-Bit Server VM

## Funcionalidades

* **Inserção:** Adicione novos registros de livros, gibis ou fanfics ao seu acervo pessoal.
* **Edição:** Modifique informações de registros existentes, como título, autor, número de páginas, etc.
* **Exclusão:** Remova registros que você não precisa mais.

## Configuração e Execução

1.  **Pré-requisitos:**
    * Java Development Kit (JDK) versão 21.0.4 ou superior instalado.
    * Um ambiente de desenvolvimento integrado (IDE) como IntelliJ IDEA ou Eclipse (opcional).
2.  **Clonagem do Repositório:**
    * `git clone <URL do repositório>`
3.  **Compilação e Execução:**
    * Navegue até o diretório do projeto.
    * Utilize seu IDE para compilar e executar a aplicação Java.
    * Alternativamente, você pode compilar e executar a partir da linha de comando usando `javac` e `java`.

## Endpoints da API

* **Inserir Livro/Gibi/Fic:**
    * `POST /books`
    * Corpo da requisição: JSON com os dados do livro, gibi ou fic.
* **Editar Livro/Gibi/Fic:**
    * `PUT /books/{id}`
    * Corpo da requisição: JSON com os dados atualizados.
* **Excluir Livro/Gibi/Fic:**
    * `DELETE /books/{id}`
* **Listar Livros/Gibis/Fics:**
    * `GET /books`

## Exemplos de Uso

### Inserir 

### Editar 

### Deletar 

## Contribuição

## Licença 