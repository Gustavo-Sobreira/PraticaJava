//Escreva um programa em Java que solicite ao usuário que insira cinco números inteiros e, em seguida,
// calcule a média aritmética desses números.

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numerosPassadosPeloUsuario = new ArrayList<>();
        int valorTotal = 0;

        for (int i = 0; i < 5 ; i++){
            System.out.println("Diga o " + (i + 1) + "° número que deseja adicionar na lista: ");

            int numeroRecebido = scanner.nextInt();
            numerosPassadosPeloUsuario.add(numeroRecebido);
            valorTotal += numeroRecebido;
        }

        double mediaAritmetica = (double) valorTotal / (long) numerosPassadosPeloUsuario.size();
        System.out.printf("Média Aritmética: %.2f%n",mediaAritmetica);
    }
}