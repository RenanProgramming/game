public class Personagem {
    protected String nome;
    protected int vida;

    public Personagem() {
    }

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void atacar(int valor) {

    }

    public void subtrairVida(int valor) {
        if ((valor >=1) && (valor <= 5)) {
            vida -= 1;
        }
        else if ((valor >= 6) && (valor <= 10)) {
            vida -= 2;
        }
        else if ((valor >= 11)) {
            vida -= 3;
        }
        else {
            System.out.println("Valor inválido! ");
        }

    }

    public void ganhador() {
    }



}
