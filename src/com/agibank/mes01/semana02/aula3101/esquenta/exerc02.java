package com.agibank.mes01.semana02.aula3101.esquenta;
import java.util.Scanner;

public class exerc02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                float divida, pagDivida;

                System.out.print("Qual o valor da sua dívida? ");
                divida = sc.nextFloat();

                while (divida > 0) {
                    System.out.print("\nQual será o pagamento desse mês?: ");
                    pagDivida = sc.nextFloat();

                    if (pagDivida > divida) {
                        System.out.println("Pagamento maior que a dívida! Pagamento ajustado para: " + divida);
                        pagDivida = divida;
                    }

                    divida -= pagDivida;

                    if (divida > 0) {
                        System.out.println("Dívida restante: " + divida);
                    } else {
                        System.out.println("Dívida quitada! Parabéns!");
                    }
                }

                sc.close();
    }
}
