package sample.model;

//class Cliente conta
public class ClienteConta {

    //atributos
    Cliente cliente;
    Conta conta;
    Endereco endereco;

    //getters e setters
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    //toString
    @Override
    public String toString() {
        return "ClienteConta{" +
                "cliente=" + cliente +
                ", conta=" + conta +
                ", endereco=" + endereco +
                '}';
    }
}
