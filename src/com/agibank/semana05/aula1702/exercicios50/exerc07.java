package com.agibank.semana05.aula1702.exercicios50;

import java.util.Scanner;

public class exerc07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro Investimento: ");
        double valorInvestimento1 = sc.nextDouble();

        System.out.print("Qual a taxa de juros do investimento 01 (ex: 0.05 para 5%): ");
        double taxaJuros1 = sc.nextDouble();

        System.out.print("Segundo investimento: ");
        double valorInvestimento2 = sc.nextDouble();

        System.out.print("Qual a taxa de juros do investimento 02 (ex: 0.05 para 5%): ");
        double taxaJuros2 = sc.nextDouble();

        String resultado = investimentoVantajoso(valorInvestimento1, valorInvestimento2, taxaJuros1, taxaJuros2);
        System.out.println(resultado);

        sc.close();
    }

    static String investimentoVantajoso(double valorInvestimento1, double valorInvestimento2, double taxaJuros1, double taxaJuros2) {
        double calcInvestimento1 = valorInvestimento1 * Math.pow((1 + taxaJuros1), 12);
        double calcInvestimento2 = valorInvestimento2 * Math.pow((1 + taxaJuros2), 12);


        if (calcInvestimento1 > calcInvestimento2) {
            return "O investimento mais vantajoso foi: Investimento 1 com R$ " + calcInvestimento1;
        } else if (calcInvestimento2 > calcInvestimento1) {
            return "O investimento mais vantajoso foi: Investimento 2 com R$ " + calcInvestimento2;
        } else {
            return "Ambos os investimentos possuem o mesmo retorno: R$ " + calcInvestimento1;
        }
    }
}
