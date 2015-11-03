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
public abstract class Figura2 implements MetodosFigura2{  
    
    protected Punto2 origen;
    private static double NumFigura=0;

    public Figura2(Punto2 origen) {
        this.origen = origen;
        Figura2.NumFigura++;
    }
    
    

    public Punto2 getOrigen() {
        return origen;
    }

    public void setOrigen(Punto2 origen) {
        this.origen = origen;
    }

    public static double getNumFigura() {
        return NumFigura;
    }

    public static void setNumFigura(double NumFigura) {
        Figura2.NumFigura = NumFigura;
    }

    @Override
    public String toString() {
        return "Figura2{" + "origen=" + origen + '}';
    }
    
    public void Desplazar(double x, double y){
        this.origen.Desplazar(x, y);
    
    }
    
    public double Distancia(Figura2 f) {
      return this.origen.Distancia(f.getOrigen());
    }
    
    @Override
    public abstract double Area();
    @Override
    public abstract double Perímetro();
    @Override
    public abstract void Escalar(double n);
    
    
    
    
    
    
    
    
    
    
    
}
