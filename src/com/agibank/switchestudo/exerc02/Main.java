package com.agibank.switchestudo.exerc02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                byte satisfacao;

                System.out.println("\n1 - Ótimo\n2 - Bom\n3 - Médio\n4 - Ruim\n5 - Péssimo");

                do {
                    System.out.print("Escolha uma das opções para avaliar o atendimento: ");
                    satisfacao = sc.nextByte();

                    if (satisfacao < 1 || satisfacao > 5) {
                        System.out.println("Opção inválida! Escolha um número entre 1 e 5.");
                    }

                } while (satisfacao < 1 || satisfacao > 5);

                switch (satisfacao) {
                    case 1:
                    case 2:
                        System.out.println("Agradecemos pela avaliação! Deixe seu comentário no App.");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Agradecemos pela avaliação! Gostaríamos de saber mais sobre o atendimento.");
                        break;
                }

                sc.close();
            }
        }


