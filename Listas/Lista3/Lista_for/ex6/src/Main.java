import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = in.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = in.nextInt();

        System.out.println("Números entre " + n1 + " e " + n2 + ":");

        int menor = Math.min(n1, n2);
        int maior = Math.max(n1, n2);

        for (int i = menor + 1; i < maior; i++)
            System.out.print(i + " ");

    }
}