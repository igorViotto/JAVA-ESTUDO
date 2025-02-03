package com.agibank.semana03.aula0302.vetores;

import java.util.Scanner;

public class maiormenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        int[] v = new int[n];
        int i;

        for (i = 0; i < n; i++) {
            System.out.print("Informe " + (i + 1) + " valor: ");
            v[i] = sc.nextInt();
        }

        int maior = v[0];
        int menor = v[0];

        for (i = 1; i < n; i++) {
            if (v[i] > maior) {
                maior = v[i];
            }
            if (v[i] < menor) {
                menor = v[i];
            }
        }

        System.out.println("\nO maior preco atingido eh: " + maior);
        System.out.println("O menor preco atingido eh: " + menor);

        sc.close();
    }
}
