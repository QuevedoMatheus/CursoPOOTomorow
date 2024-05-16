package org.example;

public class DVD extends Midia{
    private  int nFaixas;

    public DVD() {

    }

    public DVD(int codigo, double preco, String nome, int nFaixas) {
        super(codigo, preco, nome);
        this.nFaixas = nFaixas;
    }

    public String getTipo(){
        return "DVD";
    }

    public String getDetalhes(){
        String saida = ("Codigo" + getCodigo() + "Preco" + getPreco() + "Nome" + getNome());
        return  saida;
    }

    public void setnFaixas(int nFaixa){
        this.nFaixas = nFaixa;
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
