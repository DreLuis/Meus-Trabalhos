package sample;

import sample.model.Conta;
import sample.model.Veiculo;

public class Main {

    public static void main(String[] args) {
        Conta conta = new Conta( "12345-67", "98765");
        System.out.println(conta.extrato());
        conta.depositar(1000.60);
        conta.sacar(50);
        System.out.println(conta.extrato());

        Conta conta2 = new Conta("3456-78", "6543");
        System.out.println(conta2.extrato());
        conta2.depositar(3400.89);
        conta2.sacar(30);
        System.out.println(conta2.extrato());

        Veiculo veiculo = new veiculo("A5E7F8BR");
        System.out.println(veiculo.consultarPlaca());
        System.out.println("Velocidade: " + veiculo.consutarVelocidade());
        System.out.println("Nova Velocidade: " + veiculo.acelrar(15));
        System.out.println("Nova Velocidade: " + veiculo.acelrar(15));
        System.out.println("Freinado... velocidade: " + veiculo.freiar(5));
        System.out.println("Freinado... velocidade: " + veiculo.freiar(8));
        System.out.println("Freinado... velocidade: " + veiculo.freiar(13));
        System.out.println("Freinado... velocidade: " + veiculo.freiar(10));*\

        Veiculo v2 = new Veiculo("F8R2A52");
        v2.acelrar(10);
        int iAcelerar = 0;
        while (v2.consutarVelocidade()< 200){
            iAcelerar ++
        }
    }
}
