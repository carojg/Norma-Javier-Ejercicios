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
public class Cubo extends Cuadrado {
    
    Cubo(int lado) {//Constructor
        super(lado);
    }
    
    public double calcularVolumen() {//Calculamos el volumen
        return Math.pow(this.lado, 3);
    }
    
    public double calcularPerimetro(){//Calculamos el perimetro
        return this.lado * 12;
    }
}
