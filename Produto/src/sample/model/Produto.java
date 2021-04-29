package sample.model;

//class produto
public class Produto {

    //atributos
    public String nome;
    public double preco;
    public int tamanho;

    //getters e setters
    //são ações ou modificadores dos atributos
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {return preco;}
    public void setPreco(double preco) {this.preco = preco;}

    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    //toString
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", R$" + preco +
                ", tamanho=" + tamanho +
                '}';
    }
}
