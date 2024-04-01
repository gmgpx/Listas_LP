import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = in.nextInt();

        boolean primo = true;

        if (n <= 1) {
            primo = false;

        } else {
            for (int i = 2; i < n/2; i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(n + " é um número primo.");
        } else {
            System.out.println(n + " não é um número primo.");
        }
    }
}