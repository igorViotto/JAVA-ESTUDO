package com.agibank.mes01.semana03.aula0502.matriz;
import java.util.Scanner;

public class exerc01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][4];

        for (int i =0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.printf("Matriz[%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nMatriz digitada: \n");
        for (int i =0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

    }
}
