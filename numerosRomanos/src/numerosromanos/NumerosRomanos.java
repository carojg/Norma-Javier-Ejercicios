/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosromanos;

import java.util.Scanner;

/**
 *
 * @author Norma Carolina Javier González
 */
public class NumerosRomanos {

    static String romanos(int numero) {
        String romano = ""; //Almacena la conversión
        int centenas, decenas, unidades; //Estas variables nos serviran para descomponer nuestro numero
        
        if (numero <1000){ //Si numero es menor a 1000
            centenas = numero / 100 % 10; //Obtenemos las centenas
            decenas = numero / 10 % 10; //Obtenemos las decenas
            unidades = numero % 10; //Obtenemos las unidades
                       
            //Calculamos la centena
            if (centenas == 9 || centenas == 4) { //Comparamos si es 9 o 4 
                String roma =(centenas == 9)? "CM": "CD"; //Si es 9 sera CM por 900, si es 4 se almacenara CD por 400
                romano = romano + roma;//Concatenamos nuestro numero
            } 
            else if (centenas >= 5) { //Si es mayor a 5
                romano = romano + "D"; //Almacenamos la D porque es de 500
                for (int i = 6; i <= centenas; i++) { //Contamos desde el siguiente numero hasta llegar al valor de centenas
                    romano = romano + "C"; //Agregamos una C
                }
            } 
            else {
                for (int i = 1; i <= centenas; i++) { //En caso de no ser ninguno de los anteriores
                    romano = romano + "C"; //Incrementamos la C de 100 en 100
                }
            }
            
            //Calculamos la decena
            if (decenas == 9 || decenas == 4) {//Si es 9 o 4
                romano = romano + ((centenas == 9)? "XC": "XL"); //Si es 9 almacenamos XC por 90 y si es XL almacenamos XL por 40
            } 
            else if (decenas >= 5) { //Si es mayor o igual a 5
                romano = romano + "L"; //Guardamos la L por 50
                for (int i = 6; i <= decenas; i++) { //Contamos desde el siguiente numero hasta llegar al valor de decenas
                    romano = romano + "X";//Incrementamos de 10 en 10 por eso las X
                }
            } 
            else {
                for (int i = 1; i <= decenas; i++) {//En caso de no ser ninguno de los anteriores
                    romano = romano + "X"; //Incrementamos las X para ir de 10 en 10
                }
            }
            
            //Calculamos las unidades:
            if (unidades == 9 || unidades ==4) { //Si es 9 o 4
                romano = romano + ((centenas == 9)? "IX": "IV"); //Si es 9 se almacena IX y si es 4 IV 
            } 
            else if (unidades >= 5) {//en caso de ser mayor o igual a 5
                romano = romano + "V"; //Almacenamos la V
                for (int i = 6; i <= unidades; i++) { //Contamos desde el siguiente numero hasta llegar al valor de decenas
                    romano = romano + "I"; //Incrementamos de 1 en 1
                }
            }
            else {
                for (int i = 1; i <= unidades; i++) { //En caso de no ser ninguno de los anteriores
                    romano = romano + "I"; //Incrementamos de 1 en 1
                }
            }
            
        }
        else if (numero == 1000){//En caso de ser 1000
            romano = "M"; //Almacenamos M
        }
        else{
            return "Favor de introducir un numero entre 1-1000"; //Si el numero es mayor solicitamos introducir otro numero
        }
        return romano;
    }
        
    public static void main(String[] args) {
        //Declaramos nuestras variables 
        Scanner num = new Scanner(System.in);
        Scanner respuesta = new Scanner(System.in);
        System.out.println("******* NUMEROS ROMANOS *******");
        String resul = "";
        
        do{
            System.out.println("Introduzca el numero a convertir: ");//Solicitamos un número
            int numero = num.nextInt();

            try{        
                System.out.println(romanos(numero)); //Mandamos a convertir a romanos
            }
            catch(Exception e) { //En caso de que lo que se haya introducido no sea un número
                System.out.println("Introduzca un numero!!"); 
            }
            
            System.out.println("Desea volver a introducir otro numero? [SI/NO]"); //Volvemos a cuestionar si se desea introducir un numero
            resul = respuesta.nextLine();
            resul = resul.toUpperCase();
        } while (resul.equals("SI")); //Mientras introduzcan si el ciclo de repite.
    }   
}
