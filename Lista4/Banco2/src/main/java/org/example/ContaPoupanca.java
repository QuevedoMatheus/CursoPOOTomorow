package org.example;

public class ContaPoupanca extends  Conta{

    private  static double taxa=0.05;
    private  static double taxarendimento =0.04;
    public ContaPoupanca() {
    }

    public ContaPoupanca(String identificador, String agencia, double saldo, Cliente cliente, double taxa) {
        super(identificador, agencia, saldo, cliente);
    }

    public String saqueConta(double valor){
        if(saldo>=valor){
            this.saldo =- (valor*taxa);
        } else {
            System.out.print("Saldo insuficiente");
        }
        return null;
    }

    public void depositoConta(double valor){
        this.saldo =+ valor;
    }

    public void historico(int data){

    }

    public double calculaRendimento(){
        this.saldo =+ (saldo * taxarendimento);
        return saldo;
    }

    public static double getTaxa() {
        return taxa;
    }

    public static void setTaxa(double taxa) {
        ContaPoupanca.taxa = taxa;
    }

    public static double getTaxarendimento() {
        return taxarendimento;
    }

    public static void setTaxarendimento(double taxarendimento) {
        ContaPoupanca.taxarendimento = taxarendimento;
    }
}
