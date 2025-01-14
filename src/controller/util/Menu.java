package controller.util;

import controller.F_bidimensionales;
import controller.F_tridimensionales;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public void runMenu() {
        int userInputfstc;
        do {
            showMenu();
            userInputfstc = readInteger("Seleccione una opcion: ");
            handleMenuOption(userInputfstc);
            if (userInputfstc > 70 || userInputfstc < 0){
                System.out.println("Error, entarada fuera de rango");
            }
        } while (userInputfstc != 0);
    }

    public void showMenu() {
        String[][] matriz = new String[70][2];
        matriz[0][0] = "1";
        matriz[0][1] = ". Arco circular (Area)";

        matriz[1][0] = "2";
        matriz[1][1] = ". Bipirámide cuadrada (Area)";

        matriz[2][0] = "3";
        matriz[2][1] = ". Casquete esférico (Area)";

        matriz[3][0] = "4";
        matriz[3][1] = ". Círculo (Area)";

        matriz[4][0] = "5";
        matriz[4][1] = ". Círculo concéntrico (Area)";

        matriz[5][0] = "6";
        matriz[5][1] = ". Cilindro (Area)";

        matriz[6][0] = "7";
        matriz[6][1] = ". Cilindro elíptico (Area)";

        matriz[7][0] = "8";
        matriz[7][1] = ". Cilindro hueco (Area)";

        matriz[8][0] = "9";
        matriz[8][1] = ". Cilindro inclinado (Area)";

        matriz[9][0] = "10";
        matriz[9][1] = ". Cono (Area)";

        matriz[10][0] = "11";
        matriz[10][1] = ". Cono oblicuo (Area)";

        matriz[11][0] = "12";
        matriz[11][1] = ". Corona circular (Area)";

        matriz[12][0] = "13";
        matriz[12][1] = ". Corazón (Area)";

        matriz[13][0] = "14";
        matriz[13][1] = ". Cubo (Area)";

        matriz[14][0] = "15";
        matriz[14][1] = ". Cuboctaedro (Volumen)";

        matriz[15][0] = "16";
        matriz[15][1] = ". Decágono (Area)";

        matriz[16][0] = "17";
        matriz[16][1] = ". Dodecaedro (Area)";

        matriz[17][0] = "18";
        matriz[17][1] = ". Dodecaedro (Volumen)";

        matriz[18][0] = "19";
        matriz[18][1] = ". Dodecágono (Area)";

        matriz[19][0] = "20";
        matriz[19][1] = ". Elipse (Area)";

        matriz[20][0] = "21";
        matriz[20][1] = ". Elipsoide (Volumen)";

        matriz[21][0] = "22";
        matriz[21][1] = ". Eneágono (Area)";

        matriz[22][0] = "23";
        matriz[22][1] = ". Esfera hueca (Volumen)";

        matriz[23][0] = "24";
        matriz[23][1] = ". Esfera inclinada (Volumen)";

        matriz[24][0] = "25";
        matriz[24][1] = ". Esferoide oblato (Volumen)";

        matriz[25][0] = "26";
        matriz[25][1] = ". Estrella de 5 puntas (Area)";

        matriz[26][0] = "27";
        matriz[26][1] = ". Estrella de 6 puntas (Area)";

        matriz[27][0] = "28";
        matriz[27][1] = ". Hemisfera (Area)";

        matriz[28][0] = "29";
        matriz[28][1] = ". Heptágono (Area)";

        matriz[29][0] = "30";
        matriz[29][1] = ". Hexágono (Area)";

        matriz[30][0] = "31";
        matriz[30][1] = ". Icosaedro (Area)";

        matriz[31][0] = "32";
        matriz[31][1] = ". Icosaedro (Volumen)";

        matriz[32][0] = "33";
        matriz[32][1] = ". Octaedro (Area)";

        matriz[33][0] = "34";
        matriz[33][1] = ". Octaedro (Volumen)";

        matriz[34][0] = "35";
        matriz[34][1] = ". Octágono (Area)";

        matriz[35][0] = "36";
        matriz[35][1] = ". Octágono regular con apotema (Area)";

        matriz[36][0] = "37";
        matriz[36][1] = ". Ortoedro (Area)";

        matriz[37][0] = "38";
        matriz[37][1] = ". Paralelepípedo (Area)";

        matriz[38][0] = "39";
        matriz[38][1] = ". Paralelogramo (Area)";

        matriz[39][0] = "40";
        matriz[39][1] = ". Pentágono (Area)";

        matriz[40][0] = "41";
        matriz[40][1] = ". Piramide cuadrada (Area)";

        matriz[41][0] = "42";
        matriz[41][1] = ". Piramide dodecagonal (Area)";

        matriz[42][0] = "43";
        matriz[42][1] = ". Piramide hexagonal (Area)";

        matriz[43][0] = "44";
        matriz[43][1] = ". Piramide oblicua (Area)";

        matriz[44][0] = "45";
        matriz[44][1] = ". Piramide pentagonal (Area)";

        matriz[45][0] = "46";
        matriz[45][1] = ". Piramide triangular (Area)";

        matriz[46][0] = "47";
        matriz[46][1] = ". Piramide truncada (Area)";

        matriz[47][0] = "48";
        matriz[47][1] = ". Poligono regular (Area)";

        matriz[48][0] = "49";
        matriz[48][1] = ". Prisma dodecagonal (Area)";

        matriz[49][0] = "50";
        matriz[49][1] = ". Prisma hexagonal (Area)";

        matriz[50][0] = "51";
        matriz[50][1] = ". Prisma pentagonal (Area)";

        matriz[51][0] = "52";
        matriz[51][1] = ". Prisma rectangular (Area)";

        matriz[52][0] = "53";
        matriz[52][1] = ". Prisma triangular (Area)";

        matriz[53][0] = "54";
        matriz[53][1] = ". Rectangulo (Area)";

        matriz[54][0] = "55";
        matriz[54][1] = ". Rombo (Area)";

        matriz[55][0] = "56";
        matriz[55][1] = ". Romboide (Area)";

        matriz[56][0] = "57";
        matriz[56][1] = ". Sector circular (Area)";

        matriz[57][0] = "58";
        matriz[57][1] = ". Segmento circular (Area)";

        matriz[58][0] = "59";
        matriz[58][1] = ". Segmento eliptico (Area)";

        matriz[59][0] = "60";
        matriz[59][1] = ". Semicirculo (Area)";

        matriz[60][0] = "61";
        matriz[60][1] = ". Semiesfera (Area)";

        matriz[61][0] = "62";
        matriz[61][1] = ". Tetraedro (Area)";

        matriz[62][0] = "63";
        matriz[62][1] = ". Tetraedro (Volumen)";

        matriz[63][0] = "64";
        matriz[63][1] = ". Toroide (Area)";

        matriz[64][0] = "65";
        matriz[64][1] = ". Trapecio circular (Area)";

        matriz[65][0] = "66";
        matriz[65][1] = ". Trapecio isoceles (Area)";

        matriz[66][0] = "67";
        matriz[66][1] = ". Triangulo (Area)";

        matriz[67][0] = "68";
        matriz[67][1] = ". Triangulo equilatero (Area)";

        matriz[68][0] = "69";
        matriz[68][1] = ". Triangulo escaleno (Area)";

        matriz[69][0] = "70";
        matriz[69][1] = ". Triqueta (Area)";

        for (int i = 0, j = 0; i <= 69; ) {
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

    public void opcionDesarrollo(){
        System.out.println("Figura en desarrollo...");
    }

    public  void handleMenuOption(int secondMenuInput) {
        switch (secondMenuInput) {
            case 0:
                System.out.println("Saliendo...");
                break;
            case 1:
                F_bidimensionales.arcocircular();
                break;
            case 2:
                F_bidimensionales.bipiramidecuadrada();
                break;
            case 3:
                F_bidimensionales.casqueteEsferico();
                break;
            case 4:
                F_bidimensionales.circulo();
                break;
            case 5:
                F_bidimensionales.circuloConcentrico();
                break;
            case 6:
                F_bidimensionales.cilindro();
                break;
            case 7:
                F_bidimensionales.cilindroEliptico();
                break;
            case 8:
                F_bidimensionales.cilindroHueco();
                break;
            case 9:
                F_bidimensionales.cilindroInclinado();
                break;
            case 10:
                F_bidimensionales.cono();
                break;
            case 11:
                F_bidimensionales.conoOblicuo();
                break;
            case 12:
                F_bidimensionales.coronaCircular();
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
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                opcionDesarrollo();
            case 36:
                F_tridimensionales.ejecutarOctagonoRegularA();
                break;
            case 37:
                F_tridimensionales.ejecutarOrtoedro();
                break;
            case 38:
                F_tridimensionales.ejecutarParalelepipedo();
                break;
            case 39:
                F_tridimensionales.ejecutarParalelogramo();
                break;
            case 40:
                F_tridimensionales.ejecutarPentagono();
                break;
            case 41:
                F_tridimensionales.ejecutarPiramideCuadrada();
                break;
            case 42:
                F_tridimensionales.ejecutarPiramideDodecagonal();
                break;
            case 43:
                F_tridimensionales.ejecutarPiramideHexagonal();
                break;
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
                F_tridimensionales.ejecutarRombo();
                break;
            case 56:
                F_tridimensionales.ejecutarRomboide();
                break;
            case 57:
                F_tridimensionales.ejecutarSectorCircular();
                break;
            case 58:
                F_tridimensionales.ejecutarSegmentocircular();
                break;
            case 59:
                F_tridimensionales.ejecutarSegmentoEliptico();
                break;
            case 60:
                F_tridimensionales.ejecutarSemiCirculo();
                break;
            case 61:
                F_tridimensionales.ejecutarSemiEsfera();
                break;
            case 62:
                F_tridimensionales.ejecutarTetraedroArea();
                break;
            case 63:
                F_tridimensionales.ejecutarTetraedroVolumen();
                break;
            case 64:
                F_tridimensionales.ejecutarToroide();
                break;
            case 65:
                F_tridimensionales.ejecutarTrapecioCircular();
                break;
            case 66:
                F_tridimensionales.ejecutarTrapecioIsoceles();
                break;
            case 67:
                F_tridimensionales.ejecutarTriangulo();
                break;
            case 68:
                F_tridimensionales.ejecutarTrianaguloEquilatero();
                break;
            case 69:
                F_tridimensionales.ejecutarTrianguloEscaleno();
                break;
            case 70:
                F_tridimensionales.ejecutarTrinquete();
                break;
            default:
                System.out.println("Ingrese una opcion valida...");
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
    public float convertirAnguloAradianes (float angulo){
        return (float)Math.toRadians(angulo);
    }
    
    public float readFloat (String message){
        while (true) {
            System.out.print(message); // presenta el mensaje que recibe 
            String input = sc.next(); //lee y la respuesta
             
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
