/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import static controller.F_bidimensionales.menu;
import controller.util.Utilidades;

/**
 *
 * @author JAIMEUNL
 */
public class F_Alex {
    //Alex Sigcho-arcocircular-area-1
    public static void arcocircular() {
        float radio = menu.readFloat("Ingrese el valor del radio del circulo");
        float angulo = menu.readFloat("Ingrese el valor del angulo en grados");
        double angulorad = Math.toRadians(angulo);
        double area = 0.05 * radio * radio * angulorad;
        System.out.println("El area para el arco circular segun el radio del circulo " + radio + ", angulo en grados " + angulo + " es: " + Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-bipiramidecuadrada-area-2
    public static void bipiramidecuadrada() {
        float lado = menu.readFloat("Ingrese el valor de un lado de la base cuadrada de la bipiramidecuadrada: ");
        float altura = menu.readFloat("Ingrese el valor de la altura de la bipiramidecuadrada: ");
        double base = lado * lado;
        double lados = 2 * lado * altura;
        double area = 2 * base + 4 * lados;
        System.out.println("El area para la bipiramidecuadrada segun lado de la base cuadrada " + lado + ", altura " + altura + " es: " + Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-casqueteesferico-area-3
    public static void casqueteEsferico() {
        double area;
        float radio = menu.readFloat("Ingrese el radio: ");
        float altura = menu.readFloat("Ingrese el valor de la altura del casquete: ");
        area = 2 * Math.PI * radio * altura;
        System.out.println("El area para el casquete esferico segun su radio " + radio + ", altura " + altura + " es: " + Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-circulo-area-4
    public static void circulo() {
        double area;
        float radio = menu.readFloat("Ingrese el valor del radio del circulo");
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo segun su " + radio + " es:" + Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-circuloconcentrico-area-5
    public static void circuloConcentrico() {
        double area1, area2, area;
        float radiomayor = menu.readFloat("Ingrese el valor del radio mayor: ");
        float radiomenor = menu.readFloat("Ingres el valor del radio menor: ");
        area1 = Math.PI * radiomayor * radiomayor;
        area2 = Math.PI * radiomenor * radiomenor;
        area = area1 - area2;
        System.out.println("El area del circulo concentrico segun su radio mayor " + radiomayor + ", radio menor " + radiomenor + " es: " + Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-cilindro-area-6
    public static void cilindro() {
        double area;
        float radio = menu.readFloat("Ingrese el valor del radio de la base del cilindro: ");
        float altura = menu.readFloat("Ingrese el valor de la altura del cilindro: ");
        area = 2 * Math.PI * radio * (radio + altura);
        System.out.println("El area del cilindro segun la base " + radio + ", altura " + altura + " es: " + Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-cilindroeliptico-area-7
    public static void cilindroEliptico() {
        double area;
        float mayor = menu.readFloat("Ingrese el valor del semieje mayor de la base eliptica: ");
        float menor = menu.readFloat("Ingrese el valor del semieje menor de la base eliptica: ");
        float altura = menu.readFloat("Ingrese el valor de la altura del cilindro: ");
        area = 2 * Math.PI * mayor * menor + 2 * Math.PI * mayor * altura;
        System.out.println("El area del cilindro eliptico segun su semieje mayor " + mayor + ", semieje menor " + menor + ", altura " + altura + " es: " + Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-cilindrohueco-area-8
    public static void cilindroHueco() {
        double area;
        float externo = menu.readFloat("Ingrese el valor del radio externo de la base del cilindro: ");
        float interno = menu.readFloat("Ingrese el valor del radio interno de la base del cilindro: ");
        float altura = menu.readFloat("Ingrese el valor de la altura del cilindro: ");
        area = 2 * Math.PI * altura * (externo + interno) + 2 + Math.PI * (externo * externo - interno * interno);
        System.out.println("El area del cilindro hueco segun su radio externo " + externo + ", radio interno " + interno + ", altura " + altura + " es: " + Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-cilindroinclinado-area-9
    public static void cilindroInclinado() {
        double area;
        float radio = menu.readFloat("Ingrese el valor del radio de la base del cilindro: ");
        float altura = menu.readFloat("Ingrese el valor de la altura del cilindro: ");
        area = 2 * Math.PI * radio * (radio * altura);
        System.out.println("El area del cilindro inclinado segun su el radio de la base " + radio + ", altura " + altura + " es: " + Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-cono-area-10
    public static void cono() {
        double generatriz, area;
        float radio = menu.readFloat("Ingrese el valor del radio de la base del cono: ");
        float altura = menu.readFloat("Ingrese el valor de la altura del cono: ");
        generatriz = Math.sqrt(radio * radio + altura * altura);
        area = Math.PI * radio * (radio + generatriz);
        System.out.println("El area del cono segun el radio de la base " + radio + ", altura" + altura + " es: " + Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-conooblicuo-area-11
    public static void conoOblicuo() {
        double area;
        float radio = menu.readFloat("Ingrese el valor del radio de la base del cono: ");
        float generatriz = menu.readFloat("Ingrese el valor de la longitud de la generatriz: ");
        area = Math.PI * radio * (radio + generatriz);
        System.out.println("El area del cono oblicuo segun el radio de la base  " + radio + ", generatriz " + generatriz + " es: " + Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-coronacircular-area-12
    public static void coronaCircular() {
        double area;
        float exterior = menu.readFloat("Ingrese el valor del radio del circulo exterior: ");
        float interior = menu.readFloat("Ingrese el valor del radio del circulo interior: ");
        area = Math.PI * (exterior * exterior - interior * interior);
        System.out.println("El area de la corona circular segun su radio exterior " + exterior + ", radio interior " + interior + " es: " + Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-cubo-area-13
    public static void cubo() {
        double area;
        float lado = menu.readFloat("Ingrese el valor de un lado del cubo: ");
        area = 6 * Math.pow(lado, 2);
        System.out.println("El area del cubo segun su lado " + lado + " es: " + Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-cuboctaedro-area-14
    public static void cuboctaedro() {
        double area;
        float lado = menu.readFloat("Ingrese el valor de un lado del cuboctaedro: ");
        area = 2 * (5 + Math.sqrt(3)) * Math.pow(lado, 2);
        System.out.println("El area del cuboctaedro segun uno de sus lados " + lado + " es: " + Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-decagono-area-15
    public static void decagono() {
        double area;
        float lado = menu.readFloat("Ingrese el valor de un lado del dacagono: ");
        area = (5.0 / 2.0) * (Math.pow(lado, 2)) * (1.0 / Math.tan(Math.PI / 10));
        System.out.println("El area del decagono segun uno de sus lados " + lado + " es: " + Utilidades.Redondear_double(area));
    }

    //Alex Sigcho revisar si poner o no corazon-16
    public static void corazon() {
        int n = 10000;
        double area = 0.0;
        double t;
        double deltaT = 2 * Math.PI / n;

        for (int i = 0; i < n; i++) {
            t = i * deltaT;
            double x = 16 * Math.pow(Math.sin(t), 3);
            double y = 13 * Math.cos(t) - 5 * Math.cos(2 * t) - 2 * Math.cos(3 * t) - Math.cos(4 * t);
            area += x * y * deltaT;
        }
        area = Math.abs(area);
        System.out.println("El area aproximada de la figura corazon es: " + area);
    }
}
