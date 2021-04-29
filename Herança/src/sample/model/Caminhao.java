package sample.model;

//Classe caminhao, filho de veículo
public final class Caminhao extends Veiculo{

    //atributos
    private int eixos;

    //construtor passando nome e eixos como parâmetros
    public Caminhao(String nome, int eixos){
        super(nome);
        this.eixos = eixos;
    }

    //getters e setters
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "\nEixos: " + eixos;
    }
}
