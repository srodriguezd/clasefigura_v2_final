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
public class Rectángulo extends Cuadrado{
    private double alto;

    public Rectángulo(double alto, double ancho, Punto origen) {
        super.Cuadrado(origen,ancho);
        this.alto = alto;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    protected void Escalar(double r) {
        super.Escalar(r); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double Perímetro() {
        return this.ancho * 2 + this.alto * 2;
        this.alto *= n;

    @Override
    protected double Area() {
        return this.ancho * this.alto;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}    