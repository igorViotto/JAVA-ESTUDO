package com.agibank.mes01.semana04.aula1202.exercicios;

public class exerc03 {
    public static void main(String[] args) {

        float[][] planilhaMatriz = {{0.2f, 0.4f, 0.7f, 0.9f, 0.1f},
                                    {0.3f, 0.7f, 0.5f, 0.2f, 0.1f},
                                    {0.2f, 0.4f, 0.7f, 0.9f, 0.1f},
                                    {0.2f, 0.4f, 0.7f, 0.9f, 0.1f},
                                    {0.2f, 0.4f, 0.7f, 0.9f, 1.1f}};
        controledePlanilha(planilhaMatriz);


    }
    public static void controledePlanilha(float[][] planilhaMatriz) {
    try {
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) {
                if (planilhaMatriz[l][c] < 0 || planilhaMatriz[l][c] > 1) {
                    throw new IllegalArgumentException("Valor incorreto na matriz: " + planilhaMatriz[l][c]);
                }
            }
        }
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.print("Matriz não e 5x5!");
    }

    }
}
