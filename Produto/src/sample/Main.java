package sample;

import sample.model.Produto;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Produto produto = new Produto();
        produto.setNome("Air Jordan 4 Fire Red (2020)");
        produto.setPreco(1450);
        produto.setTamanho(41);

        Produto produto2 = new Produto();
        produto2.setNome("Air Jordan 1 Low Light Smoke Grey");
        produto2.setPreco(1309);
        produto2.setTamanho(39);

        Produto produto3 = new Produto();
        produto3.setNome("Air Jordan 1 High Volt Gold");
        produto3.setPreco(1010);
        produto3.setTamanho(45);

        //System.out.println(produto);
        //System.out.println(produto2);
        //System.out.println(produto3);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto);
        produtos.add(produto2);
        produtos.add(produto3);
        //System.out.println(produtos);

        //produtos.remove(produto2);
        //System.out.println(produtos);

        //produtos.remove(produto);
        //System.out.println(produtos);
        for (int i = 0; i < produtos.size(); i++){
            System.out.println(produtos.get(i));
        }
    }
}
