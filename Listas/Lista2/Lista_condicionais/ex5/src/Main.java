import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota (0-10): ");

        double n1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota (0-10): ");

        double n2 = scanner.nextDouble();

        double media = (n1 + n2) / 2;

        if (media >= 8.5) {

            System.out.println(" \n Nota: A");

        } else if (media >=7){

            System.out.println(" \n Nota: B");

        } else if (media >= 5){

            System.out.println(" \n Nota: C");


        } else if (media < 5){

            System.out.println(" \n Nota: D");

        }


    }
}