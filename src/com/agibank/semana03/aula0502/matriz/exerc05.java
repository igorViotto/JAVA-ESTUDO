package com.agibank.semana03.aula0502.matriz;
import java.util.Scanner;

public class exerc05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linha, coluna, numero;
        boolean encontrado = false;

        System.out.print("Quantas linhas a matriz tera: ");
        linha = sc.nextInt();

        System.out.print("Quantas colunas a matriz tera: ");
        coluna = sc.nextInt();

        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.printf("Matriz [%d][%d]: ", i, j);
                matriz[i][j]= sc.nextInt();
            }
        }
        System.out.println();

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0;  j < matriz[i].length; j++){
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.print("Escolha um numero inteiro para verificação na matriz: ");
        numero = sc.nextInt();

        System.out.print("\nPosicoes onde "+numero+" aparece: \n");
        for (int i = 0; i < linha; i++){
            for (int j = 0; j < coluna; j++){
                if (matriz[i][j] == numero){
                    System.out.printf("Os numeros estão presentes na linha %d e coluna %d\n", i, j);
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("O número " + numero + " não está presente na matriz.");
        }
    }
}
