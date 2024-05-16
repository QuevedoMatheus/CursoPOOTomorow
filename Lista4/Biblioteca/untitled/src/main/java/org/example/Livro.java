package org.example;

public class Livro extends  Publicacao{
    private boolean situacaoDisponivel;

    public Livro(String titulo, boolean situacaoDisponivel) {
        super(titulo);
        this.situacaoDisponivel = situacaoDisponivel;
    }

    public void metodoSaidaEmprestido(String titulo){
        if(situacaoDisponivel == true) {
            this.situacaoDisponivel = false;
            System.out.println("Livro disponível para emprestimo");
        } else if (situacaoDisponivel == false){
            System.out.println("Livro indisponível para emprestimo");
        }
    }

    public void metodoEntradaEmprestido(String titulo){
        if(situacaoDisponivel == false) {
            this.situacaoDisponivel = true;
            System.out.println("Livro devolvido do emprestimo");
        }
    }

    public String isSituacaoDisponivel() {
        if(situacaoDisponivel!=true){
            return "Indisponível";
        }
        return "Disponivel";
    }

    public void setSituacaoDisponivel(boolean situacaoDisponivel) {
        this.situacaoDisponivel = situacaoDisponivel;
    }

}
