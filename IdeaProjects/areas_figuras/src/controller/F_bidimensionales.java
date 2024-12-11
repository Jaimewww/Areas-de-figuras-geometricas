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

    // dodecaedro volumne 18
    public static void Ejecutar_dodecaedro_volumen() {
        System.out.println("Ingrese el valor de la arista: ");
        double a = sc.nextDouble();
        double volumen = ((15 + 7 * Math.sqrt(5)) * Math.pow(a, 3)) / 4;

        System.out.println(
                "El volumen del dodecaedro de arista a = " + a + " es: " + Utilidades.Redondear_double(volumen));
    }

    // dodecagono 19
    public static void Ejecutar_dodecagono() {
        System.out.println("Ingrese el valor de un lado: ");
        double l = sc.nextDouble();
        double area = 5 * l * (l / (2 * Math.tan(Math.toRadians(18))));

        System.out.println("El area del dodecaedro de lado " + l + " es: " + Utilidades.Redondear_double(area));
    }

    // elipse 20
    public static void Ejecutar_elipse() {
        System.out.println("Ingrese el eje superior: ");
        double a = sc.nextDouble();
        System.out.println("Ingrese el eje inferior: ");
        double b = sc.nextDouble();
        double area = Math.PI * a * b;

        System.out.println("El area de la elipse de eje superior " + a + " y de eje inferior " +b + " es: "+ area);
    }

    // elipsoide 21
    public static void Ejecutar_elipsoide() {
    }

}
