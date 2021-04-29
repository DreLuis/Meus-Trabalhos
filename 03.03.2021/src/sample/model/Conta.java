package sample.model;

public class Conta {

    //atributos
    private String agencia;
    private String conta;
    private double saldo;

    //getters e setters
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double sacar(double valor){
        if (saldo >= valor){
            saldo -= valor;
            return valor;
        } else {
            return 0;
        }
    }

    public boolean depositar(double valor){
        if(valor > 0) {
            saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    //toString
    @Override
    public String toString() {
        return "Conta{" +
                "numAgencia='" + agencia + '\'' +
                ", numConta='" + conta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
