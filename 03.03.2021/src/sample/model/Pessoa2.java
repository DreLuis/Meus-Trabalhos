package sample.model;

//calss pessoa
public class Pessoa2 {

    //atributos
    private String nome;
    private String dataNascimento;
    private Contato contato;

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

    public void setContato(String whatsapp, String email, String twitter){
        Contato contato = new Contato();
        contato.setWhatsapp(whatsapp);
        contato.setEmail(email);
        contato.setTwitter(twitter);
        this.contato = contato;
    }

    //toString
    @Override
    public String toString() {
        return "Pessoa2{" +
                "nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", contato=" + contato +
                '}';
    }
}
