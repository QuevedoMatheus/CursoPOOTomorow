package org.example;

public class ContaBancaria {
    private String titular;
    private float saldo;
    private  int numConta;

    public ContaBancaria() {
    }
    public ContaBancaria(String titular, float saldo, int numConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numConta = numConta;
    }
    public void saque (int valor){
        if (saldo >= valor){
            this.saldo = saldo - valor;
        } else if (saldo < valor) {
            System.out.println("Saldo insuficiente");
        }
    }

    public void deposito (int valor){
        this.saldo =+ valor;
    }
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
