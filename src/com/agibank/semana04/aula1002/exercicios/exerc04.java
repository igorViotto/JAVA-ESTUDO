package com.agibank.semana04.aula1002.exercicios;
import java.util.Arrays;

public class exerc04 {
    public static void main(String[] args) {

        double[] precos = {100.0, 102.0, 101.0, 103.0, 105.0};
        int intervalo = 0;
        double[] resultado = calcularMediaMovel(precos, intervalo);
        System.out.println("Média móvel: "+Arrays.toString(resultado));

    }

    static double[] calcularMediaMovel(double[] precos, int intervalo){

        if (intervalo > precos.length || intervalo <= 0){
            System.out.print("O intervalo é maior ou menor que a quantidade de valores.");
            return new double[0];
        }

        //todo, double[] medias = pega o valor do vetor preço, subtrai o intervalo, exp:
        //todo,  preço = {100.0, 102.0, 101.0, 103.0, 105.0}, se o intervao é 3, o resultado seria no preço {102.0} -
        //todo, e soma +1, parando no {101.0}.
        double[] medias = new double[precos.length - intervalo + 1];

            for (int i = 0; i < medias.length; i++){
                double soma = 0;
                for (int j = 0; j < intervalo; j++){
                    soma += precos[i + j];
                }
                medias[i] = soma / intervalo;
            }
        return medias;
    }
}
