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
public class Círculo {
    // Declaración de atributos 
   private int radio;
   
   // Constructor 
   public Círculo(int radio, Punto origen) 
    { 
       super.Figura(origen);
       this.radio=radio;
    } 
   
// Definición de métodos  

    public double getRadio() {
        return radio;
    }

    public Punto getOrigen() {
        return origen;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    public double Area() 
   { 
        double resultado = 3.1416 * Math.pow(this.radio,2);
        return resultado;
   }  
    
    public double Perímetro() 
   { 
        double resultado = 2*3.1416*this.radio;
        return resultado;
   }  
    
    public void Escalar(double r) 
   { 
        this.setRadio((this.radio + this.radio) * (r/100));
        
   } 
    
  
    
}

