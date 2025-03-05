package com.agibank.semana06.aula0503;

public class Carro {
    private static String marca;
    private static String modelo;
    private static int ano;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public static void acelerar(){
        System.out.print("Acelerando!!\n");
    }

    public static void freio(){
        System.out.print("Freiando..");
    }

    public static void informacaoCarro(){
        System.out.print("\nMarca: "+ marca +".\n");
        System.out.print("Modelo: "+ modelo +".\n");
        System.out.print("Ano: "+ ano +".\n");
    }
}



