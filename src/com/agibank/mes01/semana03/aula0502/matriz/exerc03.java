package com.agibank.mes01.semana03.aula0502.matriz;
import  java.util.Scanner;

public class exerc03 {
    public static final String YE = "\u001B[33m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linha, coluna;

        do {
            System.out.print("A matriz precisa ser quadrada! (3;3 - 4;4 - 5;5 ...)\n");
            System.out.print("Quantas linhas a matriz tera: ");
            linha = sc.nextInt();

            System.out.print("Quantas colunas a matriz tera: ");
            coluna = sc.nextInt();
        }while (linha != coluna);


        int[][] matriz = new int[linha][coluna];


        for (int i =0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.printf("Matriz[%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println();


        for (int i = 0; i < matriz.length; i++){
            for (int j = 0;  j < matriz.length; j++){
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();


        System.out.print("\nA diagonal principal é: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(YE+matriz[i][i] + " ");
        }


    }
}
