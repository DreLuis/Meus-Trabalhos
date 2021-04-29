package sample;

import sample.model.PessoaFisica;
import sample.model.PessoaJuridica;

public class MainPPfPjE {

    public static void main(String[] args){
        PessoaFisica pessoaFisica = new PessoaFisica("Rogério","123.456.789-10","1.234.567");
        pessoaFisica.setEndereco("f",842,"AAAAA", "01234-567");
        System.out.println(pessoaFisica);

        PessoaJuridica pessoaJuridica = new PessoaJuridica("João","01.234.567/8910-11","123456789-10");
        pessoaFisica.setEndereco("k",458,"JJJJJ","7654-321");
        System.out.println(pessoaFisica);
    }
}
