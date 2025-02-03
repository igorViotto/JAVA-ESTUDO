package com.agibank.semana03.aula0302.vetores;

import java.util.Scanner;

public class variacaodiaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dias = new int[5];
        int i;
        double crescimentoTotal = 0;

        for (i = 0; i < 5; i++) {
            System.out.print("Digite o valor da ação do dia " + (i + 1) + " : ");
            dias[i] = sc.nextInt();
        }

        for (i = 1; i < 5; i++){//todo, COMEÇA COM I = 1 PORQUE DEVE-SE COMEÇAR NO DIA 2, PARA PODER SUBTRAIR DO DIA ANTERIOR
            int valorAnterior = dias[i - 1];//todo, i - 1 dentro do Array subtrai uma casa
            int valorAtual = dias[i];

            double crescimentoDiario = (double) ((valorAtual - valorAnterior) / valorAnterior)* 100;
            crescimentoTotal += crescimentoDiario;
        }

        System.out.print("O crescimento percentual foi de: " + crescimentoTotal);


    }
}
