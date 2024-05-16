package org.example;

import java.util.ArrayList;

public class Disciplina {

    private  String nome;

    private  String cod;

    private ArrayList<Professor> professors = new ArrayList<>();


    public Disciplina() {
    }

    public Disciplina(String nome, String cod) {
        this.nome = nome;
        this.cod = cod;
    }

    public Disciplina(String nome, String cod, ArrayList<Professor> professors) {
        this.nome = nome;
        this.cod = cod;
        this.professors = professors;
    }

}
