package org.example;

public abstract class Conta {
    protected String identificador;
    protected String agencia;
    protected double saldo;
    protected Cliente cliente;

    public Conta() {

    }

    public Conta(String identificador, String agencia, double saldo, Cliente cliente) {
        this.identificador = identificador;
        this.agencia = agencia;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public String saqueConta(double valor){
        return null;
    }

    public void depositoConta(double valor){

    }

    public void historico(int data){

    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
