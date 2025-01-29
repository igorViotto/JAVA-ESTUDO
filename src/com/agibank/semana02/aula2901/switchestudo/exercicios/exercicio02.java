package com.agibank.semana02.aula2901.switchestudo.exercicios;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo (N): ");
        int N = sc.nextInt();

        if (N < 1) {
            System.out.println("Por favor, insira um número inteiro positivo.");
        } else {
            int soma = 0;
            int numeroImpar = 1;

            System.out.print("Soma dos primeiros " + N + " números ímpares: ");

            for (int i = 0; i < N; i++) {
                soma += numeroImpar;
                System.out.print(numeroImpar);

                if (i < N - 1) {
                    System.out.print(" + ");
                }

                numeroImpar += 2;
            }

            System.out.println(" = " + soma);
            System.out.println("O quadrado de " + N + " é: " + soma);
        }

        sc.close();

    }
}
