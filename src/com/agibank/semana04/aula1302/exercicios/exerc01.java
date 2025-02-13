package com.agibank.semana04.aula1302.exercicios;

public class exerc01 {
    public static void main(String[] args) {
        float[] precosAcao = {100.0f, 102.0f, 101.0f, 103.0f, 105.0f};
        calculoRetornoDiario(precosAcao);

    }
    static void calculoRetornoDiario(float[] precosAcao){

        for (int i = precosAcao.length - 1; i > 0; i--){
           float calculoVariacao = ((precosAcao[i] - precosAcao[i - 1]) / precosAcao[i - 1]) * 100;
            System.out.print("\nO retorno "+(i - 1)+": "+calculoVariacao);
        }

    }
}
