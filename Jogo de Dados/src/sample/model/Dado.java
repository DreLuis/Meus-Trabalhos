package sample.model;

import java.util.Random;

//class dado
public class Dado {

    //atributos
    private int face;

    //metodo
    public Dado(){
        this.face = 0;
    }

    public void lancar(){
        Random random = new Random();
        while (this.face == 0) this.face = random.nextInt(7);
    }

    public int getFace() {
        return face;
    }
}