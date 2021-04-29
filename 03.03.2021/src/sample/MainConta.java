package sample;

import sample.model.Conta;

public class MainConta {

    public static void main(String[] args){
        Conta conta = new Conta();
        conta.setAgencia("BANCO DO BRASIL");
        conta.setConta("0123 4567 8910 1112");
        conta.setSaldo(15000);

    }
}
