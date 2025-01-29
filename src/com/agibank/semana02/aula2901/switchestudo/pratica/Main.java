package com.agibank.semana02.aula2901.switchestudo.pratica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - CDB\n2 - CDI\n3 - Tesouro Direto\n4 - FII");

        System.out.print("Escolha qual opção de investimento prosseguir: ");
        char investimento = sc.next().charAt(0);// com byte: sc.nextByte();
        //poderia ser feito com BYTE para ocupar menos memoria.

        switch (investimento) {
            case '1':// se fosse com byte seria: case 1:
                System.out.println("CDB, prossiga para os proximos passos.");
                break;
            case '2':
                System.out.println("CDI, prossiga para os proximos passos.");
                break;
            case '3':
                System.out.println("Tesouro direto, prossiga para os proximos passos.");
                break;
            case '4':
                System.out.println("FII, prossiga para os proximos passos.");
                break;
            default:
                System.out.println("Opção inválida, escolha uma das 4 opçoes.");
        }

    }
}
