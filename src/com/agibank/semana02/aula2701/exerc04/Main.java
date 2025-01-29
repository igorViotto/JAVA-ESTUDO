package com.agibank.semana02.aula2701.exerc04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Entre com um valor: ");
        float valor = sc.nextFloat();

        System.out.printf("Entre com a media desejada para o calculo: ");
        float media = sc.nextFloat();

        sc.close();

        float subValor_media = Math.abs(valor - media);
        float porcentagem = (subValor_media / media) * 100;

        if (valor - media == 0){
            System.out.println("O valor é 100% próximo da media");
        } else if (valor - media != 0) {
            System.out.printf("A aproximação da media e %.2f%%", porcentagem);
        }



    }
}

