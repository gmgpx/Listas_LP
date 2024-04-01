import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");

        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número inteiro: ");

        double n2 = scanner.nextDouble();

        if (n1 > n2) {

            System.out.println(  n1 +" é maior que"+ n2);

        } else if (n2 > n1) {

            System.out.println(  n2 +" é maior que"+ n1);

        } else {

            System.out.println(  n2 +" e "+ n1 +" são iguais.");

        }
    }
}