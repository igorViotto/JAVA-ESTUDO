package com.agibank.mes01.semana03.aula0502.correcao;

public class exerc08 {
    public static void main(String[] args) {

        double[] compra = {10000, 8000, 12000, 7000, 15000};
        double[] venda = {25000, 8500, 14000, 7200, 18000};
        double[] lucro = new double[5];
        double lucroTotal = 0, taxa = 0.15, imposto = 0;

        for (int i = 0; i < compra.length; i++){
            lucro[i] = venda[i] - compra[i];
            lucroTotal += lucro[i];
        }

        System.out.print("O lucro total das açoes e: "+lucroTotal+"\n");

        if (lucroTotal > 20000){
            imposto = (lucroTotal - 20000) * taxa;

            System.out.printf("Valor do imposto: %.2f\n\n", imposto);
        }else {
            System.out.print("Isento de impostos.\n\n");
        }


        for (int i = 0; i < 5; i++){
            System.out.print("Lucro de cada ação "+(i + 1)+": R$"+lucro[i]+"\n");
        }
    }
}
