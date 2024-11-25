import java.util.Scanner;
import static controller.util.validador.transformStringInt;
import static controller.util.validador.validarInt;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String in = " ";
        boolean valid = validarInt(in);
        do{
            System.out.println("1. Bidimensionales");
            System.out.println("2. Tridimensionales");
            in = sc.next();
            valid = validarInt(in);
        } while(!valid);
        if(valid){
            int inInt = transformStringInt(in);
            switch(inInt){
                case 0:
                    System.out.println("0");
                    break;
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
            }
        }
    }
}