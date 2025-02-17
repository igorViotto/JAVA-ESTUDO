package com.agibank.mes01.semana02.aula2701.exerc01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("Escolha um numero inteiro:");
            float num = sc.nextFloat();

            if (num == 0) {
                System.out.println("Numero 0!\n");
            } else if (num > 0) {
                System.out.println("Numero Positivo!\n");
            } else if (num < 0) {
                System.out.println("Numero negativo!\n");
            }
        }

    }
}