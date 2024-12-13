package controller.util;

import java.util.Scanner;
import controller.*;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void Figuras_mostrar_menu() {
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
        matriz[16][1] = ". Dodecaedro (Area)";

        matriz[17][0] = "18";
        matriz[17][1] = ". Dodecaedro (Volumen)";

        matriz[18][0] = "19";
        matriz[18][1] = ". Dodecágono";

        matriz[19][0] = "20";
        matriz[19][1] = ". Elipse";

        matriz[20][0] = "21";
        matriz[20][1] = ". Elipsoide (Volumen)";

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

        for (int i = 0, j = 0; i <= 34;) {
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

    public static void ejecutar() {
        Figuras_mostrar_menu();
        String secondtMenuInput = sc.nextLine();

        if (validador.validarInt(secondtMenuInput)) {
            do {
                switch (casts.transformStringInt(secondtMenuInput)) {
                    case 0:
                    //salir
                        break;
                    case 1:
                        System.out.println("Figura 1");
                        break;
                    case 2:
                        System.out.println("Figura 2");
                        break;
                    case 3:
                        System.out.println("Figura 3");
                        break;
                    case 4:
                        System.out.println("Figura 4");
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        break;
                    case 12:
                        break;
                    case 13:
                        break;
                    case 14:
                        break;
                    case 15:
                        break;
                    case 16:
                        break;
                    // -------------------------------------------------------------------------
                    case 17:
                        F_bidimensionales.Ejecutar_dodecaedro();
                        break;
                    case 18:
                        F_bidimensionales.Ejecutar_dodecaedro_volumen();
                        break;
                    case 19:
                        F_bidimensionales.Ejecutar_dodecagono();
                        break;
                    case 20:
                        F_bidimensionales.Ejecutar_elipse();
                        break;
                    case 21:
                        F_bidimensionales.Ejecutar_elipsoide_volumen();
                        break;
                    case 22:
                        F_bidimensionales.Ejecutar_eneagono();
                        break;
                    case 23:
                        F_bidimensionales.Ejecutar_esfera_hueca_volumen();
                        break;
                    case 24:
                        F_bidimensionales.Ejecutar_esfera_inclinada_volumen();
                        break;
                    case 25:
                        F_bidimensionales.Ejecutar_esferoide_oblato_volumen();
                        break;
                    case 26:
                        F_bidimensionales.Ejecutar_estrella_5_puntas();
                        break;
                    case 27:
                        F_bidimensionales.Ejecutar_estrella_6_puntas();
                        break;
                    case 28:
                        F_bidimensionales.Ejecutar_dodecaedro_volumen();// Hemisfera
                        break;
                    case 29:
                        F_bidimensionales.Ejecutar_dodecaedro_volumen();// Heptágono
                        break;
                    case 30:
                        F_bidimensionales.Ejecutar_dodecaedro_volumen();// Hexágono
                        break;
                    case 31:
                        F_bidimensionales.Ejecutar_dodecaedro_volumen();// Icosaedro (Area)
                        break;
                    case 32:
                        F_bidimensionales.Ejecutar_dodecaedro_volumen();// Icosaedro (Volumen)
                        break;
                    case 33:
                        F_bidimensionales.Ejecutar_dodecaedro_volumen();// Octaedro (Área)
                        break;
                    case 34:
                        F_bidimensionales.Ejecutar_dodecaedro_volumen();// Octaedro (Volumen)
                        break;
                    case 35:
                        F_bidimensionales.Ejecutar_dodecaedro_volumen();// Octágono
                        break;
                    default:
                        System.out.println("Ingrese un numero entre el 0 y el 35");
                }

            } while (!validador.validarInt(secondtMenuInput) || casts.transformStringInt(secondtMenuInput) > 35);
        } else {
            System.out.println("Ingrese un valor entero entre el 0 y el 35");
        }
    }

}
