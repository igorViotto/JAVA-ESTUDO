package com.agibank.semana04.exercicios;
import java.util.Scanner;

public class exerc01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float reais, cotacaoDolar, resultado;

        System.out.print("Valor em reais: ");
        reais = sc.nextFloat();

        System.out.print("Cotação dólar: ");
        cotacaoDolar = sc.nextFloat();

        resultado = ConverterMoeda(reais, cotacaoDolar);

        System.out.printf("R$ %.2f reais equivalem a %.2f dólares.%n", reais, resultado);

    }

    static float ConverterMoeda (float reais, float cotacaoDolar){
        return  reais / cotacaoDolar;
    }
}
