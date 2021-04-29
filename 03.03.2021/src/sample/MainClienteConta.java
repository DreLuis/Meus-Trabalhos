package sample;

import sample.model.Cliente;
import sample.model.Conta;
import sample.model.Endereco;

public class MainClienteConta {

    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.setNome("Miguel dos Santos");
        cliente.setCpf("123.456.789-10");

        Endereco endereco = new Endereco();
        endereco.setRua("Alameda dos passaros");
        endereco.setNumero(536);
        endereco.setBairro("Baia deserta");
        endereco.setCidade("corais");

        Conta conta = new Conta();
        conta.setConta("0123 4567 8910 1112");
        conta.setSaldo(15000);
        conta.setAgencia("Banco do Brasil");

        System.out.println(cliente);
        System.out.println(endereco);
        System.out.println(conta);
    }
}
