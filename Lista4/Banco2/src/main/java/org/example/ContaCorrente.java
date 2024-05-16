package org.example;

public class ContaCorrente extends Conta{
    public ContaCorrente() {
    }
    public ContaCorrente(String identificador, String agencia, double saldo, Cliente cliente) {
        super(identificador, agencia, saldo, cliente);
    }

    public String saqueConta(double valor){
        if(saldo>=valor){
            this.saldo =- valor;
        } else if(saldo<valor){
            System.out.print("Saldo insuficiente");
        }
        return null;
    }

    public void depositoConta(double valor){
        this.saldo =+ valor;
    }

    public void historico(int data){

    }

}
