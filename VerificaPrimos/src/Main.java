//Escreva um programa em Java que verifique se um número inteiro digitado pelo usuário é um número primo ou não.
// Um número primo é aquele que é divisível apenas por 1 e por ele mesmo.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroRecebido = receberNumero();
        verificarSeNumeroPrimo(numeroRecebido);

    }

    public static int receberNumero(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diga um número que deseja verificar se é primo: ");
        try {
            return scanner.nextInt();
        }catch (Exception e){
            System.out.println("Por favor digite um número!");
            return receberNumero();
        }
    }

    public static void verificarSeNumeroPrimo(int numero){

        for (int i = 2; i <= (numero/2); i++){
            if(numero % i == 0 ){
                System.out.println("Não é primo");
                return;
            }
        }
        System.out.println("Primo");
    }
}