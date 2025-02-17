package com.agibank.semana05.aula1702.exercicios50;

import java.util.Scanner;

public class exerc01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float capitalInicial = 0;
        float taxaJuros = 0;
        int meses = 0;

        System.out.print("Qual a quantia total que voçe possui?:");
        capitalInicial = sc.nextFloat();

        System.out.print("Qual será a taxa de juros?:");
        taxaJuros = sc.nextFloat() / 100;

        System.out.print("Quantos tempo em meses serão?:");
        meses = sc.nextInt();

        float montanteFinal = capitalInicial + (capitalInicial * taxaJuros * meses);

        System.out.println();
        System.out.printf("O montante final ganhado é de : %.2f", montanteFinal);

    }


}


