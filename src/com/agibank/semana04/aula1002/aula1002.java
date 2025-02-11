package com.agibank.semana04.aula1002;
import java.util.Scanner;

public class aula1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha um numero para tabuada: ");
        int numero = sc.nextInt();

        Tabuada(numero);

    }
    static void Tabuada(int numero){
        System.out.print("Tabuada do numero "+ numero+"\n");

        for (int i = 1; i <= 10; i++){
            System.out.println(numero +" x "+ i +" = " + (numero * i));
        }
    }

}


