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
public class Circulo2 extends Figura2 implements MetodosFigura2 {

   private double radio;

    public Circulo2(double radio, Punto2 origen) {
        super(origen);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double Area() {
        double resultado = 3.1416 * Math.pow(this.radio,2);
        return resultado;
    }

    @Override
    public double Perímetro() {
        double resultado = 2*3.1416*this.radio;
        return resultado;
    }

    @Override
    public void Escalar(double n) {
        this.setRadio((this.radio + this.radio) * (n/100));
    }

    @Override
    public String toString() {
        return "Circulo2{" + "radio=" + radio + '}';
    }
    
      
    
    
    
}