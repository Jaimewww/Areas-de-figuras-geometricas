package controller.util;

public class Utilidades {

    public static double Redondear_double (double n) {
        double aux = n*1000.000;
        double aux1 = (double)((int)aux); 
        return (aux1/1000.000); 
    }

}