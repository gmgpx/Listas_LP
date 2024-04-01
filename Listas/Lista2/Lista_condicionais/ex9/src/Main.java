import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os três valores dos lados do triângulo:");
        double l1 = scanner.nextDouble();
        double l2 = scanner.nextDouble();
        double l3 = scanner.nextDouble();

        if (l1 < (l2 + l3) && l1 > Math.abs(l2 - l3) &&
                l2 < (l1 + l3) && l2 > Math.abs(l2 - l3) &&
                l3 < (l1 + l2) && l3 > Math.abs(l2 - l3)) {

            if (l1 == l2 && l2 == l3) {
                System.out.println("É um triângulo equilátero.");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("É um triângulo isósceles.");
            } else {
                System.out.println("É um triângulo escaleno.");
            }
        } else {
            System.out.println("Os valores fornecidos não formam um triângulo.");
        }

    }
}