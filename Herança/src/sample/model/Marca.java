package sample.model;

//class marca
public class Marca {

    //atributos
    private String nome;
    private String desc;

    //getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    //toString
    @Override
    public String toString(){
        return "\nMarca:" + nome
                + (desc != null ? desc : "");
    }
}