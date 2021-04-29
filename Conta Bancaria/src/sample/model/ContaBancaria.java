package sample.model;

public class ContaBancaria {

    //atributos
    private int numero;
    private String nome;
    private double saldo;


    public ContaBancaria(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
        saldo = 0.0;
    }
    public ContaBancaria(int numero, String nome, double saldo){
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    //get and set
    public int getNumero() {
        return numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }

    //déposito
    public void deposito(double valor){
        this.saldo += valor;
    }

    //saque
    public void saque(double valor){
        this.saldo = this.saldo -5.0 - valor;
        //this.saldo -= valor (-5);
    }

    public void imprimir(){
        System.out.println("Conta: "+numero
                +", Titular: "+nome
                +", Saldo: "+saldo+"\n");
    }


}
