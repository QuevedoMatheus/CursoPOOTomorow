package org.example;

import java.util.HashMap;
import java.util.Map;

public class Aluno {
    private String nome;
    private int idade;
    private  Turma turma;

    //private Disciplina disciplina;
    private Map<Disciplina, Float> notas = new HashMap<Disciplina, Float>();

    public Aluno() {
    }

    public Aluno(String nome, int idade, Turma turma, Disciplina disciplina, Map<Disciplina, Float> notas) {
        this.nome = nome;
        this.idade = idade;
        this.turma = turma;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }


    public Map<Disciplina, Float> getNotas() {
        return notas;
    }

    public void setNotas(Map<Disciplina, Float> notas) {
        this.notas = notas;
    }
}
