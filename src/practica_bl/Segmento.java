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
public class Segmento extends Punto2{
    
   protected Punto2 origen;                  
   private Punto2 finaloso;

    public Segmento(Punto2 origen, Punto2 finaloso, double x, double y) {
        super(x, y);
        this.origen = origen;
        this.finaloso = finaloso;
    }

    public Punto2 getOrigen() {
        return origen;
    }

    public void setOrigen(Punto2 origen) {
        this.origen = origen;
    }

    public Punto2 getFinaloso() {
        return finaloso;
    }

    public void setFinaloso(Punto2 finaloso) {
        this.finaloso = finaloso;
    }  
    
    @Override
     public void Desplazar (double x, double y) 
    { 
        this.origen.Desplazar(x, y);
        this.finaloso.Desplazar(x, y);
    } 
    
    
     public double Distancia() 
    { 
        double resultado = this.origen.Distancia(finaloso.getX(), finaloso.getY());
        return resultado;
    } 
     
    public void Escalar(double x1, double x2, double y1, double y2) 
    { 
        this.origen.Desplazar(x1, y1);
        this.finaloso.Desplazar(x2, y2);
    } 
    

    @Override
    public String toString() {
        return "Segmento{" + "origen=" + origen + ", finaloso=" + finaloso + '}';
    }


   
    
}
