package sample;

import sample.model.Ingrediente;
import sample.model.Receita;

public class MainIngredienteReceita {

    public static void main(String[] args) {

        Ingrediente ingrediente = new Ingrediente();
        ingrediente.setNome("Farinha branca");
        ingrediente.setQtde(300);
        ingrediente.setUm("g");

        Receita receita = new Receita();
        receita.setNome("Bolo de morango");
        receita.setDescricao("Essa é uma receita da vovó");
        receita.setIngrediente(ingrediente);
        receita.setIngrediente("Ovos", 5, "unidade");
        receita.setIngrediente("Morango", 150, "g");

        System.out.println(receita);

    }
}
