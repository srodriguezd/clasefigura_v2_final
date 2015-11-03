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
public class Cuadrado2 extends Figura2 implements MetodosFigura2{
    protected double ancho;

    public Cuadrado2(double ancho, Punto2 origen) {
        super(origen);
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Cuadrado2{" + "origen" + this.origen + "ancho" + this.ancho + '}';
    }    

    @Override
    public double Area() {
        double resultado = this.ancho * this.ancho;
        return resultado;
    }

    @Override
    public double Perímetro() {
        double resultado = this.ancho * 4;
        return resultado;
    }

    @Override
    public void Escalar(double n) {
        this.ancho = this.ancho + n;

    }

    
    
}
