package com.agibank.semana05.aula1702.exercicios50;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exerc03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.print("Qual a taxa do câmbio do dia: ");
            float taxaCambio = sc.nextFloat();

            System.out.print("Valor em reais: R$");
            float valorReais = sc.nextFloat() / taxaCambio;

            System.out.println();
            System.out.print("Convertido como câmbio atual, o valor em dólar é: $"+ valorReais);

        }catch (InputMismatchException e){
            System.out.println("ERRO: Informe valores reais, exp: (R$ 500,00 OU $5,00)");
            System.out.print("Carregue o programa novamente se quiser continuar!");
        }


    }
}
