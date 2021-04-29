package sample.model;

//class Pessoa Endereço
public class PessoaEndereco {

    //atributos
    private String nome;
    private String dataNascimento;
    private Endereco endereco;

    //getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereço() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setEndereco(String rua, int numero, String bairro, String cidade) {
        Endereco endereco = new Endereco();
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        setEndereco(endereco);
    }

    //toString
    @Override
    public String toString() {
        return "PessoaEndereco{" +
                "Nome='" + nome + '\'' +
                ", DataNascimento='" + dataNascimento + '\'' +
                ", Endereço=" + endereco +
                '}';
    }
}
