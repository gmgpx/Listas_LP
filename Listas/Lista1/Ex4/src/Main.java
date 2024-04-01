import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double nota1;
        double nota2;
        double media;

        System.out.println("Digite sua primeira nota:");

        nota1 = in.nextDouble();

        System.out.println("Digite sua segunda nota:");

        nota2 = in.nextDouble();

        media = nota1 + nota2;
        media = media / 2;

        System.out.println("Sua nota média é:\t" + media);

    }
}