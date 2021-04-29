package sample.model;

//Classe Pessoa Fisica, filho de Pessoa
public final class PessoaFisica extends Pessoa{

    //atributos
    private String cpf;
    private String rg;

    //construtor passando nome, cpf e rg como parâmetros
    public PessoaFisica(String nome){
        super(nome);
    }
    public PessoaFisica(String nome, String cpf){
        super(nome);
        this.cpf = cpf;
    }
    public PessoaFisica(String nome, String cpf, String rg){
        super(nome);
        this.cpf = cpf;
        this.rg = rg;
    }

    //getters e setters
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    //tostring
    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                '}';
    }
}
