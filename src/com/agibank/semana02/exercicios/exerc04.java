package com.agibank.semana02.exercicios;
import java.util.Scanner;

public class exerc04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um numero para descobrir o seu FATORIAL: ");
        int numFat = sc.nextInt();

        System.out.printf("Fatores primos de " + numFat + "! = ");

        for (int i = 2; i <= numFat; i++){
            while (numFat % i == 0){
                System.out.printf(i+" ");
                numFat /= i;
            }
        }

    }
}
