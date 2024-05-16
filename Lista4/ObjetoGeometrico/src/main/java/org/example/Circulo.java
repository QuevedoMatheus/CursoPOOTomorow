package org.example;

public class Circulo extends ObjetoGeometrico{
    private double raio;
    public Circulo() {
    }
    public void inicializar(double raio){
        this.raio = raio;
    }

    public double calcularArea() {
        return area = Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return perimetro = 2 * Math.PI * raio;
    }
}
