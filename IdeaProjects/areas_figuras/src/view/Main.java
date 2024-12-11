package view;

import controller.util.*;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String firstMenutInput;
        do {
            System.out.println("--UNL Presenta--");
            System.out.println("Calculadora de Area y volumenes de Figuras");
            System.out.println("1. Calcular area de figuras");
            System.out.println("2. Calcular Volumen de figuras");
            System.out.println("0. Salir");
            firstMenutInput = sc.next();

            if (validador.validarInt(firstMenutInput)) {
                switch (casts.transformStringInt(firstMenutInput)) {
                    case 0:
                        break;
                    case 1:
                        System.out.println("Figuras Bidimensionales");
                        Menu.ejecutar();
                        break;
                    case 2:
                        System.out.println("Figuras Tridimensionales");
                        //Menu.ejecutar(); Tridimencionales
                        break;
                    default:
                        System.out.println("Ingrese un valor entre el 1 y el 2");
                }
            } else {
                System.out.println("Ingrese un valor entero entre 1 y 2");
            }

        } while (!validador.validarInt(firstMenutInput) || casts.transformStringInt(firstMenutInput) > 1);

    }
}