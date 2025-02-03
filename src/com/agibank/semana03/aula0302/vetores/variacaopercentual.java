package com.agibank.semana03.aula0302.vetores;
import java.util.Scanner;

public class variacaopercentual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] preco = new float[5];
        int i;
        float variacao = 0;

        for (i = 0; i < 5; i++){
            System.out.print("Digite o preço da ação do dia "+(i+1)+" : ");
            preco[i] = sc.nextFloat();
        }

        System.out.println("\nVariações diárias:");

        for (i = 1; i < 5; i++){
            variacao = ((preco[i] - preco[i - 1]) / preco[i - 1]) * 100;

            System.out.printf("Dia %d: %.2f%%\n", i + 1, variacao);
        }

    }
}
