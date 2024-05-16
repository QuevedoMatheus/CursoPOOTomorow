package org.example;

public class Retangulo extends ObjetoGeometrico{
    private int lado1;
    private int lado2;

    public Retangulo(int lado1, int lado2 ) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public double calcularArea() {
        return   area = lado1 * lado2;
    }
    public double calcularPerimetro() {
        return  perimetro = 2 * (lado1 + lado2);
    }
}
