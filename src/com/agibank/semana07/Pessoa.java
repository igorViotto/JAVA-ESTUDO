package com.agibank.semana07;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected int anoNascimento;

    public Pessoa(String nome, String cpf, int anoNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;

    }
    public void exibirDados(){
        System.out.print("Nome " + nome + " - " + cpf);
    }
}
