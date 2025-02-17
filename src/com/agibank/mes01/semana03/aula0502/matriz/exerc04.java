package com.agibank.mes01.semana03.aula0502.matriz;
import java.util.Scanner;

public class exerc04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linha, coluna;

        do {
            System.out.print("Nessa matriz, as linhas e colunas devem ser diferente:\n\n");

            System.out.print("Quantas linhas a matriz tera: ");
            linha = sc.nextInt();

            System.out.print("Quantas colunas o programa tera: ");
            coluna = sc.nextInt();
        }while (linha == coluna);

        int[][] matriz = new int[linha][coluna];
        int[][] transposta = new int[coluna][linha];

        for (int i = 0; i < linha; i++){
            for (int j = 0; j < coluna; j++){
                System.out.printf("Matriz [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.print("Matriz comum: \n");

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0;  j < matriz[i].length; j++){
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.print("Matriz transposta: \n");

        for (int i = 0; i < coluna; i++){
            for (int j = 0; j < linha; j++){
                System.out.printf("%4d", transposta[i][j]);
            }
            System.out.println();
        }

    }
}
