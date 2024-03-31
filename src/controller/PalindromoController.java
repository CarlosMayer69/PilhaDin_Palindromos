package controller;

import br.edu.fateczl.pilhastrings.Pilha;

public class PalindromoController {

    public String invertePalavra(String palavra) {
    	
        Pilha pilha = new Pilha();
        StringBuilder invertida = new StringBuilder();

        // Empilhando os caracteres da palavra original
        for (int i = 0; i < palavra.length(); i++) {
            pilha.push(String.valueOf(palavra.charAt(i)));
        }

        // Desempilhando e construindo a palavra invertida
        while (!pilha.isEmpty()) {
            try {
                invertida.append(pilha.pop());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return invertida.toString();
    }

    public boolean comparaPalavras(String palavraOriginal, String palavraInvertida) {
        return palavraOriginal.equals(palavraInvertida);
    }
}
