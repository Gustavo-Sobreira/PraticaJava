//Escreva um programa em Java que verifique se uma palavra ou frase digitada pelo usuário é um palíndromo ou não. Um
//palíndromo é uma palavra, frase, número ou qualquer sequência de caracteres que permanece igual quando lida de
// trás para frente.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diga-me uma palavra ou frase, que te digo se é ou não um palíndrome: ");
        String frase = scanner.nextLine().toUpperCase();
        boolean ehPalindrome = verificaPalindromo(frase);

        if (ehPalindrome) {
            System.out.println("Palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }
    }

    public static boolean verificaPalindromo(String frase){
        int tamanhoFrase = frase.length();

        for (int i = 0; i < tamanhoFrase / 2; i++){
            char caracterFinal = frase.charAt(tamanhoFrase - i - 1);
            char caracterInicio = frase.charAt(i);

            if (caracterInicio != caracterFinal){
                return false;
            }
        }
        return true;
    }
}