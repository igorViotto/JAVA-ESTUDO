package com.agibank.semana02.aula2701.exerc02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.printf("Escolha um numero inteiro: ");
        num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("O numero "+ num +" e par");
        } else {
            System.out.println("O numero "+ num +" e impar");
        }
    }
}
