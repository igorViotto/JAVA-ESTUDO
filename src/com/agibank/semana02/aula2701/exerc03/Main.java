package com.agibank.semana02.aula2701.exerc03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float peso = 0;
        float altura = 0;
        float valorCalc;

        System.out.println("Entre com seu peso: ");
        peso = sc.nextFloat();

        System.out.println("Entre com a sua altura: ");
        altura = sc.nextFloat();

        valorCalc = peso / (altura * altura);

        if (valorCalc < 18.5) {
            System.out.println("Abaixo do peso!");
        } else if (valorCalc >= 18.5 && valorCalc < 24.9) {
            System.out.println("Peso normal");
        } else if (valorCalc >= 25 && valorCalc < 29.9) {
            System.out.println("Sobrepeso");
        } else if (valorCalc >= 30 && valorCalc < 34.9) {
            System.out.println("Obesidade Grau 1!");
        } else if (valorCalc >= 35 && valorCalc < 39.9) {
            System.out.println("Obesidade Grau 2!");
        } else if (valorCalc > 40) {
            System.out.println("Obesidade Grau 3!");
        } else {
            System.out.println("ERRO");
        }
    }
}
