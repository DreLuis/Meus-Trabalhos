package sample;

import sample.model.ContaBancaria;

public class Main{

    public static void main(String[] args) {
        int numeroConta = 102030;
        String nomeTitular = "Eduardo camargo";
        char temDeposito = 'n';
        double valor = 0.0;

        if(temDeposito == 's'){
            valor = 1000.00;
        }

        ContaBancaria bruno = new ContaBancaria(numeroConta,nomeTitular, valor);
        System.out.println("Dados da Conta:");
        bruno.imprimir();

        bruno.deposito(700);
        System.out.println("Dados da Conta Atualizado:");
        bruno.imprimir();

        bruno.saque(300);
        System.out.println("Dados da Conta Atualizado:");
        bruno.imprimir();
    }
}
