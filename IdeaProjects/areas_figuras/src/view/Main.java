package view;

import controller.util.Figuras;
import controller.util.casts;
import controller.util.validador;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstMenutInput;
        do {
            System.out.println("0. Salir");
            System.out.println("1. Calcular area de figuras");
            firstMenutInput = sc.next();
            if(validador.validarInt(firstMenutInput)){
                switch(casts.transformStringInt(firstMenutInput)){
                    case 0:
                        break;
                    case 1:
                        System.out.println("Figuras bidimensionales");
                        Figuras.ejecutar();
                    default:
                        System.out.println("Ingrese un valor entre el 1 y el 2");
                }
            }else{
                System.out.println("Ingrese un valor entero entre 1 y 2");
            }

        } while (!validador.validarInt(firstMenutInput) || casts.transformStringInt(firstMenutInput) > 1);

    }
}