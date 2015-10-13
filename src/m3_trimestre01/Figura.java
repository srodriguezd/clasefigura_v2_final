/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3_trimestre01;

/**
 *
 * @author sara
 */

public abstract class Figura {
    protected Punto origen;
    private static int numFiguras;
    
    
    public void Figura(Punto origen){
        this.origen=origen;
        Figura.numFiguras++;
    }
    
    public Punto getOrigen(){
        return.origen;
        
    }
    
    public void setOrigen(Punto origen){
        this.origen=origen;
        
    }
    
    public void desplazar(int dx, int dy){
        this.origen.desplazar(dx, dy);
    }
    
    @Override
    public String toString(){
        return "origen = " + this.origen.toString();
    }
    
    public static int numFiguras(){
        return Figura.numFiguras;
       
    }
    
    public double distancia(Figura f) {
        return this.origen.distancia(f.getOrigen());
    }
    
    protected abstract double area();
    protected abstract double perímetro();
    protected abstract double escalar(double n);
    
    

    
}
