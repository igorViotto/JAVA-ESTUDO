package com.agibank.semana04.aula1402;
import java.util.Scanner;

public class maratona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[][] tabelaInvestimento = {{22.5f, 23.0f, 22.0f, 24.5f, 25.0f},
                                        {85.0f, 86.5f, 84.0f, 83.5f, 87.0f},
                                        {30.0f, 29.5f, 30.5f, 31.0f, 32.5f}};



    }

    static float calcMedia(float tabelaInvestimento[][]) {
        Scanner sc = new Scanner(System.in);

        int l = tabelaInvestimento.length;

        System.out.print("Ver media de qual ativo: ");
        l = sc.nextInt();

        float media, calculo = 0;

        for (int c = 0; c < tabelaInvestimento[l].length; c++){
            calculo += tabelaInvestimento[l][c];
        }
        media = calculo/5;

        return media;
    }

//    static int ativValorizacao(float tabelaInvestimento[][]){
//        int maiorAtivo;
//        float calculo = 0, variacao;
//
//        int l = tabelaInvestimento.length;
//
//        for (int c = 0; c < tabelaInvestimento[l].length; c++){
//            calculo += tabelaInvestimento[l][c];
//        }
//    }

    public static void lucroPerda(float tabelaInvestimento[][]){
        System.out.print("Lucro/perda de cada ativo: ");
        float calcSoma = 0, maiorInvestimento;

        for (int i = 0; i < tabelaInvestimento.length; i++){
            double lucroPercentual = ((tabelaInvestimento[i][tabelaInvestimento[i].length - 1] - tabelaInvestimento[i][0]) * 100);
        }

    }




}
