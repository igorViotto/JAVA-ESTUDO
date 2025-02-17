package com.agibank.semana05.aula1702.exercicios50;

import java.util.Scanner;

public class exerc05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a sua renda líquida mensal?");
        double rendaMensal_cliente = sc.nextDouble();

        System.out.print("valor do empréstimo: ");
        double valorEmprestimo = sc.nextFloat();

        System.out.print("Quantas parcelas serão? ");
        int qtdParcelas = sc.nextInt();

        System.out.print("Qual a taxa de juros mensal? ");
        double taxaJuros_mensal = sc.nextFloat() / 100;

        double valorParcelas = (valorEmprestimo * taxaJuros_mensal) / (1 - Math.pow(1 + taxaJuros_mensal, -qtdParcelas));

        if (valorParcelas < rendaMensal_cliente * 0.3){
            System.out.println();
            System.out.print("Será possivel concluir o empréstimo!");
        }else {
            System.out.println();
            System.out.print("O valor da parcela deve ser menor que 30% da renda mensal.");
        }

    }
}
