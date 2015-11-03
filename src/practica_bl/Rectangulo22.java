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
public class Rectangulo22 extends Cuadrado22 implements MetodosFigura2{

    private Segmento altura;

    public Rectangulo22(Segmento altura, Segmento ancho, Punto2 origen, Punto2 finaloso, double x, double y) {
        super(ancho, origen, finaloso, x, y);
        this.altura = altura;
    }

    public Segmento getAltura() {
        return altura;
    }

    public void setAltura(Segmento altura) {
        this.altura = altura;
    }

    @Override
    public double Area() {
       return this.ancho.Distancia() * this.altura.Distancia();
    }

    @Override
    public double Perímetro() {
       double resultado = (this.ancho.Distancia() * 2) + (this.altura.Distancia() * 2);
        return resultado;
    }

    @Override
    public void Escalar(double n) {
       
    }
   
    public void EscalarAncho(double x1, double x2, double y1, double y2) {
        this.ancho.Escalar(x1, x2, y1, y2);
    }
    
    public void EscalarAltura(double x1, double x2, double y1, double y2) {
        this.altura.Escalar(x1, x2, y1, y2);
    } 

    @Override
    public String toString() {
        return "Rectangulo22{ altura=" + altura.Distancia() +" ancho=" + ancho.Distancia() +"}";
    }
    
    
    
}
