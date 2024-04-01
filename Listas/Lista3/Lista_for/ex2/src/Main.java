import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite 5 números inteiros: ");

        for (int i = 0; i < 5; i++) {
            int n = in.nextInt();

            if (n > maior) {
                maior = n;
            }

            if (n < menor) {
                menor = n;
            }
        }

        System.out.println("\nO maior número digitado é: " + maior);
        System.out.println("O menor número digitado é: " + menor);

    }
}
