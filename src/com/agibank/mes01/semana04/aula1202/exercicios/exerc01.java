package com.agibank.mes01.semana04.aula1202.exercicios;
import java.util.Scanner;

public class exerc01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int[] saldosBancarios = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};

            int indiceEscolhido = saldosBancarios.length;

            System.out.print("Digite o índice da conta: ");
            indiceEscolhido = sc.nextInt();

            System.out.print("O valor do índice escolhido e de: " + saldosBancarios[indiceEscolhido - 1]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.print("ERRO: Conta não encontrada!");
        }

        sc.close();
    }
}
