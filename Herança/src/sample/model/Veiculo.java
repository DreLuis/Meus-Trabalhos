package sample.model;

//Classe
public abstract class Veiculo {
    //Atributos
    private String nome;
    private Marca marca;

    //Construtor passando nome como parâmetro
    public Veiculo(String nome){
        this.nome = nome;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Marca getMarca() {
        return marca;
    }
    public void setMarca(String nome, String descricao) {
        Marca marca = new Marca();
        marca.setDesc(descricao);
        marca.setNome(nome);
        this.marca = marca;
    }

    //toString
    @Override
    public String toString(){
        return nome
                + " " + (marca != null ? marca : "");
    }
}
