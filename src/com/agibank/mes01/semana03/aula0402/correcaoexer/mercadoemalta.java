package com.agibank.mes01.semana03.aula0402.correcaoexer;
import java.util.Scanner;

public class mercadoemalta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] precos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int diaPrim, diaUlt;

        for (int i = 0; i < precos.length - 2; i++){
            if (precos[i] < precos[i + 1] && precos[i + 1] < precos[i + 2]){
                diaPrim = i+1;
                i = i + 2;
                while (precos[i] < precos[i + 1]){
                    i++;
                    if (i == precos.length - 1){
                        break;
                    }
                }
                diaUlt = i+1;
                System.out.printf("\nTendencia entre os dias %d e %d", diaPrim, diaUlt);
                break;

            }
        }
    }
}
