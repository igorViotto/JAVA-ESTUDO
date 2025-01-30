package com.agibank.semana02.aula2901.switchestudo.exercicios;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTab;
        int num;
        int result;

        do {
            System.out.print("Escolha um numero para ver a tabuada: ");
            numTab = sc.nextInt();

            if (numTab < 0){
                System.out.print("Escolha um numero inteiro positivo!\n");
            }
        } while (numTab < 0);
            for (num = 1; num <= 10; num++){
                result = numTab * num;
                System.out.printf(numTab+" X "+num+" = "+result+"\n");
            }


    }
}
