package controller;

import controller.util.Menu;
import controller.util.Utilidades;

public class F_bidimensionales {
    static Menu menu = new Menu();

    //Alex Sigcho-arcocircular-area-1
    public static void arcocircular(){
        float radio = menu.readFloat("Ingrese el valor del radio del circulo");
        float angulo = menu.readFloat("Ingrese el valor del angulo en grados");
        double angulorad = Math.toRadians(angulo);
        double area =0.05*radio*radio*angulorad;
        System.out.println("El area para el arco circular segun el radio del circulo "+radio+", angulo en grados "+angulo+" es: "+Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-bipiramidecuadrada-area-2
    public static void bipiramidecuadrada(){
        float lado = menu.readFloat("Ingrese el valor de un lado de la base cuadrada de la bipiramidecuadrada: ");
        float altura = menu.readFloat("Ingrese el valor de la altura de la bipiramidecuadrada: ");
        double base = lado*lado;
        double lados = 2*lado*altura;
        double area =2*base+4*lados;
        System.out.println("El area para la bipiramidecuadrada segun lado de la base cuadrada "+lado+", altura "+altura+" es: "+Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-casqueteesferico-area-3
    public static void casqueteEsferico(){
        double area;
        float radio = menu.readFloat("Ingrese el radio: ");
        float altura = menu.readFloat("Ingrese el valor de la altura del casquete: ");
        area =2* Math.PI *radio*altura;
        System.out.println("El area para el casquete esferico segun su radio "+radio+", altura "+altura+" es: "+Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-circulo-area-4
    public static void circulo(){
        double area;
        float radio = menu.readFloat("Ingrese el valor del radio del circulo");
        area= Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo segun su "+radio+" es:"+Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-circuloconcentrico-area-5
    public static void circuloConcentrico(){
        double area1,area2,area;
        float radiomayor = menu.readFloat("Ingrese el valor del radio mayor: ");
        float radiomenor = menu.readFloat("Ingres el valor del radio menor: ");
        area1= Math.PI *radiomayor*radiomayor;
        area2= Math.PI *radiomenor*radiomenor;
        area=area1-area2;
        System.out.println("El area del circulo concentrico segun su radio mayor "+radiomayor+", radio menor "+radiomenor+" es: "+Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-cilindro-area-6
    public static void cilindro(){
        double area;
        float radio = menu.readFloat("Ingrese el valor del radio de la base del cilindro: ");
        float altura = menu.readFloat("Ingrese el valor de la altura del cilindro: ");
        area = 2 * Math.PI *radio*(radio+altura);
        System.out.println("El area del cilindro segun la base "+radio+", altura "+altura+" es: "+Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-cilindroeliptico-area-7
    public static void cilindroEliptico(){
        double area;
        float mayor = menu.readFloat("Ingrese el valor del semieje mayor de la base eliptica: ");
        float menor = menu.readFloat("Ingrese el valor del semieje menor de la base eliptica: ");
        float altura = menu.readFloat("Ingrese el valor de la altura del cilindro: ");
        area= 2 *  Math.PI *mayor*menor +2 * Math.PI*mayor*altura;
        System.out.println("El area del cilindro eliptico segun su semieje mayor "+mayor+", semieje menor "+menor+", altura "+altura+" es: "+Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-cilindrohueco-area-8
    public static void cilindroHueco(){
        double area;
        float externo = menu.readFloat("Ingrese el valor del radio externo de la base del cilindro: ");
        float interno = menu.readFloat("Ingrese el valor del radio interno de la base del cilindro: ");
        float altura = menu.readFloat("Ingrese el valor de la altura del cilindro: ");
        area=2* Math.PI*altura*(externo+interno)+ 2 +Math.PI *(externo*externo - interno*interno);
        System.out.println("El area del cilindro hueco segun su radio externo "+externo+", radio interno "+interno+", altura "+altura+" es: "+Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-cilindroinclinado-area-9
    public static void cilindroInclinado(){
        double area;
        float radio = menu.readFloat("Ingrese el valor del radio de la base del cilindro: ");
        float altura = menu.readFloat("Ingrese el valor de la altura del cilindro: ");
        area=2* Math.PI *radio*(radio*altura);
        System.out.println("El area del cilindro inclinado segun su el radio de la base "+radio+", altura "+altura+" es: "+Utilidades.Redondear_double(area) );
    }

    //Alex Sigcho-cono-area-10
    public static void cono(){
        double generatriz, area;
        float radio = menu.readFloat("Ingrese el valor del radio de la base del cono: ");
        float altura = menu.readFloat("Ingrese el valor de la altura del cono: ");
        generatriz= Math.sqrt(radio*radio + altura*altura);
        area = Math.PI *radio*(radio+generatriz);
        System.out.println("El area del cono segun el radio de la base "+radio+", altura"+altura+" es: "+Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-conooblicuo-area-11
    public static void conoOblicuo(){
        double area;
        float radio = menu.readFloat("Ingrese el valor del radio de la base del cono: ");
        float generatriz = menu.readFloat("Ingrese el valor de la longitud de la generatriz: ");
        area = Math.PI * radio * (radio + generatriz);
        System.out.println("El area del cono oblicuo segun el radio de la base  "+radio+", generatriz "+generatriz+" es: "+Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-coronacircular-area-12
    public static void coronaCircular(){
        double area;
        float exterior = menu.readFloat("Ingrese el valor del radio del circulo exterior: ");
        float interior = menu.readFloat("Ingrese el valor del radio del circulo interior: ");
        area = Math.PI *(exterior*exterior-interior*interior);
        System.out.println("El area de la corona circular segun su radio exterior "+exterior+", radio interior "+interior+" es: "+Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-cubo-area-13
    public static void cubo(){
        double area;
        float lado = menu.readFloat("Ingrese el valor de un lado del cubo: ");
        area = 6 * Math.pow(lado, 2);
        System.out.println("El area del cubo segun su lado "+lado+" es: "+Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-cuboctaedro-area-14
    public static void cuboctaedro(){
        double area;
        float lado = menu.readFloat("Ingrese el valor de un lado del cuboctaedro: ");
        area = 2 * (5 + Math.sqrt(3)) * Math.pow(lado, 2);
        System.out.println("El area del cuboctaedro segun uno de sus lados "+lado+" es: "+Utilidades.Redondear_double(area));
    }

    //Alex Sigcho-decagono-area-15
    public static void decagono(){
        double area;
        float lado = menu.readFloat("Ingrese el valor de un lado del dacagono: ");
        area = (5.0/2.0) * (Math.pow(lado, 2)) * (1.0/ Math.tan(Math.PI/10));
        System.out.println("El area del decagono segun uno de sus lados "+lado+" es: "+Utilidades.Redondear_double(area));
    }

    //Alex Sigcho revisar si poner o no corazon-16
    public static void corazon(){
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

    // dodecaedro area 17
    public static void Ejecutar_dodecaedro() {
        float a = menu.readFloat("Ingrese el valor de la arista en cm: ");
        float area = (float) (3 * Math.sqrt(25 + 10 * Math.sqrt(5)) * Math.pow(a, 2));
        System.out.println("El area del dodecaedro de arista a = " + a + " es: " + Utilidades.Redondear_double(area));
    }

    // dodecaedro volumne 18
    public static void Ejecutar_dodecaedro_volumen() {
        float a = menu.readFloat("Ingrese el valor de la arista en cm: ");
        float volumen = (float) (((15 + 7 * Math.sqrt(5)) * Math.pow(a, 3)) / 4);
        System.out.println("El volumen del dodecaedro de arista a = " + a + " es: " + Utilidades.Redondear_double(volumen));
    }

    // dodecagono 19
    public static void Ejecutar_dodecagono() {
        float l = menu.readFloat("Ingrese el valor de un lado en cm: ");
        float area = (float) (5 * l * (l / (2 * Math.tan(Math.toRadians(18)))));
        System.out.println("El area del dodecaedro de lado " + l + " es: " + Utilidades.Redondear_double(area));
    }

    // elipse 20
    public static void Ejecutar_elipse() {
        float a = menu.readFloat("Ingrese el eje superior en cm: ");
        float b = menu.readFloat("Ingrese el eje inferior: ");
        float area = (float) (Math.PI * a * b);

        System.out.println("El area de la elipse de eje superior " + a + " y de eje inferior " +b + " es: "+ Utilidades.Redondear_double(area));
    }

    // elipsoide 21
    public static void Ejecutar_elipsoide_volumen() {
        float l = menu.readFloat("Ingrese el largo de un lado: ");
        float h = menu.readFloat("Ingrese la altura: ");
        float a = menu.readFloat("Ingrese el ancho: ");
        double area = (4*Math.PI/3) *l*a*h; 
        System.out.println("El area para el elipsoide de largo "+l+" ,de altura "+h+" y de ancho "+a+" es "+Utilidades.Redondear_double(area));
    }

    // eneagono 22
    public static void Ejecutar_eneagono() {
        float l = menu.readFloat("Ingrese el largo de un lado: ");
        double ap = (l/2) * (Math.sin(Math.toRadians(70))/Math.sin(Math.toRadians(20))); 
        double area = (9 * ap * l)/2; 
        System.out.println("El area para el eneagono de lado "+l+" es "+ Utilidades.Redondear_double(area));
    }

    // esfera hueca 23
    public static void Ejecutar_esfera_hueca_volumen(){
        float r = menu.readFloat("Ingrese el radio Interno de la esfera: ");
        float R = menu.readFloat("Ingrese el radio Externo de la esfera: ");
        double volumen = ((double) 4 /3)*Math.PI*((Math.pow(R, 3))-(Math.pow(r, 3)));
        System.out.println("El volumen de la esfera hueca de radio interno de "+r+" y de radio externo de "+R+" es "+Utilidades.Redondear_double(volumen));
    }

    // esfera inclinada 24
    public static void Ejecutar_esfera_inclinada_volumen() {
        float r = menu.readFloat("Ingrese el radio de la esfera inclinada: ");
        float h = menu.readFloat("Ingrese la altura de la esfera inclinada: ");
        double volumen = (Math.PI * Math.pow(h, 2) * (3*r - h)) / 3 ; 
        System.out.println("El volumen de la esfera inclinada de radio "+r+" y de altura "+h+" es: "+Utilidades.Redondear_double(volumen));
    }

    //esferoide oblato 25 
    public static void Ejecutar_esferoide_oblato_volumen() {
        float e = menu.readFloat("Ingrese el radio ecuatorial del esferoide oblato: ");
        float p = menu.readFloat("Ingrese el radio polar del esferoide oblato: ");
        double volumen = ((double) 4 /3) * Math.PI*Math.pow(e, 2) * p ;
        System.out.println("El volumen del esferoide oblato de eje ecuatorial"+e+" y eje polar "+p+" es: "+Utilidades.Redondear_double(volumen));
    }
}