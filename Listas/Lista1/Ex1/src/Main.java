import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double n1;
        double result;
        System.out.println("Digite um número para ser dobrado:");

        n1 = in.nextDouble();
        result = n1 * 2;

        System.out.println("O seu número dobrado é:\t" + result);

    }
}