/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author new_m
 */
public class Cubo extends Cuadrado {
    
    Cubo(int lado) {
        super(lado);
    }
    
    public double calcularVolumen() {
        return Math.pow(this.lado, 3);
    }
    
    public double calcularPerimetro(){
        return this.lado * 12;
    }
}
