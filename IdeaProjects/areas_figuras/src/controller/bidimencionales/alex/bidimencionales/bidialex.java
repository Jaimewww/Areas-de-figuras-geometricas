package controller.bidimencionales.alex.bidimencionales;

import java.util.Scanner;

public class bidialex {
    //Alex Sigcho
    void arcocircular(){
        Scanner sc = new Scanner(System.in);
        double radio,angulo,angulorad,area;
        System.out.println("INGRESE EL VALOR DEL RADIO DEL CIRCULO");
        radio=sc.nextDouble();
        System.out.println("INGRESE EL VALOR DEL ANGULO EN GRADOS");
        angulo=sc.nextDouble();
        angulorad = Math.toRadians(angulo);
        area =0.05*radio*radio*angulorad;
        System.out.println("EL AREA ES: "+area);
        sc.close();
    }
    //Alex Sigcho
    void bipiramidecuadrada(){
        Scanner sc = new Scanner(System.in);
        double lado,altura,base,lados,area;
        System.out.println("INGRESE EL VALOR DE UN LADO DE LA BASE CUADRADA");
        lado=sc.nextDouble();
        System.out.println("INGRESE EL VALOR DE LA ALTURA DE LA PIRAMIDE");
        altura=sc.nextDouble();
        base = lado*lado;
        lados = 2*lado*altura;
        area =2*base+4*lados;
        System.out.println("EL AREA ES: "+area);
        sc.close();
    }
    //Alex Sigcho
    void casqueteesferico(){
        Scanner sc = new Scanner(System.in);
        double radio, altura,area;
        System.out.println("INGRESE EL VALOR DEL RADIO");
        radio=sc.nextDouble();
        System.out.println("INGRESE EL VALOR DE LA ALTURA DEL CASQUETE");
        altura=sc.nextDouble();
        area =2* Math.PI *radio*altura;
        System.out.println("EL AREA ES: "+area);
        sc.close();
    }
    //Alex Sigcho
    void circulo (){
        Scanner sc = new Scanner(System.in);
        double radio,area;
        System.out.println("INGRESE EL VALOR DEL RADIO DEL CIRCULO");
        radio=sc.nextDouble();
        area= Math.PI * radio*radio;
        System.out.println("EL AREA ES: "+area);
        sc.close();
    }
    //Alex Sigcho
    void circuloconcentrico(){
        Scanner sc = new Scanner(System.in);
        double radiomayor,radiomenor,area1,area2,area;
        System.out.println("INGRESE EL VALOR DEL RADIO MAYOR");
        radiomayor=sc.nextDouble();
        System.out.println("INGRESE EL VALOR DEL RADIO MENOR");
        radiomenor=sc.nextDouble();
        area1= Math.PI *radiomayor*radiomayor;
        area2= Math.PI *radiomenor*radiomenor;
        area=area1-area2;
        System.out.println("EL AREA ES: "+area);
        sc.close();
    }
    //Alex Sigcho
    void cilindro(){
        Scanner sc = new Scanner(System.in);
        double radio,altura,area;
        System.out.println("INGRESE EL VALOR DEL RADIO DE LA BASE DEL CILINDRO");
        radio=sc.nextDouble();
        System.out.println("INGRESE EL VALOR DE LA ALTURA DEL CILINDRO");
        altura=sc.nextDouble();
        area = 2 * Math.PI *radio*(radio+altura);
        System.out.println("EL AREA ES: "+area);
        sc.close();
    }
    //Alex Sigcho
    void cilindroeliptico(){
        Scanner sc = new Scanner(System.in);
        double mayor,menor,altura,area;
        System.out.println("INGRESE EL VALOR DE EL SEMIEJE MAYOR DE LA BASE ELIPTICA");
        mayor=sc.nextDouble();
        System.out.println("INGRESE EL VALOR DE EL SEMIEJE MENOR DE LA BASE ELIPTICA");
        menor=sc.nextDouble();
        System.out.println("INGRESE EL VALOR DE LA ALTURA DEL CILINDRO");
        altura=sc.nextDouble();
        area= 2 *  Math.PI *mayor*menor +2 * Math.PI*mayor*altura;
        System.out.println("EL AREA ES: "+area);
        sc.close();
    }
    //Alex Sigcho
    void cilindrohueco(){
        Scanner sc = new Scanner(System.in);
        double externo,interno,altura,area;
        System.out.println("INGRESE EL VALOR DE EL RADIO EXTERNO DE LA BASE DEL CILINDRO");
        externo=sc.nextDouble();
        System.out.println("INGRESE EL VALOR DE EL RADIO INTERNO DE LA BASE DEL CILINDRO");
        interno=sc.nextDouble();
        System.out.println("INGRESE EL VALOR DE LA ALTURA DEL CILINDRO");
        altura=sc.nextDouble();
        area=2* Math.PI*altura*(externo+interno)+ 2 +Math.PI *(externo*externo - interno*interno);
        System.out.println("EL AREA ES: "+area);
        sc.close();
    }
    //Alex Sigcho
    void cilindroinclinado(){
        Scanner sc = new Scanner(System.in);
        double radio,altura,area;
        System.out.println("INGRESE EL VALOR DEL RADIO DE LA BASE DEL CILINDRO");
        radio=sc.nextDouble();
        System.out.println("INGRESE EL VALOR DE LA ALTURA DEL CILINDRO");
        altura=sc.nextDouble();
        area=2* Math.PI *radio*(radio*altura);
        System.out.println("EL AREA ES: "+area);
        sc.close();
    }
    //Alex Sigcho
    void cono(){
        Scanner sc = new Scanner(System.in);
        double radio,altura,generatriz,area;
        System.out.println("INGRESE EL VALOR DEL RADIO DE LA BASE DEL CONO");
        radio=sc.nextDouble();
        System.out.println("INGRESE EL VALOR DE LA ALTURA DEL CONO");
        altura=sc.nextDouble();
        generatriz= Math.sqrt(radio*radio + altura*altura);
        area = Math.PI *radio*(radio+generatriz);
        System.out.println("EL AREA ES: "+area);
        sc.close();
    }
    //Alex Sigcho
    void conooblicuo(){
        Scanner sc = new Scanner(System.in);
        double radio,generatriz,area;
        System.out.println("INGRESE EL VALOR DEL RADIO DE LA BASE DEL CONO");
        radio=sc.nextDouble();
        System.out.println("INGRESE EL VALOR DE LA LONGITUD DE LA GENERATIZ");
        generatriz=sc.nextDouble();
        area= Math.PI * radio * (radio + generatriz);
        System.out.println("EL AREA ES: "+area);
        sc.close();
    }
    //Alex Sigcho
    void coronacircular(){
        Scanner sc = new Scanner(System.in);
        double exterior, interior, area;
        System.out.println("INGRESE EL VALOR DEL RADIO DEL CIRCULO EXTERIOR");
        exterior=sc.nextDouble();
        System.out.println("INGRESE EL VALOR DEL RADIO DEL CIRCULO INTERIOR");
        interior=sc.nextDouble();
        area= Math.PI *(exterior*exterior-interior*interior);
        System.out.println("EL AREA ES: "+area);
        sc.close();
    }
    //Alex Sigcho
    void cubo(){
        Scanner sc = new Scanner(System.in);
        double lado,area;
        System.out.println("INGRESE EL VALOR DE UN LADO DEL CUBO");
        lado=sc.nextDouble();
        area=6* Math.pow(lado, 2);
        System.out.println("EL AREA ES: "+area);
        sc.close();
    }
    //Alex Sigcho
    void cuboctaedro(){
        Scanner sc = new Scanner(System.in);
        double lado,area;
        System.out.println("INGRESE EL VALOR DE UN LADO DEL CUBOCTAEDRO");
        lado=sc.nextDouble();
        area=2*(5+Math.sqrt(3))*lado*lado;
        System.out.println("EL AREA ES: "+area);
        sc.close();
    }
    //Alex Sigcho
    void decagono(){
        Scanner sc = new Scanner(System.in);
        double lado,area;
        System.out.println("INGRESE EL VAALOR DE UN LADO DEL DECAGONO");
        lado=sc.nextDouble();
        area=(5.0/2.0)*lado*lado*(1.0/ Math.tan(Math.PI/10));
        System.out.println("EL AREA ES: "+area);
        sc.close();
    }
    //Alex Sigcho revisar si poner o no 
    void corazon(){
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
        System.out.println("AREA APROXIMADA DE LA FIGURA DE CORAZON ES: " + area);
    }
}