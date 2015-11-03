/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_bl;

/**
 *
 * @author sara
 */
public class Punto2 {
    
       private double x;
       private double y;

    public Punto2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto2{" + "x=" + x + ", y=" + y + '}';
    }

    public void Desplazar(double x2, double y2){
       this.x = this.x + x2;
       this.y = this.y + y2;
    
    }  
     
    public double Distancia(double x2, double y2){
        double resultado = Math.sqrt((Math.pow((this.x - x2), 2)) + (Math.pow((this.y - y2), 2)));
        return resultado;
    
    }

   
    
    
}
