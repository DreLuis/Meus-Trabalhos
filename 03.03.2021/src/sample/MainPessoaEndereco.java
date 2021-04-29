package sample;

import sample.model.Endereco;
import sample.model.PessoaEndereco;

public class MainPessoaEndereco {

    public static void main(String[] args) {
        PessoaEndereco pessoa = new PessoaEndereco();
        pessoa.setNome("Everson Zoio");
        pessoa.setDataNascimento("21/03/2009");
        System.out.println(pessoa);

        Endereco endereco = new Endereco();
        endereco.setRua("thurusbango thurusbago");
        endereco.setNumero(777);
        endereco.setBairro("Meia Noite");
        endereco.setCidade("Cidade de Deus");
        System.out.println(endereco);

        pessoa.setEndereco(endereco);
    }
}
