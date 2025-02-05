package com.agibank.semana03.aula0402;

import java.util.Scanner;

public class calculoimposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] compra = {10000, 8000, 12000, 7000, 15000};
        int[] venda = {12000, 8500, 14000, 7200, 18000};

        int resultVenda = 0, totalVenda = 0;
        double imposto = 0, aliquota = 0.15;

        for (int i = 0; i < 5; i++){
            resultVenda = venda[i] - compra[i];
            totalVenda += resultVenda;
        }

        System.out.print("Lucro total R$"+totalVenda+"\n");

        if (totalVenda > 20000){
            imposto = totalVenda * aliquota;
            System.out.print("Imposto a pagar R$"+imposto);
        } else if (totalVenda < 20000) {
            System.out.print("Sem imposto a pagar.");
        }

    }
}
