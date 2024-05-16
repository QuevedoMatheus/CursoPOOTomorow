package org.example;

public class Cliente {
    private String CPF;
    private String nome;
    private String dataNasc;

    public Cliente(String CPF, String nome, String dataNasc) {
        this.CPF = CPF;
        this.nome = nome;
        this.dataNasc = dataNasc;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
}
