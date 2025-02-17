package com.agibank.mes01.semana03.aula0502.correcao;
import java.util.Scanner;

public class exerx07 {
    public static final String YE = "\u001B[33m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] acoes = {5000, 3000, 4000, 7000, 6000};
        double somaValores = 0;

        for (double num : acoes){
            somaValores += num;
        }

        System.out.print("O lucro total e: R$"+somaValores+"\n");

        for (int i = 0; i < acoes.length; i++){
            System.out.printf("%.2f%% / ",(acoes[i]/somaValores)*100);
        }

    }
}
