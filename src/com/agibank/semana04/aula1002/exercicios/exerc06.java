package com.agibank.semana04.aula1002.exercicios;

public class exerc06 {
    public static void main(String[] args) {

        //todo, CONJUNTO DE 5 VALORES
        double[] retornos = {0.01, 0.02, -0.01, 0.03, -0.02};

        System.out.printf("Volatidade: %.4f%n", calcularVolatidade(retornos));

    }

    static double calcularVolatidade(double[] retornos) {

        double soma = 0;

        //todo, CÁLCULO DA MÉDIA
        for (int i = 0; i < retornos.length; i++){
            soma += retornos[i];//SOMA
        }

        double calcMedia = soma / 5;//MÉDIA
        //Todo, FIM MÉDIA

        //todo, GUARDA OS VALORES DA DE
        double[] desvioAoQuadrado = new double[retornos.length];

        //todo, FOR QUE PERCORRE OS ÍNDICES DO VETOR 'desvio * desvio', QUE SERIA DESVIO AO QUADRADO
        for (int i = 0; i < retornos.length; i++){
            double desvio = retornos[i] - calcMedia;//todo, FAZ CADA ÍNDICE DO VETOR 'retorno[]' SUBTRAIR A 'média'
            desvioAoQuadrado[i] = desvio * desvio;//todo, CADA ÍNDICE DO VETOR 'desvioAoQuadrado[]', RECEBE TODOS OS RESULTADOS DA SUBTRAÇÃO AO QUADRADO
        }

        double somaDesvio = 0;
        for (int i = 0; i < retornos.length; i++){
            somaDesvio += desvioAoQuadrado[i];//todo, SOMA TODOS OS VALORES DO VETOR 'desvioAoQuadrado[]'E GUARDA EM 'somaDesvio'
        }

        double variancia = somaDesvio / retornos.length;//todo, DEVIDE O VALOR TOTAL DA SOMA DE 'somaDesvio' PELA QUANTIDADE DE INDICES NO VETOR 'retorno', = 5

        return Math.sqrt(variancia);//todo, 'Math.sqrt' ACHA A RAIZ QUADRADA DA VARIANCIA (SOMADESVIO / 5)
    }
}
