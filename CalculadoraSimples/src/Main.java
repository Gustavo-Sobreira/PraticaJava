//Crie uma calculadora simples em Java que permita ao usuário realizar operações básicas de matemática,
//como adição, subtração, multiplicação e divisão. A calculadora deve ser capaz de ler dois números
//inteiros digitados pelo usuário, solicitar a operação desejada e exibir o resultado.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numerosParaOperaracao = new ArrayList<>();

        for (int i = 0; i < 2 ; i++){
            System.out.printf("Diga o " + (i + 1) + "° número da operação: ");
            int numeroRecebido = scanner.nextInt();
            numerosParaOperaracao.add(numeroRecebido);
        }

        double valorFinal = realizarOperacao(numerosParaOperaracao,scanner);
        System.out.printf("O resultado desta expressão é: %.2f%n", valorFinal);
    }

    public static double realizarOperacao(ArrayList<Integer> numerosParaOperaracao, Scanner scanner) throws Exception {

        System.out.println("""
                Qual será a operação realizada:\s
                [ + ] - Adição
                [ - ] - Subtração
                [ / ] - Divisão
                [ * ] - Multiplicação""");
        char tipoOperacao = scanner.next().charAt(0);

        switch (tipoOperacao){
            case '+':
                return numerosParaOperaracao.get(0) + numerosParaOperaracao.get(1);
            case '-':
                return numerosParaOperaracao.get(0) - numerosParaOperaracao.get(1);
            case '/':
                return  (double) numerosParaOperaracao.get(0) / numerosParaOperaracao.get(1);
            case '*':
                return numerosParaOperaracao.get(0) * numerosParaOperaracao.get(1);
            default:
                System.out.println("Opção inválida, por favor repita o sinal da operação que deseja.");
                return realizarOperacao(numerosParaOperaracao,scanner);
        }
    }
}