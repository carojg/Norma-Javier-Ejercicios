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
        String romano = "";
        int centenas, decenas, unidades;
        
        if (numero <1000){
            centenas = numero / 100 % 10;
            decenas = numero / 10 % 10;
            unidades = numero % 10;
            
            System.out.println(centenas +" "+ decenas+ " " + unidades);
            
            //Calculamos la centena
            if (centenas == 9 || centenas == 4) {
                String roma =(centenas == 9)? "CM": "CD";
                romano = romano + roma;
            } 
            else if (centenas >= 5) {
                romano = romano + "D";
                for (int i = 6; i <= centenas; i++) {
                    romano = romano + "C";
                }
            } 
            else {
                for (int i = 1; i <= centenas; i++) {
                    romano = romano + "C";
                }
            }
            
            //Calculamos la decena
            if (decenas == 9 || decenas == 4) {
                romano = romano + ((centenas == 9)? "XC": "XL");
            } 
            else if (decenas >= 5) {
                romano = romano + "L";
                for (int i = 6; i <= decenas; i++) {
                    romano = romano + "X";
                }
            } 
            else {
                for (int i = 1; i <= decenas; i++) {
                    romano = romano + "X";
                }
            }
            
            //Calculamos las unidades:
            if (unidades == 9 || unidades ==4) {
                romano = romano + ((centenas == 9)? "IX": "IV");
            } 
            else if (unidades >= 5) {
                romano = romano + "V";
                for (int i = 6; i <= unidades; i++) {
                    romano = romano + "I";
                }
            }
            else {
                for (int i = 1; i <= unidades; i++) {
                    romano = romano + "I";
                }
            }
            
        }
        else if (numero == 1000){
            romano = "M";
        }
        else{
            return "Favor de introducir un numero entre 1-1000";
        }
        return romano;
    }
        
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Scanner respuesta = new Scanner(System.in);
        System.out.println("******* NUMEROS ROMANOS *******");
        String resul = "";
        
        do{
            System.out.println("Introduzca el numero a convertir: ");
            int numero = num.nextInt();

            try{        
                System.out.println(romanos(numero));
            }
            catch(Exception e) {
                System.out.println("Introduzca un numero!!");
            }
            
            System.out.println("Desea volver a introducir otro numero? [SI/NO]");
            resul = respuesta.nextLine();
            resul = resul.toUpperCase();
        } while (resul.equals("SI")); 
    }   
}
