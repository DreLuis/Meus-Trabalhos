package sample.model;

//class Veiculo
public class Veiculo {
    //atributos
    int numVelocidade;
    String placa;

    //construtor
    public Veiculo(String placa){
        this.placa = placa;
        this.numVelocidade = 0;
    }

    //consultar placa
    public String consultarPlaca(){
        return "Placa do veículo: " + this.placa;
    }

    //consultar velocidade
    public int consutarVelocidade(){
        return this.numVelocidade;
    }

    //acelera
    public int acelrar(int valor){
        this.numVelocidade += valor;
        return this.numVelocidade;
    }

    //freiar
    public int freiar(int valor){
        if (numVelocidade > 0){
            numVelocidade -= valor;
            if (numVelocidade < 0) numVelocidade = 0;

            return numVelocidade;
        } else {
            return numVelocidade;
        }
    }
}
