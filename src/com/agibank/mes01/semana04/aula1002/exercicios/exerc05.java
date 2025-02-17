package com.agibank.mes01.semana04.aula1002.exercicios;
import java.util.Scanner;

public class exerc05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do ativo 1: ");
        float ativo1 = sc.nextFloat();

        System.out.print("Qual o valor do ativo 2: ");
        float ativo2 = sc.nextFloat();

        float maioRetorno = compararAtivos(ativo1, ativo2);

        System.out.print("O ativo com maior retorno é: " + maioRetorno);

    }
    static float compararAtivos(float ativo1, float ativo2){
        float maior;

        if (ativo1 > ativo2){
            maior = ativo1;
        } else {
            maior = ativo2;
        }

        return maior;
    }
}
