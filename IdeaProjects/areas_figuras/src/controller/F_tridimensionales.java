package controller;
import controller.util.Menu;
public class F_tridimensionales {

    public static Menu menu = new Menu();

    //Octagono regular con apotema - Jaime
    public static void ejecutarOctagonoRegularA(){
        float s = menu.readFloat("Ingrese el valor de lado del octagono: ");
        float a = menu.readFloat("Ingrese el valor del apotema: ");
        float area = ((7*a)*s)/2;
        System.out.println("El area del octagono regular con apotema es de: "+area);
    }

    //Ortoedro - Jaime
    public static void ejecutarOrtoedro(){
        float l = menu.readFloat("Ingrese la longitud: ");
        float w = menu.readFloat("Ingrese el ancho: ");
        float h = menu.readFloat("Ingrese la altura: ");
        float area = (2 * l * w) + (2 * l * h) + (2 * w * h);
        System.out.println("El area del ortoedro es de: "+area);
    }

    //Paralelepipedo - jaime
    public static void ejecutarParalelepipedo(){
        float a = menu.readFloat("Ingrese el valor del lado a: ");
        float b = menu.readFloat("Ingrese el valor del lado b: ");
        float c = menu.readFloat("Ingrese el valor del lado c: ");
        float area = 2 * ((a * b) + (a * c) + (b * c));
        System.out.println("El area del paralelepipedo es de: " + area);
    }

    //Paralelogramo - Jaime
    public static void ejecutarParalelogramo(){
        float b = menu.readFloat("Ingrese el valor del la base: ");
        float h = menu.readFloat("Ingrese el valor de la altura: ");
        float area = b * h;
        System.out.println("El area del paralelogramo es de: " + area);
    }

    //Pentagono - Jaime
    public static void ejecutarPentagono(){
        float l = menu.readFloat("Ingrese el valor de un lado");
        float ap = menu.readFloat("Ingrese el valor del apotema: ");
        float area = ((5 * l) * ap)/2;
        System.out.println("El area del pentagono es: " + area);
    }

    //Piramide cuadrada - Jaime
    public static void ejecutarPiramideCuadrada(){
        float a = menu.readFloat("Ingrese el lado de la base: ");
        float h = menu.readFloat("Ingrese la altura: ");
        float area = (float) (Math.pow(a, 2) + (2*a) * Math.sqrt((Math.pow(a, 2)/4)+Math.pow(h, 2)));
        System.out.println("El area de la piramide cuadrada es de " + area);
    }

    //Piramide dodecagonal - Jaime
    public static void ejecutarPiramideDodecagonal(){
        float l = menu.readFloat("Ingrese el valor de un lado de la base: ");
        float p = l*12;
        float apotema = menu.readFloat("Ingrese el valor del apotema: ");
        float area = 2*((p*apotema)/2);
        System.out.println("El area de la piramide dodecagonal es de: "+area);
    }

    //Piramide hexagonal
    public static void ejecutarPiramideHexagonal(){
        float l = menu.readFloat("Ingrese el valor de un lado de la base: ");
        float a_base = menu.readFloat("Ingrese el area de la base: ");
        float a_lateral = menu.readFloat("Ingrese el area lateral: ");
        float area = (3 * l) * (a_base + a_lateral);
        System.out.println("El area de la piramide hexagonal es de: " + area);
    }


    //Rombo - Soledad
    public static void ejecutarRombo() { // 55
        float a = Math.abs(menu.readFloat("Ingrese el valor de la diagonal mayor (D): "));
        float b = Math.abs(menu.readFloat("Ingrese el valor de la diagonal mmenor (d): "));
        float area = (a*b)/2;
        System.out.println("Su area es: "+ area);
    }

    //Romboide - Soledad
    public static void ejecutarRomboide() { // 56
        float a = Math.abs(menu.readFloat("Ingrese el valor de base de la figura (B): "));
        float b = Math.abs(menu.readFloat("Ingrese el valor de la altura de la figura (h): "));
        float area = a*b;
        System.out.println("Su area es: "+ area);
    }

    //Sector Cicular - Soledad
    public static void ejecutarSectorCircular() { // 57
        float a = Math.abs(menu.readFloat("Ingrese el ángulo en radianes (θ): "));
        float b = Math.abs(menu.readFloat("Ingrese el radio de la figura (r): "));
        float areaGrados = (float) ((a / 360) * (Math.PI* (b * b)));
        System.out.println("Su area en grados es : "+ areaGrados);
        System.out.println("Su area es: "+ areaGrados);
    }

    //Segmento Circular - Soledad
    public static void ejecutarSegmentocircular() { // 58
        float a = Math.abs(menu.readFloat("Ingrese el ángulo en grados (θ): "));
        float b = Math.abs(menu.readFloat("Ingrese el radio de la figura (r): "));
        float c= menu.convertirAnguloAradianes(a);
        float areaGrados = (float) (Math.pow(0.5,b)*(c-Math.sin(c)));
        System.out.println("Su area en grados es : "+ areaGrados);
    }

