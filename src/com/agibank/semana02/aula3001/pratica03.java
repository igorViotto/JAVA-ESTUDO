package com.agibank.semana02.aula3001;
import java.util.Scanner;

public class pratica03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um numero para descobrirmos a sequencia de FIBONACCI: ");
        int num = sc.nextInt();

        int primeiro = 0, segundo = 1, proximo;

        for (int i = 1; i <= num; i++){
            System.out.printf(primeiro+"");

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.print(", ");
        }
    }
}
