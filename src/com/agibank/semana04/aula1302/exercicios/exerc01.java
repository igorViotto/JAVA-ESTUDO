package com.agibank.semana04.aula1302.exercicios;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exerc01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] precosAcao = new float[5];

        for (int i = 0; i < precosAcao.length; i++) {
            while (true) {
                try {
                    System.out.print("\nQual o valor do preço " + (i + 1) + ": ");
                    precosAcao[i] = sc.nextFloat();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("ERRO: Digite um número válido!");
                    sc.next();
                }
            }
        }

        calculoRetornoDiario(precosAcao);

    }
    static void calculoRetornoDiario(float[] precosAcao){

        for (int i = precosAcao.length - 1; i > 0; i--){
           float calculoVariacao = ((precosAcao[i] - precosAcao[i - 1]) / precosAcao[i - 1]) * 100;
            System.out.printf("O retorno "+(i - 1)+": %.2f%n",calculoVariacao);
        }

    }
}