    //Segmento Eliptico - Soledad
    public static void ejecutarSegmentoEliptico() { // 59
        float a = Math.abs(menu.readFloat("Ingrese el semieje mayor de la figura: "));
        float b = Math.abs(menu.readFloat("Ingrese el ángulo del sector en radianes (θ): "));
        float c= menu.convertirAnguloAradianes(b);
        float  d = Math.abs(menu.readFloat("Ingrese el semieje menor de la figura : "));
        float area = (float)((0.5*(a * d)) * (c - Math.sin(c)));
        System.out.println("Su area es: "+ area);
    }

    //SemiCirculo - Soledad
    public static void ejecutarSemiCirculo() { // 60
        float a= Math.abs(menu.readFloat("Ingrese el radio de la figura (r): "));
        float area =(float)(((Math.PI)* (Math.pow(a,2)))/2);
        System.out.println("Su area es: "+ area);
    }

    //SemiEsfera - Soledad
    public static void ejecutarSemiEsfera() { // 61
        float a= Math.abs(menu.readFloat("Ingrese el radio de la figura (r): "));
        float area =(float)((2)*(Math.PI)*(Math.pow(a,2)));
        System.out.println("Su area es: "+ area);
    }

    //Tetraedro - Soledad
    public static void ejecutarTetraedroArea() { // 62
        float a= Math.abs(menu.readFloat("Ingrese la longitud de una arista la figura (a): "));
        float area =(float)(Math.sqrt(3)*(Math.pow(a,2)));
        System.out.println("Su area es: "+ area);
    }

    //TetraedroVolumen - Soledad
    public static void ejecutarTetraedroVolumen() { // 63
        float a= Math.abs(menu.readFloat("Ingrese la longitud de una arista la figura (a): "));
        float volumen =(float)((Math.pow(a,3)* (Math.sqrt(2)))/12);
        System.out.println("El volumen es: "+ volumen);
    }

    //Toroide - Soledad
    public static void ejecutarToroide() { // 64
        float a= Math.abs(menu.readFloat("Ingrese el radio de la circunferencia central (R): "));
        float b= Math.abs(menu.readFloat("Ingrese el radio del circulo geneador (r): "));
        float area =(float)((4)*(Math.pow(Math.PI,2))* (a)*(b));
        System.out.println("El volumen es: "+ area);
    }

    //Trapecio Circular - Soledad
    public static void ejecutarTrapecioCircular() { // 65
        float a= Math.abs(menu.readFloat("Ingrese el radio de la circunferencia exterior (R): "));
        float b= Math.abs(menu.readFloat("Ingrese el radio de la circunferencia interior (r): "));
        float c= Math.abs(menu.readFloat("Ingrese el radio de la figura (r): "));
        float area =(float)((0.5)*(c)*((Math.pow(a,2)) - (Math.pow(b,2))));
        System.out.println("El volumen es: "+ area);
    }

    //Trapecio Isoceles - Soledad
    public static void ejecutarTrapecioIsoceles() { // 66
        float a = Math.abs(menu.readFloat("Ingrese el valor de la base mayor (a): "));
        float b = Math.abs(menu.readFloat("Ingrese el valor de la base mmenor (b): "));
        float c = Math.abs(menu.readFloat("Ingrese el valor de la altura (h): "));
        float area = ((a*b)/2)*(c);
        System.out.println("Su area es: "+ area);
    }

    //Triangulo - Soledad
    public static void ejecutarTriangulo() { // 67
        float a = Math.abs(menu.readFloat("Ingrese el valor de la base (b): "));
        float b = Math.abs(menu.readFloat("Ingrese el valor de la altura (h): "));
        float area = ((a*b)/2);
        System.out.println("Su area es: "+ area);
    }

    //Triangulo Equilatero - Soledad
    public static void ejecutarTrianaguloEquilatero() { // 68
        float a = Math.abs(menu.readFloat("Ingrese la longitud de uno de la figura (a): "));
        float area =(float)((Math.pow(a,2)) / 4);
        System.out.println("Su area es: "+ area);
    }

    //Triangulo Escaleno - Soledad
    public static void ejecutarTrianguloEscaleno() { // 69
        float a = Math.abs(menu.readFloat("Ingrese el valor de la base de la figura  (a): "));
        float b= Math.abs(menu.readFloat("Ingrese el valor de la altura (h): "));
        float area = (a*b)/2;
        System.out.println("Su area es: "+ area);
    }

    //Trinquete - Soledad
    public static void ejecutarTrinquete() { // 69
        float a = Math.abs(menu.readFloat("Ingrese el largo de la figura (L): "));
        float b= Math.abs(menu.readFloat("Ingrese el largo de la figura (a): "));
        float area = (a*b);
        System.out.println("Su area es: "+ area);
    }
}

