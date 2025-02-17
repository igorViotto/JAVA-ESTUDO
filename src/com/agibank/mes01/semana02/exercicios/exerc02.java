package com.agibank.mes01.semana02.exercicios;
import java.util.Scanner;

public class exerc02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numEnter = sc.nextInt();

        if (numEnter < 1) {
            System.out.println("Por favor, insira um número inteiro positivo.");
        } else {
            int soma = 0;
            int numeroImpar = 1;

            System.out.print("Soma dos primeiros " + numEnter + " números ímpares: ");

            for (int i = 0; i < numEnter; i++) {
                soma = soma + numeroImpar;
                System.out.print(numeroImpar);

                System.out.print(" + ");

                numeroImpar += 2;
            }

            System.out.println(" = " + soma);
            System.out.println("O quadrado de " + numEnter + " é: " + soma);
        }

        sc.close();

    }
}
