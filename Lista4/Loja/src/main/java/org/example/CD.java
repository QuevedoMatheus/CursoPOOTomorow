package org.example;

public class CD extends Midia{
    private int nMusicas;

    public CD() {

    }

    public CD(int codigo, double preco, String nome, int nMusicas) {
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }

    public String getTipo(){
        return "CD";
    }


    public String getDetalhes(){
        String saida = ("Codigo" + getCodigo() + "Preco" + getPreco() + "Nome" + getNome());
        return  saida;
    }

    public void setnFaixas(int nFaixa){
        this.nMusicas = nMusicas;
    }

    public int getCodigo(){
        return super.getCodigo();
    }

    public double getPreco(){
        return super.getPreco();
    }
    public String getNome(){
        return super.getNome();
    }

}
