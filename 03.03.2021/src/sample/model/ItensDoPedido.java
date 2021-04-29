package sample.model;

import java.util.List;

//class Itens do Pedido
public class ItensDoPedido {

    //atributos
    private List<Produto> produtos;

    //getters and setters
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setProduto(String nome, double preco){
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setPreco(preco);
        this.produtos.add(produto);
    }

    //toString
    @Override
    public String toString() {
        return "ItensDoPedido{" +
                "produtos=" + produtos +
                '}';
    }
}
