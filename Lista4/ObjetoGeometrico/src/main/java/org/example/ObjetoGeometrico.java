package org.example;

public abstract class ObjetoGeometrico {
    protected double area;
    protected double perimetro;

    public ObjetoGeometrico(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public ObjetoGeometrico() {

    }

    public void mostrarDados() {
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }

    public double calcularArea() {
        return area;
    }

    public double calcularPerimetro() {
        return perimetro;
    }
}
