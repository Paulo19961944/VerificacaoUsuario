package com.github.www;
import java.util.Scanner;

public class VerificacaoUsuario {
    public static void main(String[] args) {
        
    	
    	// Chama o Scanner
    	Scanner scanner = new Scanner(System.in);
    	
    	// Nomes dos Usuários
        String usuario1 = "Paulo";
        String usuario2 = "Bianca";
        String usuario3 = "Henrique";

        
        // Imprime os nomes dos Usuários na Tela
        System.out.print("Digite o nome de usuario 1: ");
        String inputUsuario1 = scanner.nextLine().trim(); // Remover espaços em branco

        System.out.print("Digite o nome de usuario 2: ");
        String inputUsuario2 = scanner.nextLine().trim(); // Remover espaços em branco

        System.out.print("Digite o nome de usuario 3: ");
        String inputUsuario3 = scanner.nextLine().trim(); // Remover espaços em branco

        
        // Acesso Autorizado se o Usuário for Verdadeiro
        if (inputUsuario1.equals(usuario1)) {
            System.out.println("Usuario 1 autorizado");
        } else {
            System.out.println("Usuario 1 negado");
        }

        if (inputUsuario2.equals(usuario2)) {
            System.out.println("Usuario 2 autorizado");
        } else {
            System.out.println("Usuario 2 negado");
        }

        if (inputUsuario3.equals(usuario3)) {
            System.out.println("Usuario 3 autorizado");
        } else {
            System.out.println("Usuario 3 negado");
        }
    }
}
