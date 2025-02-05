package com.agibank.semana03.aula0502.matriz;
import  java.util.Scanner;

public class exerc02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = {
                {2,3,4,5},
                {6,7,8,9},
                {10,11,12,13},
                {14,15,16,17}
        };

        int[] somaLine = new int[4];
        int[] somaColun = new int[4];
        int somaTotal = 0;

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                somaLine[linha] += matriz[linha][coluna];
                somaColun[coluna] += matriz[linha][coluna];
                somaTotal += matriz[linha][coluna];
            }
        }


        for (int i = 0; i < 4; i++){
            System.out.println();
            System.out.printf("A soma dos elementos da linha "+(i+1)+" = "+ somaLine[i]);
            System.out.println();
            System.out.print("A soma dos elementos da coluna "+(i+1)+" = "+somaColun[i]);
            System.out.println();
        }
        System.out.print("\nA soma total dos elementos da matriz e de: "+somaTotal);
    }
}
