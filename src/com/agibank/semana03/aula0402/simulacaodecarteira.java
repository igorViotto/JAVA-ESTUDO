package com.agibank.semana03.aula0402;

import java.util.Scanner;

public class simulacaodecarteira {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = {5000, 3000, 7000, 4000, 6000};
        int i = 0, totalInvest = 0;

        for (int num : v){
            totalInvest += num;
        }

        System.out.print("Total investido: "+ totalInvest+" R$ \n");

        for (int num : v){
           double percent = ((double) num / totalInvest) * 100;
            System.out.printf("Valor %d: %.2f%%\n", num, percent);
        }

    }
}
