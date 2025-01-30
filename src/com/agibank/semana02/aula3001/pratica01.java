package com.agibank.semana02.aula3001;
import java.util.Scanner;

//valor dos produtos
//total da compra
//valor desconto e preco a pagar
//
//deseja termina a digitacao dos produtos e se deseja finalizar o programa

public class pratica01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorProdutos = 0;
        int desconto;
        char ecliente = 's';
        char ncliente = 'n';

//        do {
//            System.out.println("Voçe e cliente? (s/n)");
//            char newCliente = sc.next().charAt(0);
//
//            if (newCliente != 's')
//        }




        System.out.print("Entre com o valor total dos produtos comprados: ");
        valorProdutos = sc.nextInt();

        if (valorProdutos < 500){
             desconto = (int) (valorProdutos - ( valorProdutos * 0.05));
            System.out.println("Sua compra de R$500 recebe desconto de 5%, o valor final fica: R$" +desconto);
        } else if (valorProdutos >= 501 && valorProdutos <= 1000) {
            desconto = (int) (valorProdutos - ( valorProdutos * 0.10));
            System.out.println("Sua compra de R$"+valorProdutos+" recebe desconto de 10%, o valor final fica: R$" +desconto);
        } else if (valorProdutos > 1000) {
            desconto = (int) (valorProdutos - ( valorProdutos * 0.12));
            System.out.println("Sua compra de R$"+valorProdutos+" recebe desconto de 12%, o valor final fica: R$" +desconto);
        }


    }
}
