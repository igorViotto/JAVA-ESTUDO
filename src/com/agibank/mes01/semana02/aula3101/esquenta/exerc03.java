package com.agibank.mes01.semana02.aula3101.esquenta;
import java.util.Scanner;

public class exerc03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float saldoTotal = 0;
        float novoSaque;

        System.out.print("Digite um Saldo Inicial: ");
        saldoTotal = sc.nextFloat();

        while(saldoTotal > 0) {

            System.out.print("Digite um novo saque: ");
            novoSaque = sc.nextFloat();

            if (novoSaque < 0) break;

            if (novoSaque > saldoTotal) {
                System.out.println("[ERRO] Saldo insuficiente! Seu saldo atual é: " + saldoTotal);
            } else {
                saldoTotal -= novoSaque;
                System.out.println("Saque realizado! Saldo restante: " + saldoTotal);
            }

            if (saldoTotal == 0) {
                System.out.println("Saldo Zerado! Conta vazia.");
                break; // Sai do loop
            }
        }
    }
}
