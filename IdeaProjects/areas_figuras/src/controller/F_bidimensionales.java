package controller;

import java.util.Scanner;

import controller.util.Menu;
import controller.util.Utilidades;

public class F_bidimensionales {
    static Menu menu = new Menu();
    static Scanner sc = new Scanner(System.in);
    // 1 - 16 Sigcho
    // aca deberia ir lo se sigcho

    // dodecaedro area 17
    public static void Ejecutar_dodecaedro() {
        float a = menu.readFloat("Ingrese el valor de la arista en cm: ");
        float area = (float) (3 * Math.sqrt(25 + 10 * Math.sqrt(5)) * Math.pow(a, 2));
        System.out.println("El area del dodecaedro de arista a = " + a + " es: " + Utilidades.Redondear_double(area));
    }

    // dodecaedro volumne 18
    public static void Ejecutar_dodecaedro_volumen() {
        float a = menu.readFloat("Ingrese el valor de la arista en cm: ");
        float volumen = (float) (((15 + 7 * Math.sqrt(5)) * Math.pow(a, 3)) / 4);
        System.out.println("El volumen del dodecaedro de arista a = " + a + " es: " + Utilidades.Redondear_double(volumen));
    }

    // dodecagono 19
    public static void Ejecutar_dodecagono() {
        float l = menu.readFloat("Ingrese el valor de un lado en cm: ");
        float area = (float) (5 * l * (l / (2 * Math.tan(Math.toRadians(18)))));
        System.out.println("El area del dodecaedro de lado " + l + " es: " + Utilidades.Redondear_double(area));
    }

    // elipse 20
    public static void Ejecutar_elipse() {
        float a = menu.readFloat("Ingrese el eje superior en cm: ");
        float b = menu.readFloat("Ingrese el eje inferior: ");
        float area = (float) (Math.PI * a * b);

        System.out.println("El area de la elipse de eje superior " + a + " y de eje inferior " +b + " es: "+ Utilidades.Redondear_double(area));
    }

    // elipsoide 21
    public static void Ejecutar_elipsoide_volumen() {
        System.out.println("Ingrese el largo de un lado");
        double l = sc.nextDouble();
        System.out.println("Ingrese la altura");
        double h = sc.nextDouble();
        System.out.println("Ingrese el ancho");
        double a = sc.nextDouble(); 

        double area = (4*Math.PI/3) *l*a*h; 
        System.out.println("El area para el elipsoide de largo "+l+" ,de altura "+h+" y de ancho "+a+" es "+Utilidades.Redondear_double(area));
    }

    // eneagono 22
    public static void Ejecutar_eneagono() {
        System.out.println("Ingrese el largo de un lado: ");
        double l = sc.nextDouble(); 

        double ap = (l/2) * (Math.sin(Math.toRadians(70))/Math.sin(Math.toRadians(20))); 
        double area = (9 * ap * l)/2; 
        System.out.println("El area para el eneagono de lado "+l+" es "+ Utilidades.Redondear_double(area));
    }

    // esfera hueca 23
    public static void Ejecutar_esfera_hueca_volumen(){
        System.out.println("Ingrese el radio Interno de la esfera: ");
        double r = sc.nextDouble(); 
        System.out.println("Ingrese el radio Externo de la esfera: ");
        double R = sc.nextDouble(); 

        double volumen = (4/3)*Math.PI*((Math.pow(R, 3))-(Math.pow(r, 3)));
        System.out.println("El volumen de la esfera hueca de radio interno de "+r+" y de radio externo de "+R+" es "+Utilidades.Redondear_double(volumen));

    }

    // esfera inclinada 24
    public static void Ejecutar_esfera_inclinada_volumen() {
        System.out.println("Ingrese el radio de la esfera inclinada: ");
        double r = sc.nextDouble(); 
        System.out.println("Ingrese la altura de la esfera inclinada: ");
        double h = sc.nextDouble(); 

        double volumen = (Math.PI * Math.pow(h, 2) * (3*r - h)) / 3 ; 
        System.out.println("El volumen de la esfera inclinada de radio "+r+" y de altura "+h+" es: "+Utilidades.Redondear_double(volumen));
    }

    //esferoide oblato 25 
    public static void Ejecutar_esferoide_oblato_volumen() {
        System.out.println("Ingrese el radio ecuatorial del esferoide oblato: ");
        double e = sc.nextDouble(); 
        System.out.println("Ingrese el radio polar del esferoide oblato: ");
        double p = sc.nextDouble(); 

        double volumen = (4/3) * Math.PI*Math.pow(e, 2) * p ; 
        System.out.println("El volumen del esferoide oblato de eje ecuatorial"+e+" y eje polar "+p+" es: "+Utilidades.Redondear_double(volumen));
    }

    //
}