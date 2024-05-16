package org.example;

import java.util.ArrayList;

public class Professor {

    private String nome;

    private float cargaHoraria;

    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Professor() {
    }

    public Professor(String nome, float cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public Professor(String nome, float cargaHoraria, ArrayList<Disciplina> disciplinas) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
