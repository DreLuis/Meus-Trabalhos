package sample;

import sample.model.Endereco;

public class MainEndereço {

    public static void main(String[] args){
        Endereco endereco = new Endereco();
        endereco.setRua("thurusbango thurusbago");
        endereco.setNumero(777);
        endereco.setBairro("Meia Noite");
        endereco.setCidade("Cidade de Deus");
        System.out.println(endereco);
    }
}
