import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Jogo da tabuada! \nVamos começar... ");

        boolean jogarNovamente = true;

        while (jogarNovamente) {
            boolean jogoGanho = true;

            for (int numero = 1; numero <= 10; numero++) {
                for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                    int resultado = numero * multiplicador;
                    System.out.print("Quanto é " + numero + " x " + multiplicador + "? ");
                    int resposta = in.nextInt();

                    if (resposta != resultado) {
                        System.out.println("\nErrado! O resultado era " + resultado + ". \nFim de jogo.");
                        jogoGanho = false;
                        break;
                    }
                }
                if (!jogoGanho) {
                    break;
                }
            }

            if (jogoGanho) {
                System.out.println("Parabéns! Você completou a tabuada sem erros!");
            }

            System.out.print("\nVocê deseja jogar novamente? (s/n): ");
            String opcao = in.next();
            jogarNovamente = opcao.equalsIgnoreCase("s");
        }

    }
}