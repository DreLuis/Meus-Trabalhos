package sample.model;

//Classe carro, filha de veículo
public final class Carro extends Veiculo {

    //atributo
    private int portas;

    //construtor passando nome e portas como parâmetros
    public Carro(String nome, int portas){
        super(nome);
        this.portas = portas;
    }

    //get e set
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }

    //toString
    public String toString(){
        return super.toString() + "\nPortas: " + portas;
    }
}