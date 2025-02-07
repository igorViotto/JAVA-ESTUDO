package com.agibank.semana03.aula0702;
import java.util.Scanner;

public class maratona {

    public static final String RESET = "\033[0m";  // Reseta para a cor padrão
    public static final String CIANO = "\033[36m";
    public static final String AZUL = "\033[34m";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(AZUL + "*** AgiBank Previdência Inteligente ****"+ RESET);
        // Input data
        System.out.print("Idade atual:");
        int idade = in.nextInt();
        System.out.print("Contribuição mensal:");
        double contribuicao_mensal = in.nextDouble();
        System.out.print("Taxa de juros anual esperada:");
        double tx_juros_anual_esperada = in.nextDouble();
        System.out.print("Idade desejada de aposentadoria:");
        int idade_desejada_aposentadoria = in.nextInt();

        // Validate inputs
        if (idade >= idade_desejada_aposentadoria) {
            System.out.println("Erro: A idade desejada de aposentadoria deve ser maior que a idade atual.");
            return;
        }
        if (contribuicao_mensal <= 0 || tx_juros_anual_esperada < 0) {
            System.out.println("Erro: Contribuição mensal e taxa de juros devem ser valores positivos.");
            return;
        }

        // Calculate number of months until retirement
        int anos_contribuicao = idade_desejada_aposentadoria - idade;
        int meses_contribuicao = anos_contribuicao * 12;

        // Define different interest rates (4%, 6%, 8%, 10%)
        double[] taxas_juros_anuais = {0.04, 0.06, 0.08, 0.10};

        // Matrix to store accumulated balances for each year and interest rate
        double[][] matriz_saldos = new double[taxas_juros_anuais.length][anos_contribuicao];

        // Calculate accumulated balances for each interest rate and year
        for (int i = 0; i < taxas_juros_anuais.length; i++) {
            double taxa_juros_mensal = taxas_juros_anuais[i] / 12;
            for (int j = 0; j < anos_contribuicao; j++) {
                int meses_ate_agora = (j + 1) * 12;
                if (taxa_juros_mensal == 0) {
                    matriz_saldos[i][j] = contribuicao_mensal * meses_ate_agora;
                } else {
                    matriz_saldos[i][j] = contribuicao_mensal * ((Math.pow(1 + taxa_juros_mensal, meses_ate_agora) - 1) / taxa_juros_mensal);
                }
            }
        }

        // Output the final accumulated balances for each interest rate
        System.out.println( CIANO+ "\nSimulação da previdência privada" + RESET);
        System.out.println("Idade atual: " + idade + " anos");
        System.out.println("Contribuição mensal: " + contribuicao_mensal);
        System.out.println("Taxa de juros anual esperada: " + tx_juros_anual_esperada  + "%");
        System.out.println("Idade desejada para aposentadoria: " + idade_desejada_aposentadoria + " anos");

        System.out.println(CIANO+"\nSaldo final estimado:"+ RESET);
        for (int i = 0; i < taxas_juros_anuais.length; i++) {
            System.out.printf("- Com taxa de %.0f%%: R$ %.2f%n", taxas_juros_anuais[i] * 100, matriz_saldos[i][anos_contribuicao - 1]);
        }

        // Calculate monthly income during retirement
        System.out.println(CIANO+"\nRenda mensal estimada para 20 anos de aposentadoria:"+RESET);
        int expectativa_vida_aposentadoria = 20; // Assume 20 years of life expectancy after retirement
        for (int i = 0; i < taxas_juros_anuais.length; i++) {
            double taxa_juros_mensal = taxas_juros_anuais[i] / 12;
            double saldo_acumulado = matriz_saldos[i][anos_contribuicao - 1];
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
