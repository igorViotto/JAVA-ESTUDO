package com.agibank.mes01.semana04.aula1302.exercicios;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exerc02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] mediaGastoMensal = new float[12];
        float mediaTotalGastos = 0, media;
        int  mesesAcimaMedia = 0;


        for (int i = 0; i < mediaGastoMensal.length; i++) {
            while (true){
                try {

                    System.out.print("Entre com o valor " + (i + 1) + ": ");
                    mediaGastoMensal[i] = sc.nextInt();
                    break;

                } catch (InputMismatchException e) {
                    System.out.println("ERRO: Entrada inválida! Entre com um valor: (R%XXX,XX) ");
                    sc.next();
                }
            }
        }

        for (int i = 0; i < mediaGastoMensal.length; i++){
            mediaTotalGastos += mediaGastoMensal[i];
        }

        media = mediaTotalGastos / 12;

        for (int i = 0; i < mediaGastoMensal.length; i++){
            if (mediaGastoMensal[i] > media){
                mesesAcimaMedia++;
            }
        }

        System.out.println();
        System.out.print("Meses acima da média: "+mesesAcimaMedia+"\n");
        System.out.printf("A media de gastos e de: %.2f", media);
    }
}
