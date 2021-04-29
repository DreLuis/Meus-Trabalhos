package sample.model;

//Classe Pessoa Jurica, filho de Pessoa
public final class PessoaJuridica extends Pessoa {

    //atributos
    private String cnpj;
    private String ie;

    //construtor passando nome, cnpj e ie como parâmetros
    public PessoaJuridica(String nome){
        super(nome);
    }
    public PessoaJuridica(String nome, String cnpj){
        super(nome);
        this.cnpj = cnpj;
    }
    public PessoaJuridica(String nome, String cnpj, String ie){
        super(nome);
        this.cnpj = cnpj;
        this.ie = ie;
    }

    //getters e setters
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }
    public void setIe(String ie) {
        this.ie = ie;
    }

    //toString
    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", ie='" + ie + '\'' +
                '}';
    }
}
