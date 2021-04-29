package sample;

import sample.model.Cliente;

public class MainCliente {

    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.setNome("João Henrique Cardoso");
        cliente.setCpf("123.456.789.10");
        System.out.println(cliente);
    }
}
