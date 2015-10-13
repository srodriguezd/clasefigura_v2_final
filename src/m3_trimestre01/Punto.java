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
public class Punto {
   
   // Declaración de atributos                     
   private double x; 
   private double y; 
   
   // Constructor 
   public Punto(double x, double y) 
 { 
       this.x = x; 
       this.y = y;         
 } 
   
// Definición de métodos  
   public double getX () 
 { 
    return x; 
 } 
   public double getY() 
 { 
    return y; 
 } 

   public void setX(double x) {
    this.x = x;
   }

   public void setY(double y) {
        this.y = y;
   }
    
   @Override //sobreescribe el método toString para que escriba lo que yo quiera
   public String toString(){
     return "("+this.x+","+this.y+")";           
   }

   public void Desplazar (double x, double y) 
   { 
      this.x = this.x + x;
      this.y = this.y + y;
   }  
   
   public double Distancia (Punto p2) 
   { 
      double resultado = Math.sqrt(Math.pow(p2.getX()-this.x,2) + Math.pow(p2.getY()-this.y,2));
      return resultado;
      
      //int dx = this.x - p.GetX();
      //igual con y
      // return Math.sqrt(Math.pow(dx2) + Math.pow(dy,2))
      //luego lo de overrrite lo ha hecho automatico;
     
   }
  
    
}
