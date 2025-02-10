package com.agibank.semana04.exercicios;
import java.util.Scanner;

public class exerx07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] valoresIniciais = {1000.0, 2000.0, 1500.0};
        double[] retorno = {0.05, 0.03, 0.04};

        double valorfFinal = simularCarteira(valoresIniciais, retorno);

        System.out.print("Valor final da carteira: "+ valorfFinal);

    }
    static double simularCarteira(double[] valoresIniciais, double[] retorno){

        double valorFinal = 0;

        for (int i = 0; i < valoresIniciais.length; i++){
            valorFinal += valoresIniciais[i] * (1 + retorno[i]);
        }
        return valorFinal;
    }
}
