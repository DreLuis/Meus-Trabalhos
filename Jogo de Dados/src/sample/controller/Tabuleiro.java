package sample.controller;

import sample.model.Dado;
import sample.model.Jogador;

import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.List;

//class tabuleiro
public class Tabuleiro {

    //Atributos
    private List<Jogador> jogadores;

    //metodo
    public Tabuleiro(List<String> nomes){

        jogadores = new ArrayList<>();

        for(int i = 0; i < nomes.size(); i++){
            Jogador jogador = new Jogador();
            jogador.setNome(nomes.get(i));
            jogadores.add(jogador);
        }
    }

    public void jogar(){
        for(int i = 0; i < jogadores.size(); i++){
            Dado dado1 = new Dado();
            Dado dado2 = new Dado();

            dado1.lancar();
            dado2.lancar();
            int pontos = dado1.getFace() + dado2.getFace();

            jogadores.get(i).setPonto(pontos);
            System.out.println(pontos);

            if (pontos == 7){
                jogadores.get(i).setVenceu(true);
            } else {
                jogadores.get(i).setVenceu(false);
            }
        }
    }

    //toString
    public String toString(){
        String resultado = "FINAL DE JOGO \n";

        for (int i = 0; i < jogadores.size(); i++){
            resultado += jogadores.get(i).toString() + "\n";
        }
        return  resultado;
    }
}