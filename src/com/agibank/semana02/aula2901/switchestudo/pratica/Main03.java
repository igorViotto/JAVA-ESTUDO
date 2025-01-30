package com.agibank.semana02.aula2901.switchestudo.pratica;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char respFilme;

        System.out.print("Usuário, você gosta de assistir filmes? (s/n) ");
        respFilme = sc.next().charAt(0);

        if (respFilme == 'n') {
            System.out.println("Tente gostar, é uma terapia!");

        } else if (respFilme == 's') {
            System.out.println("Então me diga... Qual filme em cartaz você gostaria de ler a sinopse?\n");
            System.out.println("1 - MUFASA - O REI LEÃO");
            System.out.println("2 - SONIC 3 - O FILME");
            System.out.println("3 - AINDA ESTOU AQUI");

            System.out.print("Digite o número do filme desejado: ");
            int escolhaFilme = sc.nextInt();

            do {
                    System.out.println("Escolha inválida! Selecione um número entre 1 e 3.");
                    escolhaFilme = sc.next().charAt(0);

            }while (escolhaFilme != 1 && escolhaFilme != 2 && escolhaFilme != 3);{
                switch (escolhaFilme) {
                    case 1:
                        System.out.println("Mufasa, um filhote órfão, perdido e sozinho, conhece um simpático\n leão chamado Taka, herdeiro de uma linhagem real. O encontro ao acaso dá início\n a uma grande jornada de um grupo extraordinário de deslocados em busca\n de seu destino, além de revelar a ascensão de um dos maiores reis das Terras do Orgulho.");
                        break;
                    case 2:
                        System.out.println("Sonic, Knuckles e Tails se reúnem para enfrentar Shadow, um novo e\n misterioso inimigo com poderes diferentes de tudo que já enfrentaram antes. Com\n suas habilidades superadas em todos os aspectos.");
                        break;
                    case 3:
                        System.out.println("No início da década de 1970, o Brasil enfrenta o endurecimento da\n ditadura militar. No Rio de Janeiro, a família Paiva - Rubens, Eunice e seus\n cinco filhos - vive à beira da praia em uma casa de portas abertas para os\n amigos. Um dia, Rubens Paiva é levado por militares à paisana e desaparece.");
                        break;

                }
            }


        }

        sc.close();
    }
}
