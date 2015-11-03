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
public class Cuadrado22 extends Segmento implements MetodosFigura2{
    
    protected Segmento ancho;

    public Cuadrado22(Segmento ancho, Punto2 origen, Punto2 finaloso, double x, double y) {
        super(origen, finaloso, x, y);
        this.ancho = ancho;
    }

    public Segmento getAncho() {
        return ancho;
    }

    public void setAncho(Segmento ancho) {
        this.ancho = ancho;
    }

    @Override
    public double Area() {
        double resultado = this.ancho.Distancia() * this.ancho.Distancia();
        return resultado;
    }

    @Override
    public double Perímetro() {
        double resultado = this.ancho.Distancia() * 4;
        return resultado;
    }

     @Override
    public void Escalar(double n) {
 
    }

  
    public void Escalar2(double x1, double x2, double y1, double y2) {
        this.ancho.Escalar(x1, x2, y1, y2);
    }

    @Override
    public String toString() {
        return "Cuadrado22{" + "ancho=" + ancho + '}';
    }
    
    
    
}
