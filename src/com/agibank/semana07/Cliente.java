package com.agibank.semana07;

//todo, subclasse    extends/herda de Pessoa
public class Cliente extends Pessoa {
    private String numeroConta;
    private double saldo;

    public Cliente(String nome, String cpf, int anoNascimento, String numeroConta) {
        super(nome, cpf, anoNascimento);//todo, chama o construtor da classe Pessoa
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void ExibirdadosBancarios(){
        System.out.print("Id conta: "+numeroConta+"\n"+"CPF: "+cpf);

        System.out.print("Saldo: R$"+ saldo);

    }

    public void Depositar(double valor){
        if (saldo >= 0){
            saldo += valor;
            System.out.print("Depósito de R$"+valor+" realizado com sucesso!");
        }else {
            System.out.print("Valor inválido para depósito.");
        }
    }
}
