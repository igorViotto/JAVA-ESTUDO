package com.agibank.semana04.aula1302.exercicios;
import java.util.Scanner;

public class exerc04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] saldoClientes = new double[3][5];

        for (int l = 0; l < saldoClientes.length; l++){
            for (int c = 0; c < saldoClientes[l].length; c++){
                System.out.print("Valor das transações: "+ (c + 1) +" : ");
                saldoClientes[l][c] = sc.nextDouble();
            }
        }

        double saldoInicial = 1000;

        for (int l = 0; l < saldoClientes.length; l++){
            double totalMovimentado = 0;

            for (int c = 0; c < saldoClientes[l].length; c++){
                totalMovimentado += saldoClientes[l][c];
            }

            double saldoFinal = saldoInicial + totalMovimentado;

            System.out.printf("Cliente %d: Total Movimentado = %.2f | Saldo Final = %.2f%n",
                    (l + 1),  totalMovimentado, saldoFinal);

        }

    }

}

