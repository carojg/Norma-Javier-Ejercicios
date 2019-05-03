/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codemorse;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Norma Carolina Javier Gonzalez
 */
public class CodeMorse {
    static String morse[] = {
      ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", //A-H
      "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", // I-P
      "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", // Q-X
      "-.--", "--..", //Y-Z 
      ".----", "..---", "...--", "....-", ".....", // 1-5
      "-....", "--...", "---..", "----.", "-----", "   "  //6-0
    }; 
   
    static String alfabeto = (String) "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890 ";
    
    static String MensajeMorse(String texto, String morse[], String alfabeto){
        int posicion = 0;
        String conversion = "";

        for (int f = 0; f < texto.length(); f++) {
          posicion = alfabeto.indexOf(texto.charAt(f));
          conversion = conversion + morse[posicion] + " ";
        }
        return "El resultado es: "+conversion;
    }
  
    static String MensajeMorse(String texto[], String alfabeto, String morse[]){
        String conversion = "";

        for (String texto1 : texto) {
            if (texto1.length() > 0){
                for (int j = 0; j< morse.length; j++) {
                    if (texto1.equals(morse[j])) {
                        conversion = conversion + alfabeto.charAt(j);                    
                    }
                }
            }
            else{
                conversion = conversion + " ";
            }
        }
        return "El resultado es: "+conversion;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("******* CODIGO MORSE *******");
        String resul = "";
        
        do{
            System.out.println("Introduzca la cadena que desea convertir: ");
            String cadena = teclado.nextLine();

            cadena = cadena.toUpperCase();

            try{        
                String texto= cadena.replaceAll("\\s+", " ");
                System.out.println(MensajeMorse(texto, morse, alfabeto));
            }
            catch(Exception e) {
                String variable[] = cadena.split(" ");
                String resultado = MensajeMorse(variable, alfabeto, morse);

                System.out.println(resultado.replaceAll("\\s+", " "));
            }
            
            System.out.println("Desea volver a introducir otra cadena? [SI/NO]");
            resul = teclado.nextLine();
            resul = resul.toUpperCase();
        } while (resul.equals("SI"));   
    }
}