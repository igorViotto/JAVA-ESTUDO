package com.agibank.semana04.aula1002.exercicios;

public class exerc06 {
    public static void main(String[] args) {

        //todo, CONJUNTO DE 5 VALORES
        double[] valores = {0.05, 0.02, -0.08, 0.03, -0.015};

        System.out.printf("Volatidade: %.4f%n", calcularVolatidade(valores));

    }

    static double calcularVolatidade(double[] valores) {

        double soma = 0;

        //todo, CÁLCULO SOMA
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];//SOMA
        }

        //Todo, CALCULO MÉDIA
        double media = soma / 5;//MÉDIA

        //todo, GUARDA OS VALORES DESVIO² (linha '31')
        double[] desvioAoQuadrado = new double[valores.length];

        //todo, FOR QUE PERCORRE OS ÍNDICES DO VETOR 'desvio²'
        for (int i = 0; i < valores.length; i++){
            double desvio = valores[i] - media;//todo, FAZ CADA ÍNDICE DO VETOR 'retorno[]' SUBTRAIR A 'média'
            desvioAoQuadrado[i] = desvio * desvio;//todo, CADA ÍNDICE DO VETOR 'desvioAoQuadrado[]', RECEBE TODOS OS RESULTADOS DA SUBTRAÇÃO AO QUADRADO
        }

        double somaDesvio = 0;
        for (int i = 0; i < valores.length; i++){
            somaDesvio += desvioAoQuadrado[i];//todo, SOMA TODOS OS VALORES DO VETOR 'desvioAoQuadrado[]'E GUARDA EM 'somaDesvio'
        }

        double variancia = somaDesvio / valores.length;//todo, DEVIDE O VALOR TOTAL DA SOMA DE 'somaDesvio' PELA QUANTIDADE DE INDICES NO VETOR 'retorno', = 5

        return Math.sqrt(variancia);//todo, 'Math.sqrt' ACHA A RAIZ QUADRADA DA VARIANCIA (SOMADESVIO / 5)
    }
}
