package org.example;

public abstract class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public Midia() {

    }
    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public String getTipo(){

        return null;
    }

    public String getDetalhes(){

    }

    public int getCodigo(){
        return codigo;
    }

    public double getPreco(){
        return preco;
    }

    public String getNome(){
        return nome;
    }

    public void printDados(){

    }
    public void inserirDados(){

    }

}
