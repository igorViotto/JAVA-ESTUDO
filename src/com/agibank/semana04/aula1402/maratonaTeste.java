package com.agibank.semana04.aula1402;
import java.util.Scanner;

//Devs - Igor Cremasc Viotto
//Tester - Leandro Rocha de Sena

//Nota = 100

/*comentario: a logica esta correta, o programa roda certinho e as saidas sao iguais as previstas no enunciado*/

public class maratonaTeste {

        public static void main(String[] args) {
            double[][] precos = {
                    {22.5, 23.0, 22.0, 24.5, 25.0},
                    {15.0, 16.5, 14.0, 13.5, 17.0},
                    {100.0, 100.5, 100.5, 100.0, 100.5}
            };

            int l = precos.length;

            System.out.print("Media: "+ calcularMedias(precos));
            System.out.println();

            int maiorValorizacaoIndex = ativoMaiorValorizacao(precos);
            System.out.println("Ativo com maior valorização, Ativo " + (maiorValorizacaoIndex + 1));

            System.out.println();

            exibirLucroOuPrejuizo(precos);

            System.out.println();

            double precoConsulta = consultarPreco(precos, 1, 1);
            System.out.println("Consulta do preço do ativo escolhido = " + precoConsulta);
        }

        //todo, Método para calcular a média de preços de cada ativo
         static float calcularMedias(double[][] precos) {
            Scanner sc = new Scanner(System.in);
            int l = precos.length;

            System.out.print("Ver media de qual ativo (0, 1 ou 2): ");
            l = sc.nextInt();

            float media, calculo = 0;

            for (int c = 0; c < precos[l].length; c++){
                calculo += precos[l][c];
            }
            media = calculo/5;

            return media;
        }

        //todo, Método para identificar o ativo com maior valorização
        public static int ativoMaiorValorizacao(double[][] precos) {
            int index = 0;
            double maiorCrescimento = 0;

            for (int i = 0; i < precos.length; i++) {
                double crescimento = ((precos[i][precos[i].length - 1] - precos[i][0]) / precos[i][0]) * 100;
                if (crescimento > maiorCrescimento) {
                    maiorCrescimento = crescimento;
                    index = i;
                }
            }
            return index;
        }

        //todo, Método para exibir se houve lucro ou prejuízo
        public static void exibirLucroOuPrejuizo(double[][] precos) {
            System.out.println("Lucro/Perda de cada ativo:");

            for (int i = 0; i < precos.length; i++) {
                double lucroPercentual = ((precos[i][precos[i].length - 1] - precos[i][0]) / precos[i][0]) * 100;
                System.out.printf("Ativo"+ (i + 1) +" : Lucro ou Perda: %.2f%n", lucroPercentual);
            }
        }

        //todo, Método para consultar o preço de um ativo em um dia
        public static double consultarPreco(double[][] precos, int ativo, int dia) {
            try {
                if (ativo < 1 || ativo > precos.length || dia < 1 || dia > precos[0].length) {
                    throw new IllegalArgumentException("Ativo ou dia inválido!");
                }
                return precos[ativo - 1][dia - 1];
            } catch (Exception e) {
                System.out.println("Erro ao consultar preço: " + e.getMessage());
                return -1;
            }
        }
    }

