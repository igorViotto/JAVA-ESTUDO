package com.agibank.semana03.aula0302.vetores;

import java.util.Scanner;

public class mercadoemalta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] precos = new float[10];
        double contador = 0;//todo, DIAS CONSECUTIVOS.
        boolean tendencia = false;//todo, TENDENCIA TRUE OR FALSE.
        int i;

        for (i = 0; i < 10; i++) {
            System.out.print("Preço da ação dia " + (i + 1) + " : ");
            precos[i] = sc.nextFloat();
        }

        for (i = 1; i < 10; i++) {
            if (precos[i] > precos[i - 1]) {
                contador++;
                if (contador >= 2) {
                    tendencia = true;
                    break;
                }
            }else {
                contador = 0;
            }
        }
        if (tendencia){
            System.out.print("\nA tendencia dos preços das ações e subir!");
        }else {
            System.out.print("\nSem tendência de alta identificada.");
        }

    }
}
