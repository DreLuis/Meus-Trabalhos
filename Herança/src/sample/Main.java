package sample;

import sample.model.Caminhao;
import sample.model.Carro;

public class Main {

    public static void main(String[] args) {


        Carro carro = new Carro("Fiesta", 4);
        carro.setMarca("Ford", "uma descrição");
        System.out.println(carro);

        Caminhao caminhao = new Caminhao("F14000", 3);
        caminhao.setMarca("Ford", "outra descricao");
        System.out.println(caminhao);
    }
}
