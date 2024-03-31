package view;

import java.util.Scanner;

import controller.PalindromoController;

public class Principal {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromoController palindromoController = new PalindromoController();

        System.out.println("Insira uma palavra para verificar se � um pal�ndromo:");
        String palavra = scanner.nextLine();

        String palavraInvertida = palindromoController.invertePalavra(palavra);

        boolean isPalindromo = palindromoController.comparaPalavras(palavra, palavraInvertida);

        if (isPalindromo) {
            System.out.println("A palavra '" + palavra + "' � um pal�ndromo.");
        } else {
            System.out.println("A palavra '" + palavra + "' n�o � um pal�ndromo.");
        }

        scanner.close();
    }
}
