# TDD - LoginScreen

Este repositório apresenta um sistema de autenticação básico implementado na classe `LoginScreen` utilizando Test-Driven Development (TDD).

## Funcionalidades Principais

A classe `LoginScreen` oferece duas funcionalidades principais:

- `login(String username, String password)`: Tenta autenticar um usuário com as credenciais fornecidas. Retorna `true` se a autenticação for bem-sucedida e `false` caso contrário.
- `addUser(String username, String password)`: Adiciona um novo usuário ao banco de dados.

## Banco de Dados de Usuários

O banco de dados de usuários é simulado usando um `HashMap`, onde as chaves representam os nomes de usuário e os valores são as senhas correspondentes. Alguns usuários de exemplo são incluídos no banco de dados durante a inicialização da classe.

## Testes de Funcionalidade

A classe de teste `LoginScreenTest` contém testes JUnit para garantir o funcionamento correto das funcionalidades da classe `LoginScreen`. Os testes incluem:

- `testSuccessfulAuthentication()`: Verifica se a autenticação é bem-sucedida com credenciais corretas.
- `testFailedAuthentication()`: Verifica se a autenticação falha com credenciais incorretas.
- `testRegisterUser()`: Verifica se um novo usuário pode ser registrado no banco de dados e se é possível autenticar com as credenciais desse novo usuário.

## Configuração e Execução dos Testes

Para executar os testes com sucesso, certifique-se de configurar o framework JUnit em seu ambiente de desenvolvimento. Aqui estão os passos básicos para configurar e executar os testes:

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/tdd-loginscreen.git
   cd tdd-loginscreen
