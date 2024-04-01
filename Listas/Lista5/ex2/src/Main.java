import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n = in.nextInt();

        int resultado = fatorial(n);
        System.out.println("O fatorial de " + n + " é " + resultado);
    }
    static int fatorial(int x) {
        if (x == 0 || x == 1) {
            return  1;
        } else {
            return x * fatorial(x - 1);
        }

    }
}
