package sample.model;

//class cliente
public class Cliente {

    //atributos são caracteristicas da classe
    String nome;
    String email;
    String telefone;
    int idade;

    //getters e setters
    //são ações ou modificadores dos atributos
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }
    public void  setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    //toString
    @Override
    public String toString() {
        return "cliente{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", idade=" + idade +
                '}';
    }
}
