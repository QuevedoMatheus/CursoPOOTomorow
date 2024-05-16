package org.example;

import java.util.ArrayList;

public class Gerenciador {
    private ArrayList<DVD> dvds;
    private ArrayList<CD> cds;

    DVD dvd = new DVD();
    CD cd = new CD();

    public Gerenciador() {

    }
    public Gerenciador(ArrayList<DVD> dvds) {
        this.dvds = dvds;
    }

    public void inserirDadosDVD(DVD dvd){
        dvds.add(dvd);
    }

    public void inserirDadosCD(CD cd){
        cds.add(cd);
    }

    public String getDetalhesDVD(){
        return dvd.getDetalhes();

    }

    public String getDetalhesCD(){
        return cd.getDetalhes();

    }
}
