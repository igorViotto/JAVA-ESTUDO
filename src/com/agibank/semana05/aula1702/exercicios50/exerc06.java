package com.agibank.semana05.aula1702.exercicios50;

import java.util.Scanner;

public class exerc06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual seu saldo atual? ");
        float saldoAtual = sc.nextFloat();

        System.out.println("Qual opção será: 1 - SAQUE, 2 - DEPOSITO: ");
        char contaBancaria = sc.next().charAt(0);

            switch (contaBancaria){
                case '1':
                    System.out.print("Qual o valor do saque:");
                    float valorSaque = sc.nextFloat();

                    if (valorSaque > saldoAtual){
                        System.out.print("ERRO: O saque desejado ultrapassa o valor do seu saldo atual.");
                    }else{
                        saldoAtual = saldoAtual - valorSaque;
                    }
                    break;
                case '2':
                    System.out.print("Qual será o valor do depósito:");
                    float valorDeposito = sc.nextFloat();

                    saldoAtual = saldoAtual + valorDeposito;
                    break;
                default:
                    System.out.print("Opção não encontrada / inválida.");
            }

        System.out.println();
        System.out.print("Seu saldo Atual é de: "+ saldoAtual);
    }
}
