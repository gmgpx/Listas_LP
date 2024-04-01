import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double n1;
        double result;

        System.out.println("Digite um valor milímetros para converter em polegada milesimal:");
        n1 = in.nextDouble();
        result = n1 / 25.4;

        System.out.println("Em polegada milesimal equivale a:\t" + result + "'");

    }
}
