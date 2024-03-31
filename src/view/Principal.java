package view;

import java.util.Scanner;

import controller.PalindromoController;

public class Principal {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromoController palindromoController = new PalindromoController();

        System.out.println("Insira uma palavra para verificar se é um palíndromo:");
        String palavra = scanner.nextLine();

        String palavraInvertida = palindromoController.invertePalavra(palavra);

        boolean isPalindromo = palindromoController.comparaPalavras(palavra, palavraInvertida);

        if (isPalindromo) {
            System.out.println("A palavra '" + palavra + "' é um palíndromo.");
        } else {
            System.out.println("A palavra '" + palavra + "' não é um palíndromo.");
        }

        scanner.close();
    }
}
