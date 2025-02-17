package com.agibank.mes01.semana02.aula3101;
import java.util.Scanner;
import java.lang.Math;

// Dev - Igor Cremasco Viotto, NOTA:95/100
// Tester - Angelo Scarpetta

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angulo, velocidade;
        double vx, vy, t;

        //todo comentario verde atoa.

        System.out.print("Insira a velocidade: ");
        velocidade = sc.nextDouble();
        System.out.print("Insira o angulo: ");
        angulo = Math.toRadians(sc.nextDouble());

        final double gravidade = 9.81;
        final double intervalo = 0.01;

        vx = velocidade * Math.cos(angulo);
        vy = velocidade * Math.cos(angulo);

        t = 0.01;//TESTER: t != 0.01
        double x, y;

        System.out.print("Tempo(s)| X(m) | Y(m)");
        System.out.print("\n-----------------------\n");

        do {
            x = vx * t;
            y = (vy * t) - (0.5 * gravidade * t * t);

            if (y < 0)break;;//TESTER: Dois ;

            System.out.printf("%.2f  | %.2f | %.2f\n", t , x , y );
            t += intervalo;
        }while (y >= 0);
    }
}