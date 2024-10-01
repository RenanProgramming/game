public class Heroi extends Personagem{

    private int bondade = 100;



    public Heroi(String nome, int vida) {
        super(nome, vida);
    }

    public Heroi() {

    }

    public int getBondade() {
        return bondade;
    }

    public void setBondade(int bondade) {
        this.bondade = bondade;
    }

    @Override
    public void atacar(int valor) {
        bondade -= valor;
        System.out.println(bondade);
    }

    @Override
    public void ganhador() {
        if ((vida == 0) || (bondade <= 0)) {
            System.out.println("Jogo encerrado, o vilão ganhou!");

        }
        else {
            System.out.println("O jogo continua!");
        }
    }


}
