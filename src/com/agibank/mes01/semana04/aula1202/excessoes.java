package com.agibank.mes01.semana04.aula1202;
import java.util.Scanner;

public class excessoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //todo, EXCESSOES - TRATAMENTO DE VALORES INDESEJADOS
        //todo,try-catch-finally:
        //funcionalidade que permitem que o programador lide com excessoes que ocorram
        //controlando o fluxo de execucao do codigo em situaçoes imprevistas

        try {
            int n1 = 20;
            int n2 = 2;
            int divisao = n1 / n2;

            System.out.print("Resultado: " + divisao);
        }catch (ArithmeticException e){
            System.out.print("Não e possivel dividir por 0!\n");
        }

        System.out.print("\nPrograma continua normalmente.");
    }
}
