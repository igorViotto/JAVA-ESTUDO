package com.agibank.mes01.semana02.aula3101.esquenta;

import java.util.Scanner;

public class exerc04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorTotal = 0;
        int valorConverter, conversao;

        while (valorTotal < 1000) {
            System.out.print("Digite o valor a converter (Negativo para sair): ");
            valorConverter = sc.nextInt();

            if (valorConverter < 0) {
                System.out.println("Operação encerrada.");
                break;
            }

            if (valorTotal + valorConverter > 1000) {
                System.out.println("[ERRO] Conversão ultrapassa o limite de 1000 R$. Operação encerrada.");
                break;
            }

            conversao = valorConverter / 5;
            System.out.println("\nVocê receberá: " + conversao + " USD");

            valorTotal += valorConverter;
            System.out.println("Total convertido agora: " + valorTotal + " R$");
        }
        System.out.println("Conversão finalizada. Valor total convertido: " + valorTotal + " R$.");
        sc.close();
    }
}
