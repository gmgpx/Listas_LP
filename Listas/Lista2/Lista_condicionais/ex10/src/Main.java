import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três números inteiros:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("Os números são iguais: " + a);
        } else {

            if (a <= b && a <= c) {
                if (b <= c) {
                    System.out.println(a + " " + b + " " + c);
                } else {
                    System.out.println(a + " " + c + " " + b);
                }
            } else if (b <= a && b <= c) {
                if (a <= c) {
                    System.out.println(b + " " + a + " " + c);
                } else {
                    System.out.println(b + " " + c + " " + a);
                }
            } else {
                if (a <= b) {
                    System.out.println(c + " " + a + " " + b);
                } else {
                    System.out.println(c + " " + b + " " + a);
                }
            }
        }

    }
}