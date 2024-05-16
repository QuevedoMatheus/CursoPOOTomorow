package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Sistema {
    private ArrayList<Livro>livros;
    private ArrayList<Periodico>periodicos;

    public Sistema(ArrayList<Livro> livros, ArrayList<Periodico> periodicos) {
        this.livros = livros;
        this.periodicos = periodicos;
    }
    public Sistema(ArrayList<Livro> livros) {
        this.livros = livros;
        this.periodicos = periodicos;
    }
    public void adcLivro(Livro livro){
        livros.add(livro);
    }

    public void adcPeriodoco(Periodico periodico){
        periodicos.add(periodico);
    }
    public void imprimirListadeLivros(){
        for (Livro livro:livros) {
            String nome = livro.getTitulo();
            String situacao = livro.isSituacaoDisponivel();
            System.out.print("Nome do livro: " + nome);
            System.out.print("Situação do livro: " + situacao);
        }
    }
    public void imprimirListadePeriodicos(){
        for (Periodico periodico:periodicos) {
            String nome = periodico.getTitulo();
            System.out.print("Nome do periodico: " + nome);
        }
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<Periodico> getPeriodicos() {
        return periodicos;
    }

    public void setPeriodicos(ArrayList<Periodico> periodicos) {
        this.periodicos = periodicos;
    }
}
