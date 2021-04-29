package sample;

import sample.model.Livro;

public class MainLivro {

    public static void main(String[] args){
        Livro livro = new Livro();
        livro.setTitulo("Diario de um Banana");
        livro.setAutor("Jeff Kinney");
        livro.setEditora("V&R");
        livro.setAno(2012);
        System.out.println();

    }
}
