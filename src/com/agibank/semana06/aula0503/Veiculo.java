package com.agibank.semana06.aula0503;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private boolean isentoIpva;

    public Veiculo(String marca, String modelo, int ano, boolean isentoIpva) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.isentoIpva = isentoIpva;
    }

    public void exibirInformacoes() {
        System.out.println("\n--------------------");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println(isentoIpva ? "Isento de IPVA." : "Não isento de IPVA.");
    }
}
