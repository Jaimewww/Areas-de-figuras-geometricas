package controller.util;
public class validador{
    public static boolean validarInt(String numero){
        boolean intisValid;
        int numeroLenght = numero.length();
        int i = 0;
        do{
            char c = numero.charAt(i);
            if(Character.isDigit(c)){
                intisValid = true;
            }else{
                intisValid = false;
                break;
            }
            i++;
        } while(i<numeroLenght);
        return intisValid;
    }
    public static boolean validarDouble(String numero){
        boolean doubleisValid;
        int numeroLenght = numero.length();
        int i = 0, dotCount = 0;
        do{
            char c = numero.charAt(i);
            if(Character.isDigit(c) || numero.charAt(i) == '.' && dotCount <= 1){
                doubleisValid = true;
                dotCount++;
            }else{
                doubleisValid = false;
                break;
            }
            i++;
        } while(i<numeroLenght);
        return doubleisValid;
    }
    //public static void ejecutar(){
    //    String numero = "..3554";
    //    System.out.println(validador.validarInt(numero));
    //}
}