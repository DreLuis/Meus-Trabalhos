package sample.model;

//class abstrata pessoa
public abstract class Pessoa {

    //atributos
    private String nome;
    private Endereco endereco;

    //construtor passando nome como parâmetros
    public Pessoa(String nome){
        this.nome = nome;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(String rua,int numero, String bairro, String cep) {
        Endereco endereco = new Endereco();
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setBairro(bairro);
        endereco.setCep(cep);
        this.endereco = endereco;
    }

    //toString
    @Override
    public  String toString(){
        return nome
                + " " + (endereco != null ? endereco : "");
    }
}
