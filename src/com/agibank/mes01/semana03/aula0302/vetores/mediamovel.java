package com.agibank.mes01.semana03.aula0302.vetores;
import java.util.Scanner;

public class mediamovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] preco = new float[7];
        int i;

        for (i = 0; i < 7; i++){
            System.out.print("Preco do ativo no "+(i + 1)+"º dia: ");
            preco[i] = sc.nextFloat();
        }
            //todo, PEGAMOS OS 3 ULTIMOS VALORES PARA A MEDIA MOVEL((preco[4] + preco[5] + preco[6]) / 3)
            float mediaMovel = (preco[4] + preco[5] + preco[6]) / 3;
            System.out.printf("\nMédia móvel dos últimos 3 valores: %.2f", mediaMovel);//todo, uso de ',' após, não +
    }
}
