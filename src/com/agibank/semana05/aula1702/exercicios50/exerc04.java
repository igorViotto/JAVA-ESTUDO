package com.agibank.semana05.aula1702.exercicios50;

import java.util.Scanner;

public class exerc04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("valor do empréstimo: ");
        double valorEmprestimo = sc.nextFloat();

        System.out.print("Quantas parcelas serão? ");
        int qtdParcelas = sc.nextInt();

        System.out.print("Qual a taxa de juros mensal? ");
        double taxaJuros_mensal = sc.nextFloat() / 100;

        double valorParcelas = (valorEmprestimo * taxaJuros_mensal) / (1 - Math.pow(1 + taxaJuros_mensal, -qtdParcelas));

        System.out.println();
        System.out.printf("O valor das parcelas será de %.2f", valorParcelas);

    }
}
