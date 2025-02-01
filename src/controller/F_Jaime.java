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
    public static float ejecutarOrtoedro(float l, float w, float h) {
        //l : ("Ingrese la longitud: ");
        //w : ("Ingrese el ancho: ");
        //h : ("Ingrese la altura: ");
        return (2 * l * w) + (2 * l * h) + (2 * w * h);
    }

    //Paralelepipedo - jaime
    public static float ejecutarParalelepipedo(float a, float b, float c) {
        //a : ("Ingrese el valor del lado a: ");
        //b : ("Ingrese el valor del lado b: ");
        //c : ("Ingrese el valor del lado c: ");
        return 2 * ((a * b) + (a * c) + (b * c));
    }

    //Paralelogramo - Jaime
    public static float ejecutarParalelogramo(float b, float h) {
        //b : ("Ingrese el valor del la base: ");
        //h : ("Ingrese el valor de la altura: ");
        return b * h;
    }

    //Pentagono - Jaime
    public static float ejecutarPentagono(float l, float ap) {
        //l : ("Ingrese el valor de un lado");
        //ap : ("Ingrese el valor del apotema: ");
        return ((5 * l) * ap) / 2;
    }

    //Piramide cuadrada - Jaime
    public static float ejecutarPiramideCuadrada(float a, float h) {
        //a : ("Ingrese el lado de la base: ");
        //h : ("Ingrese la altura: ");
        return (float) (Math.pow(a, 2) + (2 * a) * Math.sqrt((Math.pow(a, 2) / 4) + Math.pow(h, 2)));
    }

    //Piramide dodecagonal - Jaime
    public static float ejecutarPiramideDodecagonal(float l, float apotema) {
        //l : ("Ingrese el valor de un lado de la base: ");
        float p = l * 12;
        //apotema : ("Ingrese el valor del apotema: ");
        return 2 * ((p * apotema) / 2);
    }

    //Piramide hexagonal
    public static float ejecutarPiramideHexagonal(float l, float a_base, float a_lateral, float area) {
        //l : ("Ingrese el valor de un lado de la base: ");
        //a_base : ("Ingrese el area de la base: ");
        //a_lateral : ("Ingrese el area lateral: ");
        return (3 * l) * (a_base + a_lateral);
    }
}
