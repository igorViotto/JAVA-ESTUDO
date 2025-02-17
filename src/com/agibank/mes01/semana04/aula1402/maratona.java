package com.agibank.mes01.semana04.aula1402;
import java.util.Scanner;

public class maratona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[][] precos = {{22.5f, 23.0f, 22.0f, 24.5f, 25.0f},
                           {85.0f, 86.5f, 84.0f, 83.5f, 87.0f},
                           {30.0f, 29.5f, 30.5f, 31.0f, 32.5f}};

        System.out.print("Media: "+calcMedia(precos));
        System.out.println();

        int maiorValorizacaoIndex = maiorVariacao(precos);
        System.out.println("Ativo com maior valorização, Ativo " + (maiorValorizacaoIndex));

        System.out.println();


    }

    static float calcMedia(float precos[][]) {
        Scanner sc = new Scanner(System.in);

        float media, calculo = 0;
        int l = precos.length;

        System.out.print("Ver media de qual ativo: ");
        l = sc.nextInt();

        for (int c = 0; c < precos[l].length; c++) {
              calculo += precos[l][c];
        }
        media = calculo / 5;

        return media;
    }

    static int maiorVariacao(float precos[][]) {
        float variacao = 0;
        int index = 0;

        for (int l = 0; l < precos.length; l++) {
            float min = precos[l][0];
            float max = precos[l][0];

            for (int c = 1; c < precos[l].length; c++) {
                if (precos[l][c] < min) min = precos[l][c];
                if (precos[l][c] > max) max = precos[l][c];

            }
            float variacaoLinha = (max - min);

            if (variacaoLinha > variacao) {
                variacao = variacaoLinha;
                index = l;
            }
        }

        return index;
    }


}
