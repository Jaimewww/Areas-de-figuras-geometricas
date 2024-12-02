package controller.util;

public class casts {
    public static int transformStringInt(String num) {
        int resp = 0;
        if(validador.validarInt(num)) {
            resp = Integer.parseInt(num);
        }
        return resp;
    }

    public static double transformStringDouble(String num) {
        double resp = 0.0d;
        if(validador.validarDouble(num)) {
            resp = Double.parseDouble(num);
        }
        return resp;
    }
}
