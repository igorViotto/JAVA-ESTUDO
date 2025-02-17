package com.agibank.semana05.aula1702.exercicios50;

import java.util.Scanner;

public class exerc02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dinheiro:");
        double dinheiro = sc.nextDouble();

        System.out.print("taxa de juros:");
        double taxaJuros = sc.nextDouble() / 100;

        System.out.print("Tempo em meses:");
        int tempoMeses = sc.nextInt();

        double calcJurosCompostos = dinheiro * Math.pow((1 + taxaJuros), tempoMeses);

        System.out.printf("O montante final será: %.2f", calcJurosCompostos);
    }
}
