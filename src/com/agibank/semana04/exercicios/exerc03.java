package com.agibank.semana04.exercicios;
import java.util.Scanner;

public class exerc03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o valor do dia 1: ");
        float d1 = sc.nextFloat();

        System.out.print("Qual o valor do dia 2: ");
        float d2 = sc.nextFloat();

        float crescimento = CalcularCrescimento(d1, d2);

        System.out.print("Crescimento: " + crescimento);

    }
    static float CalcularCrescimento(float d1, float d2){

        return (d2 - d1) / d1 * 100;
    }
}
