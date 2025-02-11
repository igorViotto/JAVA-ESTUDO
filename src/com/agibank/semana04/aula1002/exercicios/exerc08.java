package com.agibank.semana04.aula1002.exercicios;

import java.util.Scanner;

public class exerc08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Defina seu capital para o cálculo: "); float capitalInicial = sc.nextFloat();

        System.out.print("Defina a taxa mensal: "); float taxaMensal = sc.nextFloat();

        System.out.print("Defina a quantidade de meses: "); int meses = sc.nextInt();

        double montanteFinal = calcularJurosCompostos(capitalInicial, taxaMensal, meses);

        System.out.printf("Montante Final: R$ %.2f%n", montanteFinal);

    }
    static double calcularJurosCompostos(float capitalInicial, float taxaMensal, int meses){
        double montanteFinal = 0;

        montanteFinal = capitalInicial * Math.pow((1 + taxaMensal), meses);

        return montanteFinal;
    }
}
