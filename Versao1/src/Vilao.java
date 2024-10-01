public class Vilao extends Personagem{
    private int maldade = 100;



    public Vilao(String nome, int vida) {
        super(nome, vida);
    }

    public Vilao() {

    }

    public int getMaldade() {
        return maldade;
    }

    public void setMaldade(int maldade) {
        this.maldade = maldade;
    }

    @Override
    public void atacar(int valor) {
        maldade -= valor;
        System.out.println(maldade);
    }

    @Override
    public void ganhador() {
        if ((vida == 0) || (maldade <= 0)) {
            System.out.println("Jogo encerrado, o herói ganhou!");

        }
        else {
            System.out.println("O jogo continua!");
        }

    }

}
