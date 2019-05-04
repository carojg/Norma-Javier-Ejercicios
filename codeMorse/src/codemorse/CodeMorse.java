/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codemorse;
import java.util.Scanner;

/**
 *
 * @author Norma Carolina Javier Gonzalez
 */
public class CodeMorse {
    //Creamos nuestro arreglo que contiene los caracteres de codigo morse.
    static String morse[] = {
      ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", //A-H
      "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", // I-P
      "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", // Q-X
      "-.--", "--..", //Y-Z 
      ".----", "..---", "...--", "....-", ".....", // 1-5
      "-....", "--...", "---..", "----.", "-----", "   "  //6-0
    }; 
   
    //Creamos nuestra variable que contiene el abecederio.
    static String alfabeto = (String) "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890 ";
    
    //En esta función se encarga de convertir de texto a código morse
    static String MensajeMorse(String texto, String morse[], String alfabeto){
        int posicion = 0; //Esta variable nos servirá para obtener la posición dentro de nuestra variable alfabeto
        String conversion = ""; //Almacena el código morse

        for (int f = 0; f < texto.length(); f++) {
          posicion = alfabeto.indexOf(texto.charAt(f)); //Extraemos el caracter en turno de texto y se busca dentro de alfabeto guardando la posición 
          conversion = conversion + morse[posicion] + " "; //Almacenamos lo que se encuentre en morse en la posicón obtenida.
        }
        return "El resultado es: "+conversion; //Retornamos la conversión.
    }
  
    //Esta función convierte de código morse a texto
    static String MensajeMorse(String texto[], String alfabeto, String morse[]){
        String conversion = ""; //Aqui se guardara el resultado.

        for (String texto1 : texto) { //Recorremos nuestro arreglo texto
            if (texto1.length() > 0){ //Se compara si la longitud es 0 (De ese modo obtendremos si es espacio o no)
                for (int j = 0; j< morse.length; j++) {//Recorremos nuestro código morse
                    if (texto1.equals(morse[j])) {//Si el texto en turno es igual a morse en posición
                        conversion = conversion + alfabeto.charAt(j); //Almacenamos el texto.                   
                    }
                }
            }
            else{
                conversion = conversion + " "; //Si es 0 lo guardamos como espacio
            }
        }
        return "El resultado es: "+conversion; //Retornamos el resultado
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);//Nos servirá para obtener la respuesta del teclado
        System.out.println("******* CODIGO MORSE *******");
        String resul = "";
        
        do{
            //Puede ser código morse o texto normal
            System.out.println("Introduzca la cadena que desea convertir: "); //Introducimos la cadena a convertir
            String cadena = teclado.nextLine();//Recibimos la respuesta

            cadena = cadena.toUpperCase(); //Convertimos a mayusculas

            try{//Este es en caso de ser texto normal        
                String texto= cadena.replaceAll("\\s+", " "); //Remplazamos espacios extras
                System.out.println(MensajeMorse(texto, morse, alfabeto)); //Mandamos a llamar a la función
            }
            catch(Exception e) { //En caso de ser código morse
                String variable[] = cadena.split(" ");//dividimos nuestro texto en un arreglo
                String resultado = MensajeMorse(variable, alfabeto, morse); //Mandamos a llamar a la función

                System.out.println(resultado.replaceAll("\\s+", " ")); //Reemplazamos los dobles o mas espacios
            }
            
            System.out.println("Desea volver a introducir otra cadena? [SI/NO]"); //Cuestionamos si se desea introducir otro resultado
            resul = teclado.nextLine();
            resul = resul.toUpperCase();
        } while (resul.equals("SI"));   
    }
}