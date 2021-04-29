package sample;

import sample.model.Cliente;

public class MainCliente {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Pedro");
        cliente.setEmail("pedro@gmail.com");
        cliente.setTelefone("0(48) 98889-2020");
        cliente.setIdade(18);
        System.out.println(cliente);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("João");
        cliente2.setEmail("joao@gmail.com");
        cliente2.setTelefone("8(48) 98787-3536");
        cliente2.setIdade(19);
        System.out.println(cliente2);
    }
}
