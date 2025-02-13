package com.agibank.semana04.aula1202.exercicios;
import java.util.Scanner;

public class exerc02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

          try {
              double[] precoAcao = new double[5];
              double[] mediaMovel = new double[precoAcao.length - 2];

              for (int i = 0;  i < precoAcao.length; i++){
                  System.out.print("Qual sera o valor numero "+(i + 1)+" :\n");
                  precoAcao[i] = sc.nextDouble();
              }

              for (int i = 0; i < precoAcao.length - 2; i++){
                  mediaMovel[i] = (precoAcao[i] + precoAcao[i + 1] + precoAcao[i + 2]) / 3;
              }

              for (int i = 0;  i < mediaMovel.length; i++){
                  System.out.print("Média Móvel "+(i + 1)+":"+mediaMovel[i]);
                  System.out.println();
              }

          } catch (IllegalArgumentException e) {
              System.out.println("ERRO: Há menos de 3 valores informados.");
          }
    }
}