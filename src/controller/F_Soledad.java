/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author JAIMEUNL
 */
public class F_Soledad {
    
    public static float ejecutarOctaedroArea(float a)  { // a = arista 
        return (float)(2 * Math.sqrt(3) * Math.pow(a, 2));
    }
    public static float ejecutarOctaedroVolumen(float a)  { // a = longitud
        return (float)((Math.sqrt(2) / 3) * Math.pow(a, 3));
    }
    public static float ejecutarOrtoedro(float l, float w, float h) { // 3
        return (2 * l * w) + (2 * l * h) + (2 * w * h); // l = longitud  - w = ancho- h = altua
    }
    public static float ejecutarParalelepipedo(float a, float b, float c) { // a = lado - b = lado - c = lado
        return 2 * ((a * b) + (a * c) + (b * c));  
    }
    public static float ejecutarPiramideCuadrada(float a, float h) { // a = base - h = altura
        return (float) (Math.pow(a, 2) + (2 * a) * Math.sqrt((Math.pow(a, 2) / 4) + Math.pow(h, 2)));
    }
    public static float areaBaseDodecagonal(float a) { // a longitud de un lado
        return (float) (3 * (2 + Math.sqrt(3)) * Math.pow(a, 2));
    }
    // calcular el volumen de la pirámide dodecagonal
    public static float ejecutarVolumenDodecagonal(float l, float a) {// l = area base , a = atura 
        float b = areaBaseDodecagonal(l);
        return (float) ((1.0 / 3.0) * b * a);
    }
    public static float ejecutarPiramideHexagonal(float l, float a_base, float a_lateral) { // l = lado de la base - a_base = area base - a_lateral
        return (3 * l) * (a_base + a_lateral);
    }
    public static float ejecutarPiramideOblicua(float l, float a) { // l = lado base - a = altura
        // Área de la base (cuadrada)
        float areaBase = l * l;
        // Área lateral 
        float apotema = (float) Math.sqrt((l / 2) * (l / 2) + a* a); 
        float areaLateral = 4 * (0.5f * l * apotema); 
        // Área total
        return areaBase + areaLateral;
    }
    public static float ejecutarPiramidePentagonal(float l, float al) { // l = lado base - al = altura lateral 
        // perímetro de la base
        float perimetroBase = 5 * l;
        // apotema 
        float apotemaBase = 0.5f * (float) Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * l; // Apotema
        // Área de la base
        float areaBase = (perimetroBase * apotemaBase) / 2;
        // Área lateral
        float areaLateral = (5 * l * al) / 2;
        // Área total
        return areaBase + areaLateral;
    }
    public static float ejecutarPiramideTriangular(float b, float a, float al) { // b = baseTriangulo a = alturaTriangulo al = altura lateral 
        // área de la base 
        float areaBase = (b * a) / 2;
        //  área lateral
        float areaLateral = 3 * (0.5f * b * al);
        // Área total
        return areaBase + areaLateral;
    }
    public static float ejecutarPiramideTruncada(float lm, float ln, float al) { // lm = ladoBaseMayor ln = ladoBaseMenor al = alturaLateral
        float perimetroBaseMayor = 4 * lm;
        float perimetroBaseMenor = 4 * ln;
        // Área lateral 
        float areaLateral = ((perimetroBaseMayor + perimetroBaseMenor) / 2) * al;
        return (lm * lm ) + (ln * ln) + areaLateral;
    }
    // area de la base 
    public static float ejecutarBaseDodecagonal(float l) { // l = lado
        return (float) (3 * (2 + Math.sqrt(3)) * Math.pow(l, 2));
    }
    public static float ejecutarPrismaDodecagonal(float l, float a) { // l = lado , a = altura
        float areaBase = ejecutarBaseDodecagonal(l);
        return areaBase + ((12 * l) * a); 
    }
    // area de la base
    public static float ejecutarBaseHexagonal(float l) { // l = lado
        return (float) ((3 * Math.sqrt(3) / 2) * Math.pow(l, 2));
    }
    public static float ejecutarPrismaHexagonal(float l, float a) { // l = lado a = altura
        float areaBase = ejecutarBaseHexagonal(l);
        return 2 * areaBase + ((6 * l) * a);
    }
    public static float ejecutarBasePentagonal(float l, float a) {// l = lado a = apotema
        return (5 / 2.0f) * a * l;
    }
    public static float ejecutarPrismaPentagonal(float l ,float a, float al) { // l = lado a = apotema al = altura
        float areaBase = ejecutarBasePentagonal(l, a);
        return 2 * areaBase + ((5 * l) * al); 
    }
    public static float ejecutarPrismaRectangular(float l, float a, float h) { // l = longitud- a = ancho h =altura
        return 2 * (l* a + l * h + a * h);
    }
    // área de la base 
    public static float ejecutarBaseTriangular(float b, float a) { // b = base a = altura
        return 0.5f * b * a;
    }
    public static float areaSuperficialPrismaTriangular(float a, float b, float c, float at, float ag) {
        // a = ladoA, b = ladoB, c = ladoC ; at = altura prisma  ag = altura triangulo
        float areaBase = ejecutarBaseTriangular(b, ag); 
        return 2 * areaBase + ((a + b + c) * at); // Área total
    }
    public static float ejecutarSemiEsfera(float a) { // a = radio
        return (float) ((2) * (Math.PI) * (Math.pow(a, 2)));

    }
    public static float ejecutarTetraedroArea(float a) { // a = arista 
        return (float) (Math.sqrt(3) * (Math.pow(a, 2)));
    }
    public static float ejecutarTetraedroVolumen(float a) { // a = arista 
        return (float) ((Math.pow(a, 3) * (Math.sqrt(2))) / 12);
    }
    public static float ejecutarToroide( float a, float b) { //a = radio de la circunferencia central - b = radio circulo geneador
        return (float) ((4) * (Math.pow(Math.PI, 2)) * (a) * (b));
        
    }   
}

   

    

    
