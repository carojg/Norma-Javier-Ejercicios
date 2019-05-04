/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author Norma Carolina Javier González
 */
public class Cuadrado {
    protected int lado; //Variable que almacena el lado
    
    Cuadrado(int lado) { //Constructor
        this.lado=lado;
    }

    public double calcularArea(){ //Calculamos el area
        return Math.pow(this.lado, 2);
    }
    
    public double calcularPerimetro(){//Calculamos el perimetro
        return this.lado * 4;
    }
}
