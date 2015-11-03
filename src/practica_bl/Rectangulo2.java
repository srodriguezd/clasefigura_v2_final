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
public class Rectangulo2 extends Cuadrado2 implements MetodosFigura2{
    private double alto;

    public Rectangulo2(double alto, double ancho, Punto2 origen) {
        super(ancho, origen);
        this.alto = alto;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    @Override
    public double Area() {
        return this.ancho * this.alto;
    }

    @Override
    public double Perímetro() {
        double resultado = (this.ancho * 2) + (this.alto * 2);
        return resultado;
    }

    @Override
    public void Escalar(double n) {
         this.ancho = this.ancho + n;
         this.alto = this.alto + n;
    }

    @Override
    public String toString() {
        return "Rectangulo2{" + "alto=" + alto + '}';
    }
    
    
    
}
