package sample;

import sample.model.Pessoa2;

public class mainPessoa2Contato {

    public static void main(String[] args) {
        Pessoa2 pessoa2 = new Pessoa2();
        pessoa2.setNome("João Souza e Silva");
        pessoa2.setDataNascimento("23/09/2005");
        pessoa2.setContato("48-99999-9999", "joao@souza.com", "@joaosouzasilva");
        System.out.println(pessoa2);
    }
}

