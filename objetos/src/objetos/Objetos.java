/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Scanner;

/**
 *
 * @author new_m
 */
public class Objetos {
    public static void main(String[] args) {
        //Scanner num = new Scanner(System.in);
        Scanner respuesta = new Scanner(System.in);
        System.out.println("******* HERENCIA EN JAVA *******");
        int opcion, lado, res = 0;
        
        do{
            System.out.println("Introduzca la medida de un lado: ");
            lado = respuesta.nextInt();
            
            Cuadrado cuad = new Cuadrado(lado);
            Cubo cub = new Cubo(lado);
            
            do{
                System.out.println("Que desea hacer: \n"
                        + " [1]<-Calcular area cuadrado \n"
                        + " [2]<-Calcular Perimetro cuadrado \n"
                        + " [3]<-Calcular Volumen cubo \n"
                        + " [4]<-Calcular Perimetro Cubo \n"
                        + " [5]<-Cancelar \n"
                        + " [6]<- Salir \n");

                opcion = respuesta.nextInt();
                
                if (opcion != 5){
                    switch (opcion){
                        case 1:
                            System.out.println("El area del cuadrado es: "+ cuad.calcularArea());
                            break;
                        case 2:
                            System.out.println("El perimetro del cuadrado es: "+ cuad.calcularPerimetro());
                            break;
                        case 3:
                            System.out.println("El volumen del cubo es: "+ cub.calcularVolumen());
                            break;
                        case 4:
                            System.out.println("El area del cubo es: "+ cub.calcularPerimetro());
                            break;
                        case 6:
                            System.exit(0); 
                    }

                    System.out.println("Que desea hacer: \n"
                            + " [1]<-Regresar al menu de calculos (Se usara el dato actual " + lado + ") \n"
                            + " [2]<-Capturar un nuevo dato \n");

                    res = respuesta.nextInt();   
                }
            }while ( res == 1 ); 
        } while ( opcion==5 || res == 2); 
    }   
}
