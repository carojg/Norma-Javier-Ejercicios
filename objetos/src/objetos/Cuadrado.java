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
public class Cuadrado {
    protected int lado;
    
    Cuadrado(int lado) {
        this.lado=lado;
    }

    public double calcularArea(){
        return Math.pow(this.lado, 2);
    }
    
    public double calcularPerimetro(){
        return this.lado * 4;
    }
}
