package com.agibank.mes01.semana03.aula0702;
import java.util.Scanner;

public class maratona {

    public static final String RESET = "\033[0m";  // Reseta para a cor padrão
    public static final String CIANO = "\033[36m";
    public static final String AZUL = "\033[34m";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(AZUL + "*** AgiBank Previdência Inteligente ****"+ RESET);

        //todo, ENTRADA!!

        int idade;
        int idade_desejada_aposentadoria;
        double contribuicao_mensal;
        double tx_juros_anual_esperada;

        System.out.print("Idade atual:");
         idade = in.nextInt();
        System.out.print("Contribuição mensal:");
         contribuicao_mensal = in.nextDouble();
        System.out.print("Taxa de juros anual esperada:");
         tx_juros_anual_esperada = in.nextDouble();
        System.out.print("Idade desejada de aposentadoria:");
         idade_desejada_aposentadoria = in.nextInt();

        //todo, FIM ENTRADA


        //todo, CONDIÇÃO SE
        if (idade >= idade_desejada_aposentadoria) {
            System.out.println("Erro: A idade desejada de aposentadoria deve ser maior que a idade atual.");
            return;
        }
        if (contribuicao_mensal <= 0 || tx_juros_anual_esperada < 0) {
            System.out.println("Erro: Contribuição mensal e taxa de juros devem ser valores positivos.");
            return;
        }
        //todo, FIM SE


        //todo, CALCULO DE MESES ATÉ A APOSENTADORIA

        int anos_contribuicao;

         anos_contribuicao = idade_desejada_aposentadoria - idade;


        //todo, DEFINE AS PORCENTAGENS DE TAXA
        //VETOR
        double[] taxas_juros_anuais = {0.04, 0.06, 0.08, 0.10};


        //todo, Matriz para armazenar saldos acumulados de cada ano e taxa de juros
        //MATRIZ
        double[][] matriz_saldos = new double[taxas_juros_anuais.length][anos_contribuicao];



        //todo, Calcula os saldos acumulados para cada taxa de juros e ano
        double taxa_juros_mensal;
        int meses_ate_agora;

        for (int i = 0; i < taxas_juros_anuais.length; i++) {
             taxa_juros_mensal = taxas_juros_anuais[i] / 12;
            for (int j = 0; j < anos_contribuicao; j++) {
                 meses_ate_agora = (j + 1) * 12;
                if (taxa_juros_mensal == 0) {
                    matriz_saldos[i][j] = contribuicao_mensal * meses_ate_agora;
                } else {
                    matriz_saldos[i][j] = contribuicao_mensal * ((Math.pow(1 + taxa_juros_mensal, meses_ate_agora) - 1) / taxa_juros_mensal);
                }
            }
        }

        //todo, SAIDA

        //todo, SAIDA MOSTRANDO AS ENTRADAS DO USUARIO
        System.out.println( CIANO+ "\nSimulação da previdência privada" + RESET);
        System.out.println("Idade atual: " + idade + " anos");
        System.out.println("Contribuição mensal: " + contribuicao_mensal);
        System.out.println("Taxa de juros anual esperada: " + tx_juros_anual_esperada  + "%");
        System.out.println("Idade desejada para aposentadoria: " + idade_desejada_aposentadoria + " anos");
        //


        //todo, GERA A PRIMEIRA TABELA COM SALDO ESTIMADO
        System.out.println(CIANO+"\nSaldo final estimado:"+ RESET);
        for (int i = 0; i < taxas_juros_anuais.length; i++) {
            System.out.printf("- Com taxa de %.0f%%: R$ %.2f%n", taxas_juros_anuais[i] * 100, matriz_saldos[i][anos_contribuicao - 1]);
        }


        //todo, CALCULO E SAIDA DA TABELA (20 ANOS DE APOSENTADORIA)
        int expectativa_vida_aposentadoria;
        double saldo_acumulado;

        System.out.println(CIANO+"\nRenda mensal estimada para 20 anos de aposentadoria:"+RESET);
         expectativa_vida_aposentadoria = 20;
        for (int i = 0; i < taxas_juros_anuais.length; i++) {
             taxa_juros_mensal = taxas_juros_anuais[i] / 12;
             saldo_acumulado = matriz_saldos[i][anos_contribuicao - 1];
            double renda_mensal;
            if (taxa_juros_mensal == 0) {
                renda_mensal = saldo_acumulado / (expectativa_vida_aposentadoria * 12);
            } else {
                renda_mensal = saldo_acumulado * (taxa_juros_mensal / (1 - Math.pow(1 + taxa_juros_mensal, -expectativa_vida_aposentadoria * 12)));
            }
            System.out.printf("- Com taxa de %.0f%%: R$ %.2f%n", taxas_juros_anuais[i] * 100, renda_mensal);
        }

        in.close();
    }
}
