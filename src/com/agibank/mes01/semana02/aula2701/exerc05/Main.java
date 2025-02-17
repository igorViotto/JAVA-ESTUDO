package com.agibank.mes01.semana02.aula2701.exerc05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float nota;
        System.out.println("Entre com a nota final da Diciplina: ");
        nota = sc.nextFloat();

        if (nota >= 6){
            System.out.println("Aprovado");
        } else if (nota >= 4 && nota < 6) {
            System.out.println("Exame");
        } else if (nota < 4) {
            System.out.println("Reprovado");
        }
    }
}
