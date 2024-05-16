package org.example;

import java.util.ArrayList;

public class Turma {

    private  String nome;

    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Turma() {
    }

    public Turma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}
