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
        double volumen = ((15 + 7 * Math.sqrt(5)) * Math.pow(a, 3)) / 4.0;

        System.out.println(
                "El volumen del dodecaedro de arista a = " + a + " es: " + Utilidades.Redondear_double(volumen));
    }

    // dodecagono 19
    public static void Ejecutar_dodecagono() {
        System.out.println("Ingrese el valor de un lado: ");
        double l = sc.nextDouble();
        double area = 5 * l * (l / (2.0 * Math.tan(Math.toDegrees(18))));

        System.out.println("El area del dodecaedro de lado " + l + " es: " + Utilidades.Redondear_double(area));
    }

    // elipse 20
    public static void Ejecutar_elipse() {
        System.out.println("Ingrese el eje superior: ");
        double a = sc.nextDouble();
        System.out.println("Ingrese el eje inferior: ");
        double b = sc.nextDouble();
        double area = Math.PI * a * b;

        System.out.println("El area de la elipse de eje superior " + a + " y de eje inferior " + b + " es: "
                + Utilidades.Redondear_double(area));
    }

    // elipsoide 21
    public static void Ejecutar_elipsoide_volumen() {
        System.out.println("Ingrese el largo de un lado");
        double l = sc.nextDouble();
        System.out.println("Ingrese la altura");
        double h = sc.nextDouble();
        System.out.println("Ingrese el ancho");
        double a = sc.nextDouble();

        double area = (4.0 * Math.PI / 3.0) * l * a * h;
        System.out.println("El area para el elipsoide de largo " + l + " ,de altura " + h + " y de ancho " + a + " es "
                + Utilidades.Redondear_double(area));
    }

    // eneagono 22
    public static void Ejecutar_eneagono() {
        System.out.println("Ingrese el largo de un lado: ");
        double l = sc.nextDouble();

        double ap = (l / 2.0) * (Math.sin(Math.toDegrees(70)) / Math.sin(Math.toDegrees(20)));
        double area = (9 * ap * l) / 2;
        System.out.println("El area para el eneagono de lado " + l + " es " + Utilidades.Redondear_double(area));
    }

    // esfera hueca 23
    public static void Ejecutar_esfera_hueca_volumen() {
        System.out.println("Ingrese el radio Interno de la esfera: ");
        double r = sc.nextDouble();
        System.out.println("Ingrese el radio Externo de la esfera: ");
        double R = sc.nextDouble();

        double volumen = (4.0 / 3.0) * Math.PI * ((Math.pow(R, 3)) - (Math.pow(r, 3)));
        System.out.println("El volumen de la esfera hueca de radio interno de " + r + " y de radio externo de " + R
                + " es " + Utilidades.Redondear_double(volumen));

    }

    // esfera inclinada 24
    public static void Ejecutar_esfera_inclinada_volumen() {
        System.out.println("Ingrese el radio de la esfera inclinada: ");
        double r = sc.nextDouble();
        System.out.println("Ingrese la altura de la esfera inclinada: ");
        double h = sc.nextDouble();

        double volumen = (Math.PI * Math.pow(h, 2) * (3.0 * r - h)) / 3.0;
        System.out.println("El volumen de la esfera inclinada de radio " + r + " y de altura " + h + " es: "
                + Utilidades.Redondear_double(volumen));
    }

    // esferoide oblato 25
    public static void Ejecutar_esferoide_oblato_volumen() {
        System.out.println("Ingrese el radio ecuatorial del esferoide oblato: ");
        double e = sc.nextDouble();
        System.out.println("Ingrese el radio polar del esferoide oblato: ");
        double p = sc.nextDouble();

        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(e, 2) * p;
        System.out.println("El volumen del esferoide oblato de eje ecuatorial" + e + " y eje polar " + p + " es: "
                + Utilidades.Redondear_double(volumen));
    }

    // estrella 5 puntas 26
    public static void Ejecutar_estrella_5_puntas() {
        System.out.println("Ingrese cuanto mide un lado del hexagono interno: ");
        double l = sc.nextDouble();
        System.out.println("Ingrese la altura de uno de los triangulo exteriores: ");
        double h = sc.nextDouble();

        double area_pen = (5.0 / 4.0) * Math.pow(l, 2) * (1.0 / Math.tan(Math.toDegrees(Math.PI / 5.0)));
        double area_tri =  (5*(l * h))/2.0;

        System.out.println("El area de la estrella de lado penagonal: "+l+" y altura triangular: "+h+" es: "+Utilidades.Redondear_double(area_tri+area_pen));
    }

    // estrella de 6 puntos 
    public static void Ejecutar_estrella_6_puntas() {
        System.out.println("Ingrese cuanto mide un lado del hexagono interno: ");
        double l = sc.nextDouble();
        System.out.println("Ingrese la altura de uno de los triangulo exteriores: ");
        double h = sc.nextDouble();

        double area_hex = Math.pow(l, 2) * (3*(Math.sqrt(3))/2.0);
        double area_tri =  (6*(l * h))/2.0;

        System.out.println("El area de la estrella de lado hexagonal: "+l+" y altura triangular: "+h+" es: "+Utilidades.Redondear_double(area_tri+area_hex));
    }
}