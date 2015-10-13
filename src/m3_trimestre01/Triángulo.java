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
public class Triángulo {
    // Declaración de atributos 
   private double base;
   private double altura;
   private Punto origen;
   
   // Constructor 
   public Triángulo(double base, double altura, Punto origen)
    { 
       this.base = base; 
       this.altura = altura; 
       this.origen = origen;
    } 

// Definición de métodos  

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    public Punto getOrigen() {
        return origen;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    public double Area() 
   { 
        double resultado = (this.base*this.altura/2);
        return resultado;
   }  
    
    public double Perímetro() 
   { 
        double resultado = (this.base * 3 ); //Esto si fuera equilátero...
        return resultado;
   }  
    
    public void Escalar(double r) 
   { 
        this.setBase((this.base) * (r/100));
        this.setAltura((this.altura) * (r/100));
        
   } 
    
}
