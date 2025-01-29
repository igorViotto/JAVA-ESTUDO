package com.agibank.semana02.aula2901.switchestudo.pratica;
import  java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char gosta = 's';
        char naoGosta = 'n';

        System.out.print("Usuario, voçe gosta de assistir filmes? (s/n) ");
        char respFilme = sc.next().charAt(0);


        if (respFilme != gosta){
            System.out.print("Tente gostar, é uma terapia!");
        } else if (respFilme == gosta) {
            System.out.print("Então me diga... Qual filme em cartaz voçe gostaria de ler a sinopse?\n\n");

            switch (respFilme){
                case '1':
                    System.out.print("MUFASA - O REI LEÃO\n");
                    break;
                case '2':
                    System.out.print("SONIC 3 - O FILME\n");
                    break;
                case '3':
                    System.out.print("AINDA ESTOU AQUI\n");
                    break;
                default:
                    System.out.print("Escolha uma das opções em cartaz!\n");
            }

        }


        if (respFilme == '1'){
            System.out.println("Mufasa, um filhote órfão, perdido e sozinho, conhece um simpático leão chamado Taka, herdeiro de uma linhagem real. O encontro ao acaso dá início a uma grande jornada de um grupo extraordinário de deslocados em busca de seu destino, além de revelar a ascensão de um dos maiores reis das Terras do Orgulho.");
        } else if (respFilme == '2') {
            System.out.println("Sonic, Knuckles e Tails se reúnem para enfrentar Shadow, um novo e misterioso inimigo com poderes diferentes de tudo que já enfrentaram antes. Com suas habilidades superadas em todos os aspecto");
        } else if (respFilme == '3') {
            System.out.println("No início da década de 1970, o Brasil enfrenta o endurecimento da ditadura militar. No Rio de Janeiro, a família Paiva - Rubens, Eunice e seus cinco filhos - vive à beira da praia em uma casa de portas abertas para os amigos. Um dia, Rubens Paiva é levado por militares à paisana e desaparece.");
        }


    }
}
