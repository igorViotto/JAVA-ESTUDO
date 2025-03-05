package com.agibank.semana06.aula0503;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean pagaIpva = false;

        System.out.println("Olá cliente X, Para seguirmos com o procedimento de cadastro do veículo.");
        System.out.println("Preencha as seguintes informações:");

        System.out.print("Qual a marca produtora do veículo? ");
        String marcaVeiculo = sc.next();

        System.out.print("Qual o modelo do veículo? ");
        String modeloVeiculo = sc.next();

        System.out.print("Qual o ano de fabricação do veículo? ");
        int anoFabricacao = sc.nextInt();

        System.out.println("\nAgora vamos analisar a isenção do IPVA.");
        System.out.println("Se você se encaixa em alguma das opções abaixo, digite o número correspondente:");
        System.out.println("1) Profissão de transporte (taxistas, motoristas de van escolar, etc.)");
        System.out.println("2) Deficiência ou doença incapacitante.");
        System.out.println("3) Veículo com mais de 20 anos de fabricação.");
        System.out.print("\nDigite 1, 2 ou 3: ");
        char opcao = sc.next().charAt(0);

        if (opcao == '1' || opcao == '2') {
            System.out.println("Documentos enviados para comprovação.");
            pagaIpva = true;
        } else if (opcao == '3') {
            if (2025 - anoFabricacao >= 20) {
                pagaIpva = true;
            }
        } else {
            System.out.println("Opção inválida. Considerando que o veículo deve pagar IPVA.");
        }

        Veiculo novoVeiculo = new Veiculo(marcaVeiculo, modeloVeiculo, anoFabricacao, pagaIpva);
        novoVeiculo.exibirInformacoes();

        sc.close();
    }
}
