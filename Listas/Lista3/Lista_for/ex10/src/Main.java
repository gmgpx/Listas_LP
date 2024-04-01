import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n para gerar a sequência de Fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("Sequência de Fibonacci até o " + n + "º termo:");
        int fib = 0;
        int prevFib = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(fib + " ");
            int aux = fib;
            fib += prevFib;
            prevFib = aux;
        }

    }
}