import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        System.out.println("Digite um número inteiro: ");
        n = in.nextInt();

        int resultado = soma(n);
        System.out.println("A soma de todos os números inteiros de 1 até " + n + " é " + resultado);
    }
    public static int soma(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + soma(n - 1);
        }
    }
}
