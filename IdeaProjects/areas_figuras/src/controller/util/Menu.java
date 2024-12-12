package controller.util;

import controller.F_bidimensionales;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public void runMenu() {
        int userInputfstc;
        do {
            showMenu();
            userInputfstc = readInteger("Seleccione una opcion: ");
            handleMenuOption(userInputfstc);
            if (userInputfstc > 35 || userInputfstc < 0){
                System.out.println("Error, entarada fuera de rango");
            }
        } while (userInputfstc != 0);
    }

    public void showMenu() {
        String[][] matriz = new String[35][2];
        matriz[0][0] = "1";
        matriz[0][1] = ". Arco circular";

        matriz[1][0] = "2";
        matriz[1][1] = ". Bipirámide cuadrada";

        matriz[2][0] = "3";
        matriz[2][1] = ". Casquete esférico";

        matriz[3][0] = "4";
        matriz[3][1] = ". Círculo";

        matriz[4][0] = "5";
        matriz[4][1] = ". Círculo concéntrico";

        matriz[5][0] = "6";
        matriz[5][1] = ". Cilindro";

        matriz[6][0] = "7";
        matriz[6][1] = ". Cilindro elíptico";

        matriz[7][0] = "8";
        matriz[7][1] = ". Cilindro hueco";

        matriz[8][0] = "9";
        matriz[8][1] = ". Cilindro inclinado";

        matriz[9][0] = "10";
        matriz[9][1] = ". Cono";

        matriz[10][0] = "11";
        matriz[10][1] = ". Cono oblicuo";

        matriz[11][0] = "12";
        matriz[11][1] = ". Corona circular";

        matriz[12][0] = "13";
        matriz[12][1] = ". Corazón";

        matriz[13][0] = "14";
        matriz[13][1] = ". Cubo";

        matriz[14][0] = "15";
        matriz[14][1] = ". Cuboctaedro";

        matriz[15][0] = "16";
        matriz[15][1] = ". Decágono";

        matriz[16][0] = "17";
        matriz[16][1] = ". Dodecaedro";

        matriz[17][0] = "18";
        matriz[17][1] = ". Dodecaedro";

        matriz[18][0] = "19";
        matriz[18][1] = ". Dodecágono";

        matriz[19][0] = "20";
        matriz[19][1] = ". Elipse";

        matriz[20][0] = "21";
        matriz[20][1] = ". Elipsoide";

        matriz[21][0] = "22";
        matriz[21][1] = ". Eneágono";

        matriz[22][0] = "23";
        matriz[22][1] = ". Esfera hueca";

        matriz[23][0] = "24";
        matriz[23][1] = ". Esfera inclinada";

        matriz[24][0] = "25";
        matriz[24][1] = ". Esferoide oblato";

        matriz[25][0] = "26";
        matriz[25][1] = ". Estrella de 5 puntas";

        matriz[26][0] = "27";
        matriz[26][1] = ". Estrella de 6 puntas";

        matriz[27][0] = "28";
        matriz[27][1] = ". Hemisfera";

        matriz[28][0] = "29";
        matriz[28][1] = ". Heptágono";

        matriz[29][0] = "30";
        matriz[29][1] = ". Hexágono";

        matriz[30][0] = "31";
        matriz[30][1] = ". Icosaedro";

        matriz[31][0] = "32";
        matriz[31][1] = ". Icosaedro";

        matriz[32][0] = "33";
        matriz[32][1] = ". Octaedro";

        matriz[33][0] = "34";
        matriz[33][1] = ". Octaedro";

        matriz[34][0] = "35";
        matriz[34][1] = ". Octágono";

        for (int i = 0, j = 0; i <= 34; ) {
            if (j == 0) {
                System.out.print(matriz[i][j]);
                j++;
            } else {
                System.out.println(matriz[i][j]);
                i++;
                j--;
            }
        }
    }

    public static void handleMenuOption(int secondMenuInput) {
        switch (secondMenuInput) {
            case 0:
                break;
            case 1:
                F_bidimensionales.arcocircular(); //EJEMPLO DE LLAMADAS A METODOS EN EL MENU
                break;
            case 2:
                F_bidimensionales.bipiramidecuadrada();
                break;
            case 3:
            F_bidimensionales.casqueteesferico();
                break;
            case 4:
            F_bidimensionales.circulo();
                break;
            case 5:
            F_bidimensionales.circuloconcentrico();
                break;
            case 6:
            F_bidimensionales.cilindro();
                break;
            case 7:
            F_bidimensionales.cilindroeliptico();
                break;
            case 8:
            F_bidimensionales.cilindrohueco();
                break;
            case 9:
            F_bidimensionales.cilindroinclinado();
                break;
            case 10:
            F_bidimensionales.cono();
                break;
            case 11:
            F_bidimensionales.conooblicuo();
                break;
            case 12:
            F_bidimensionales.coronacircular();
                break;
            case 13:
            F_bidimensionales.corazon();
                break;
            case 14:
            F_bidimensionales.cubo();
                break;
            case 15:
            F_bidimensionales.cuboctaedro();
                break;
            case 16:
            F_bidimensionales.decagono();
                break;
            case 17:
                break;
        }
    }
    public int readInteger (String message){
        while (true) {
            System.out.print(message);
            String input = sc.next();
            if (validador.validarInt(input)) {
                return casts.transformStringInt(input);
            } else {
                System.out.println("Ingrese un numero entero valido");
            }
        }
    }
    public float readFloat (String message){
        while (true) {
            System.out.print(message);
            String input = sc.next();
            if (validador.validarFloat(input)) {
                return casts.transformStringFloat(input);
            } else {
                System.out.println("Ingrese un numero valido");
            }
        }
    }
    public String readString (String message){
        System.out.print(message);
        return sc.next();
    }
}