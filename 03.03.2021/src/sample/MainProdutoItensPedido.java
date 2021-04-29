package sample;

import sample.model.Pedido;

public class MainProdutoItensPedido {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.setDescricao("Compra do mês");
        pedido.setData("10/3/2021");
        pedido.addItem("Maçã", 3.0);
        pedido.addItem("Uva", 5.5);
        pedido.addItem("Laranja", 2.5);

        System.out.println(pedido);


    }
}
