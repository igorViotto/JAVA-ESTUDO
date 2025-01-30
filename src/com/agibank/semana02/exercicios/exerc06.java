package com.agibank.semana02.exercicios;
import java.util.Scanner;

public class  exerc06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ola, seja bem vindo!");
        char novoCliente;

        do {

        char novoProduto;
        float precoProduto;
        float valortotal = 0;
        double desconto;

            do {
                System.out.print("\nCadastrar novo produto? (s/n) ");
                novoProduto = sc.next().charAt(0);

                if (novoProduto != 'n') {
                    System.out.println("Preço do produto: ");
                    precoProduto = sc.nextFloat();

                    valortotal += precoProduto;

                }
            } while (novoProduto != 'n');
            {

                System.out.println("O valor total da compra foi de R$ " + valortotal);

                if (valortotal < 500) {
                    desconto = (valortotal - (valortotal * 0.05));
                    System.out.println("Sua compra de R$" + valortotal + " recebe desconto de 5%, o valor final e de: R$" + desconto);
                } else if (valortotal >= 501 && valortotal <= 1000) {
                    desconto = (valortotal - (valortotal * 0.10));
                    System.out.println("Sua compra de R$" + valortotal + " recebe desconto de 10%, o valor final e de: R$" + desconto);
                } else if (valortotal > 1000) {
                    desconto = (valortotal - (valortotal * 0.12));
                    System.out.println("Sua compra de R$" + valortotal + " recebe desconto de 12%, o valor final e de: R$" + desconto);
                }

            }

                System.out.print("\nIniciar procedimento para novo cliente? (s/n) ");
                    novoCliente = sc.next().charAt(0);

        }while (novoCliente != 'n');
        System.out.println("Obrigado, o caixa foi encerrado!");
    }
}
