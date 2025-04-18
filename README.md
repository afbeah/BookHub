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

## Estrutura do Projeto
O projeto foi refatorado para seguir uma arquitetura mais organizada e modular:

* **Pacote `Model`:** Contém as classes que representam os dados da aplicação `Livro`, `Gibi` e `Fanfic`.
* **Pacote `Service`:** Contém a lógica de negócios, com classes responsáveis por manipular os dados dos livros, gibis e fanfics.
* **Pacote `App`:** Contém a classe principal (Main) que interage com o usuário e utiliza os serviços para realizar as operações.

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

## Contribuição
Este projeto é de uso pessoal e não está aberto para contribuições externas no momento. No entanto, sugestões e melhorias são bem-vindas. Sinta-se à vontade para abrir uma issue ou enviar um pull request com suas propostas.

## Licença 

Este projeto é de uso pessoal e não possui uma licença formal. O código é disponibilizado "como está", sem garantias de qualquer tipo.