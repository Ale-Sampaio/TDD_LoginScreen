package com.mycompany.loginscreen;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe responsável pela tela de login.
 *
 * Autor: Alexandre Sampaio
 * Versão: 1.0
 * Desde: release 1.0 da aplicação
 */
public class LoginScreen {

    // Banco de dados dos usuários
    private Map<String, String> userDatabase;

    /**
     * Construtor da classe LoginScreen.
     * Inicializa o banco de dados com alguns usuários de exemplo.
     */
    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("john", "password123");
        userDatabase.put("alice", "securepass");
    }

    /**
     * Verifica se um usuário pode fazer o login com as credenciais fornecidas.
     *
     * @param username Nome do usuário
     * @param password Senha do usuário
     * @return true se as credenciais estiverem corretas, false se estiverem incorretas
     */
    public boolean login(String username, String password) {
        return userDatabase.containsKey(username) && userDatabase.get(username).equals(password);
    }

    /**
     * Adiciona um novo usuário no banco de dados.
     *
     * @param username Nome do novo usuário
     * @param password Senha do novo usuário
     */
    public void addUser(String username, String password) {
        userDatabase.put(username, password);
    }
}
