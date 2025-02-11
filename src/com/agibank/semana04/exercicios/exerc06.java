package com.agibank.semana04.exercicios;

public class exerc06 {
    public static void main(String[] args) {

        double[] retornos = {0.01, 0.02, -0.01, 0.03, -0.02};

        System.out.printf("Volatidade: "+ calcularVolatidade(retornos));

    }

    static double calcularVolatidade(double[] retornos) {

        double soma = 0;

        for (int i = 0; i < retornos.length; i++){
            soma += retornos[i];
        }

        double calcMedia = soma / 5;

        double[] desvioAoQuadrado = new double[retornos.length];

        for (int i = 0; i < retornos.length; i++){
            double desvio = retornos[i] - calcMedia;
            desvioAoQuadrado[i] = desvio * desvio;
        }

        double somaDesvio = 0;
        for (int i = 0; i < retornos.length; i++){
            somaDesvio += desvioAoQuadrado[i];
        }

        double variancia = somaDesvio / retornos.length;

        return Math.sqrt(variancia);
    }
}
