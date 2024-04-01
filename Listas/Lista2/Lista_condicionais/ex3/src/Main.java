import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota SENAI (0-100): ");

        double n1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota SENAI (0-100): ");

        double n2 = scanner.nextDouble();

        double media = (n1 + n2) / 2;

        if (media >= 50) {

            System.out.println(" \nAprovado!");

        } else {

            System.out.println("\nReprovado.");

        }
    }
}