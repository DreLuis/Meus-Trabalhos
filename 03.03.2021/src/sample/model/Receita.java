package sample.model;

import java.util.ArrayList;
import java.util.List;

//class Receita
public class Receita {

    //atributos
    private String nome;
    private String descricao;
    private List<Ingrediente> ingredientes;

    public Receita(){
        ingredientes = new ArrayList<>();
    }

    //getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }
    public void setIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public void setIngrediente(String nome, double qtde, String um){
        Ingrediente ingrediente = new Ingrediente();
        ingrediente.setUm(um);
        ingrediente.setNome(nome);
        ingrediente.setQtde(qtde);
        this.ingredientes.add(ingrediente);
    }

    //toString
    @Override
    public String toString() {
        return "Receita:\n" +
                nome + "\nDescrição: " + descricao +
                "\nIngredientes:" + ingredientes;
    }
}
