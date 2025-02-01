/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author JAIMEUNL
 */
public class F_Jaime {
    
    //Octagono regular con apotema - Jaime
    public static float ejecutarOctagonoRegularA(float s, float a) {
        return ((7 * a) * s) / 2;
    }
    
    //Ortoedro - Jaime
    public static void ejecutarOrtoedro() {
        float l = menu.readFloat("Ingrese la longitud: ");
        float w = menu.readFloat("Ingrese el ancho: ");
        float h = menu.readFloat("Ingrese la altura: ");
        float area = (2 * l * w) + (2 * l * h) + (2 * w * h);
        System.out.println("El area del ortoedro es de: " + area);
    }

    //Paralelepipedo - jaime
    public static void ejecutarParalelepipedo() {
        float a = menu.readFloat("Ingrese el valor del lado a: ");
        float b = menu.readFloat("Ingrese el valor del lado b: ");
        float c = menu.readFloat("Ingrese el valor del lado c: ");
        float area = 2 * ((a * b) + (a * c) + (b * c));
        System.out.println("El area del paralelepipedo es de: " + area);
    }

    //Paralelogramo - Jaime
    public static void ejecutarParalelogramo() {
        float b = menu.readFloat("Ingrese el valor del la base: ");
        float h = menu.readFloat("Ingrese el valor de la altura: ");
        float area = b * h;
        System.out.println("El area del paralelogramo es de: " + area);
    }

    //Pentagono - Jaime
    public static void ejecutarPentagono() {
        float l = menu.readFloat("Ingrese el valor de un lado");
        float ap = menu.readFloat("Ingrese el valor del apotema: ");
        float area = ((5 * l) * ap) / 2;
        System.out.println("El area del pentagono es: " + area);
    }

    //Piramide cuadrada - Jaime
    public static void ejecutarPiramideCuadrada() {
        float a = menu.readFloat("Ingrese el lado de la base: ");
        float h = menu.readFloat("Ingrese la altura: ");
        float area = (float) (Math.pow(a, 2) + (2 * a) * Math.sqrt((Math.pow(a, 2) / 4) + Math.pow(h, 2)));
        System.out.println("El area de la piramide cuadrada es de " + area);
    }

   

    //Piramide hexagonal
    public static void ejecutarPiramideHexagonal() {
        float l = menu.readFloat("Ingrese el valor de un lado de la base: ");
        float a_base = menu.readFloat("Ingrese el area de la base: ");
        float a_lateral = menu.readFloat("Ingrese el area lateral: ");
        float area = (3 * l) * (a_base + a_lateral);
        System.out.println("El area de la piramide hexagonal es de: " + area);
    }
}

    
    
    //  calcular el área de la base dodecagonal
    public static float areaBaseDodecagonal(float a) {
        return (float) (3 * (2 + Math.sqrt(3)) * Math.pow(a, 2));
    }
    // calcular el volumen de la pirámide dodecagonal
    public static float  calcularVolumen(float l, float a) {
        float b = areaBaseDodecagonal(l);
        return (float) ((1.0 / 3.0) * b * a);
    }