package com.agibank.semana04.exercicios;
import java.util.Arrays;
import  java.util.Scanner;

public class exerc04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] precos = {100.0, 102.0, 101.0, 103.0, 105.0};
        int intervalo = 3;
        double[] resultado = calcularMediaMovel(precos, intervalo);
        System.out.println("Média móvel: "+Arrays.toString(resultado));

    }
    static double[] calcularMediaMovel(double[] precos, int intervalo){
        double[] medias = new double[precos.length - intervalo + 1];
        for (int i = 0; i < medias.length; i++){
            double soma = 0;
            for (int j = 0; j < intervalo; j++){
                soma += precos[i + j];
            }
            medias[i] = soma / intervalo;
        }
        return medias;
    }
}
