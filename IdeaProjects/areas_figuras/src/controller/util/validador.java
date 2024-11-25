package controller.util;
import java.util.Random;

public class validador {
    public static boolean validarInt(String num) {
        boolean band = true;
        if(num.charAt(0) == '-') {
            num = num.substring(1);
        }
        return band;
    }
    public static boolean validarDouble(String num) {
        boolean band = true;
        if(num.charAt(0) == '-') {
            num = num.substring(1);
        }
        int cont_p = 0;
        for(int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if(!Character.isDigit(c) && c != ',') {
                band = false;
                break;
            }
            if(c == ',') {
                cont_p++;
            }
        }
        if(cont_p > 1) {
            band = false;
        }
        return band;
    }

    public static int transformStringInt(String num) {
        int resp = 0;
        if(validarInt(num)) {
            resp = Integer.parseInt(num);
        }
        return resp;
    }

    public static float transformStringFloat(String num) {
        float resp = 0.0f;
        if(validarDouble(num)) {
            resp = Float.parseFloat(num);
        }
        return resp;
    }
    public static double transformStringDouble(String num) {
        double resp = 0.0d;
        if(validarDouble(num)) {
            resp = Double.parseDouble(num);
        }
        return resp;
    }
}
