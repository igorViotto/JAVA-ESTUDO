package com.agibank.mes01.semana03.aula0302.vetores;

import java.util.Scanner;

public class maiormenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = new int[10];
        int i;

        for (i = 0; i < 10; i++) {
            System.out.print("Informe o valor do mes " + (i + 1) + " : ");
            v[i] = sc.nextInt();
        }

        int maior = v[0];
        int menor = v[0];

        for (i = 1; i < 10; i++) {
            if (v[i] > maior) {
                maior = v[i];
            }
            if (v[i] < menor) {
                menor = v[i];
            }
        }

        System.out.println("\nO maior preco atingido é: " + maior);
        System.out.println("O menor preco atingido é: " + menor);
        sc.close();
    }
}
