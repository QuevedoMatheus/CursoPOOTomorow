package org.example;

public class Periodico extends Publicacao{
    private int numVol;

    public Periodico(String titulo, int numVol) {
        super(titulo);
        this.numVol = numVol;
    }

    public int getNumVol() {
        return numVol;
    }

    public void setNumVol(int numVol) {
        this.numVol = numVol;
    }
}
