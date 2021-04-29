package sample;

import sample.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class MainPessoa {

    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Andre Luis Fernandes do Espirito Santo");
        pessoa.setDataNascimento("15/07/2003");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Caetano Alburquerque Borges");
        pessoa2.setDataNascimento("22/10/2003");
        System.out.println(pessoa2);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Roberta Borges Carvalho");
        pessoa3.setDataNascimento("17/11/2005");

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        for (int i = 0; i < pessoas.size(); i++){
            System.out.println(pessoas.get(i));
        }
    }
}
