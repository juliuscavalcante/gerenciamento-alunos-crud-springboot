# Projeto CRUD Springboot

## Sobre o Projeto:

Uma aplicação web simples modelada no padrão MVC e construída com o Spring Boot, o projeto também conta com uma estrutura básica de CRUD, no qual os dados estão sendo persistidos em um banco de dados. O sistema possuí outras funcionalidades como, tela de login/cadastro, criptografia de dados do usuário, entre outras.
 
## Tecnologias Utilizadas

- Java
- Spring Boot
- JPA / Hibernate
- Maven
- HTML/CSS/JS
- Bootstrap
- MySQL

## Demo

![demo](https://user-images.githubusercontent.com/89096854/170026187-57aa04f4-189b-4c00-8cc8-16a1227a5eb7.gif)


## Instalação

O projeto é gerenciado pelo Maven, para usa-lo basta importa-lo para uma IDE.

## Configurações do banco de dados
Crie um banco de dados MySQL com o nome _academyspring_, abra o arquivo application.properties, localizado em src/main/resources/application.properties e adicione os seguintes comandos ao arquivo:

- spring.datasource.url = jdbc:mysql://localhost:3306/academyspring?useTimezone=true&serverTimezone=UTC
- spring.datasource.username = root
- spring.datasource.password = root
- spring.datasource.testWhileIdle = true
- spring.datasource.validationQuery = SELECT 1

## Execução
Execute o projeto através do IDE, abra um navegador de sua preferência e digite: http://localhost:8080
