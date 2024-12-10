package controller;

import java.util.Scanner;

import controller.util.Utilidades;

public class F_bidimensionales {
    static Scanner sc = new Scanner(System.in); 
    // 1 - 16 Sigcho
    // aca deberia ir lo se sigcho

    // dodecaedro area 17
    public static void Ejecutar_dodecaedro() {
        System.out.println("Ingrese el valor de la arista: ");
        double a = sc.nextDouble();
        double area = 3 * Math.sqrt(25 + 10 * Math.sqrt(5)) * Math.pow(a, 2);

        System.out.println("El area del dodecaedro de arista a = " + a + " es: " + Utilidades.Redondear_double(area));
    }

    // dedecaedro volumne 18
    public static void Ejecutar_dodecaedro_volumen() {
        System.out.println("Ingrese el valor de la arista: ");
        double a = sc.nextDouble();
        double area = 3 * Math.sqrt(25 + 10 * Math.sqrt(5)) * Math.pow(a, 2);

        System.out.println("El area del dodecaedro de arista a = " + a + " es: " + Utilidades.Redondear_double(area));
    }
}
