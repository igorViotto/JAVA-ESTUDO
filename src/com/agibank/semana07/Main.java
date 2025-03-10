package com.agibank.semana07;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcao;

        System.out.println("BIGODE'S BANK, BEM VINDO: \n");
        System.out.println("Não é cliente? digite para criar conta: 1");
        System.out.println("Cliente, digite para acessar sua conta: 2");
        opcao = sc.next().charAt(0);
        sc.nextLine();

        if (opcao == '1'){
            Cliente novoCliente = NovoCadastro(sc);
            System.out.print("Conta criada com sucesso, agradeçemos a escolha!\n\n");
            novoCliente.ExibirdadosBancarios();
        } else if (opcao == '2') {
            System.out.println("Funcionalidade de login ainda não implementada.");

        }

    }

    public static Cliente NovoCadastro(Scanner sc) {
        System.out.println("\nBem-vindo! Para criar sua conta, preencha as informações abaixo:");

        System.out.print("Qual seu nome? ");
        String nome = sc.nextLine();

        System.out.print("Qual seu CPF? ");
        String cpf = sc.nextLine();

        System.out.print("Qual seu ano de nascimento? ");
        int anoNascimento = sc.nextInt();
        sc.nextLine();

        if (2025 - anoNascimento < 18) {
            System.out.print("Idade inválida, menor de 18 anos.");
            return null;
        }

        System.out.print("Número da conta: ");
        String numeroConta = sc.nextLine();

        return new Cliente(nome, cpf, anoNascimento, numeroConta);
    }

}
