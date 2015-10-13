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
public class Cuadrado extends Figura { //por heredar
    // Declaración de atributos 
   protected double ancho;
   
   // Constructor 
   public void Cuadrado(double ancho, Punto origen)
    { 
       this.ancho = ancho; 
       super.Figura(origen);
    } 

// Definición de métodos  

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override //generado automaticamente y luego modificado
    public String toString() {
        return "Cuadrado{" + super.toString()  +"ancho=" + this.ancho + '}';
    }
    
    @Override
    protected double Area() 
   { 
        double resultado = (this.ancho*this.ancho);
        return resultado;
   }  
    
    @Override
    protected double Perímetro() 
   { 
        double resultado = (this.ancho * 4 ); //Esto si fuera equilátero...
        return resultado;
   }  
    
    @Override
    protected void Escalar(double r) 
   { 
        this.setAncho((this.ancho + this.ancho) * (r/100));
        
        
   } 
    
}

