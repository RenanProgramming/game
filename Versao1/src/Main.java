import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Heroi h = new Heroi();
        Heroi batman = new Heroi("Batman", 70);
        Vilao v = new Vilao();
        Vilao coringa = new Vilao("Coringa", 60);

        int resposta;

        do {
            System.out.println("Digite:\n1 para cadastrar um herói\n2 para cadastrar um vilão\n3 para exibir os personagens fixos\n4 para o herói atacar.\n5 para o vilão atacar\n0 para sair do programa.");
            resposta = input.nextInt();

            switch(resposta) {
                case 0:
                    break;

                case 1:
                    System.out.println("Digite o nome do herói: ");
                    h.setNome(input.next());

                    System.out.println("Digite a vida do herói: ");
                    h.setVida(input.nextInt());


                    break;

                case 2:
                    System.out.println("Digite o nome do vilão: ");
                    v.setNome(input.next());

                    System.out.println("Digite a vida do vilão: ");
                    v.setVida(input.nextInt());



                    System.out.println("O vilão " + v.getNome() + " possui " + v.getVida() + " vidas.");

                    break;

                case 3:
                    batman.setBondade(100);
                    System.out.println("Os elementos fixos dos heróis cadastrados são:\n" + batman.getNome() + ", de vida " + batman.getVida() + " e com bondade " + batman.getBondade());
                    System.out.println();
                    coringa.setMaldade(100);
                    System.out.println("Os elementos fixos dos vilões cadastrados são:\n" + coringa.getNome() + ", de vida " + coringa.getVida() + " e com maldade " + coringa.getMaldade());
                    break;


                case 4:
                    System.out.println("Digite o valor do ataque: ");
                    int valor1 = input.nextInt();
                    h.atacar(valor1);
                    System.out.println("O herói " + h.getNome() + " possui " + h.getVida() + " vidas.");
                    v.subtrairVida(valor1);
                    System.out.println("A vida do vilão é: " + v.getVida());
                    h.ganhador();
                    break;

                case 5:

                    System.out.println("Digite o valor do ataque: ");
                    int valor2 = input.nextInt();
                    v.atacar(valor2);

                    System.out.println("O vilão " + v.getNome() + " possui " + v.getVida() + " vidas.");
                    h.subtrairVida(valor2);
                    System.out.println("A vida do herói é: " + h.getVida());
                    v.ganhador();
                    break;

            }
        }while(resposta!= 0);





    }
}