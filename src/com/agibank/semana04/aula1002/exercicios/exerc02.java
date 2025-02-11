package com.agibank.semana04.aula1002.exercicios;
import java.util.Scanner;

public class exerc02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual e seu capital? ");
        float capital = sc.nextFloat();

        System.out.print("Qual a taxa anual: ");
        float taxa = sc.nextFloat();

        System.out.print("Por quantos anos: ");
        int anos = sc.nextInt();

        float resultado = CalcularJurosSimples(capital, taxa, anos);

        System.out.printf("Montante final: %.2f", (resultado + capital));
    }
    static float CalcularJurosSimples(float capital, float taxa, int anos){
        return (capital * taxa * anos) / 100;
    }
}
