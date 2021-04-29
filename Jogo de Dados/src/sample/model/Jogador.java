package sample.model;

//class jogador
public class Jogador {

    //atributos
    private String nome;
    private boolean venceu;
    private int ponto;

    //metodo
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVenceu() {
        return venceu;
    }
    public void setVenceu(boolean venceu) {
        this.venceu = venceu;
    }

    public int getPonto() {
        return ponto;
    }
    public void setPonto(int ponto) {
        this.ponto = ponto;
    }

    //toString
    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", venceu=" + venceu +
                ", ponto=" + ponto +
                '}';
    }
}
