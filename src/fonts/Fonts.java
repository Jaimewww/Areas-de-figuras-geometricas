/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fonts;

import java.awt.Font;
import java.io.InputStream;

/**
 *
 * @author JAIMEUNL
 */
public class Fonts {
    public String FSEX = "/fonts/FSEX300.ttf";
    private Font font = null;
    public Font fuente(String fontName, int style, float size) {
        try {
            InputStream is = getClass().getResourceAsStream(fontName);
            if (is == null) {
                throw new RuntimeException("No se pudo cargar la fuente: " + fontName);
            }
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception ex) {
            System.err.println("Error al cargar la fuente: " + ex.getMessage());
            font = new Font("Arial", Font.PLAIN, 14);
        }
        Font tfont = font.deriveFont(style, size);
        return tfont;
    }
}
