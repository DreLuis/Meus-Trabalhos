package sample.model;

//class pedido
public class Pedido {

    //atributos
    private String descricao;
    private String data;
    private double total;
    private ItensDoPedido itens;

    public Pedido(){
        itens = new ItensDoPedido();
    }

    //getters e setters
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    //TODO: refazer
    public void setTotal(double total) {
        this.total = total;
    }

    public ItensDoPedido getItens() {
        return itens;
    }
    public void addItem(String nome, double preco) {
        this.itens.setProduto(nome,preco);
    }

    //toString
    public String toString(){
        return "Pedido\n\n\n"
                + "Descrição: " + descricao
                + "Data" + data + "\n"
                + itens
                +"\n\nTotal: " + total;
    }
}
