/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Scanner;

/**
 *
 * @author Norma Carolina Javier González
 */
public class Objetos {
    public static void main(String[] args) {
        Scanner respuesta = new Scanner(System.in); //Declaramos nuestro Scanner
        System.out.println("******* HERENCIA EN JAVA *******");
        int opcion, lado, res = 0; //Declaración de variables
        
        do{
            System.out.println("Introduzca la medida de un lado: ");//Solicitamos nuestro lado
            lado = respuesta.nextInt();
            
            Cuadrado cuad = new Cuadrado(lado); //Mandamos a llamar a la clase cuadrado
            Cubo cub = new Cubo(lado);//Mandamos a llamar a la clase cubo
            
            do{//Preguntamos que se desea hacer
                System.out.println("Que desea hacer: \n"
                        + " [1]<-Calcular area cuadrado \n"
                        + " [2]<-Calcular Perimetro cuadrado \n"
                        + " [3]<-Calcular Volumen cubo \n"
                        + " [4]<-Calcular Perimetro Cubo \n"
                        + " [5]<-Cancelar \n"
                        + " [6]<- Salir \n");

                opcion = respuesta.nextInt();
                
                if (opcion != 5){//Si la opción no es cancelar
                    switch (opcion){//Dependiendo de la opción elegida se realiza lo siguiente:
                        case 1:
                            System.out.println("El area del cuadrado es: "+ cuad.calcularArea());//Calcula el area
                            break;
                        case 2:
                            System.out.println("El perimetro del cuadrado es: "+ cuad.calcularPerimetro());//Calcula el perimetro
                            break;
                        case 3:
                            System.out.println("El volumen del cubo es: "+ cub.calcularVolumen());//Calcula el volumen
                            break;
                        case 4:
                            System.out.println("El area del cubo es: "+ cub.calcularPerimetro());//Calcula perimetro
                            break;
                        case 6:
                            System.exit(0); //Sale de la ejecución
                    }

                    System.out.println("Que desea hacer: \n" //Preguntamos que desea hacer si seguir o capturar otro dato
                            + " [1]<-Regresar al menu de calculos (Se usara el dato actual " + lado + ") \n"
                            + " [2]<-Capturar un nuevo dato \n");

                    res = respuesta.nextInt();   
                }
            }while ( res == 1 ); //Si es 1 regresa al menu inicial
        } while ( opcion==5 || res == 2); //Captura otro dato
    }   
}
