package controller;

import java.util.Scanner;

public class F_bidimensionales {
    static Scanner sc = new Scanner(System.in); 
    // 1 - 16 Sigcho
    // aca deberia ir lo se sigcho

    // dodecaedro area 17
    public static void Ejecutar_dodecaedro() {
        double a = sc.nextDouble();
        double area = 3 * Math.sqrt(25 + 10 * Math.sqrt(5)) * Math.pow(a, 2);

        System.out.println("El area del dodecaedro de arista a = " + a + " es: " + area);
    }

    // dedecaedro volumne 18
    public static void Ejecutar_dodecaedro_volumen() {
        double a = sc.nextDouble();
        double area = 3 * Math.sqrt(25 + 10 * Math.sqrt(5)) * Math.pow(a, 2);

        System.out.println("El area del dodecaedro de arista a = " + a + " es: " + area);
    }
}
