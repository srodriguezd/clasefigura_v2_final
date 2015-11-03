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
public class Triangulo2 extends Figura2 implements MetodosFigura2{
    private double base;
    private double altura;

    public Triangulo2(double base, double altura, Punto2 origen) {
        super(origen);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double Area() {
        double resultado = (this.base*this.altura/2);
        return resultado;
    }

    @Override
    public double Perímetro() {
        double resultado = (this.base * 3 ); //Esto si fuera equilátero...
        return resultado;
    }

    @Override
    public void Escalar(double n) {
        this.setBase((this.base) * (n/100));
        this.setAltura((this.altura) * (n/100));
    }

    @Override
    public String toString() {
        return "Triangulo2{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    
}
