package com.agibank.mes01.semana02.aula3101.esquenta;
import java.util.Scanner;

public class exerc01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float novoGasto = 0;
        float valorTotal = 0;

        while(novoGasto >= 0){

            System.out.print("Digite um Gasto: ");
            novoGasto = sc.nextFloat();

            if (novoGasto < 0) break;

            valorTotal += novoGasto;

            if (valorTotal > 5000) {
                System.out.print("[ALERTA] seus gastos ultrapassaram R$5000!\n");

            }
            if (novoGasto < 0) {
                System.out.print("Total gastos: R$" + valorTotal);
            }
        }


    }
}
