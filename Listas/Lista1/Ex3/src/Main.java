import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double n1;
        double result;

        System.out.println("Digite um número real para saber sua quinta parte:");

        n1 = in.nextDouble();
        result = n1 / 5;

        System.out.println("Sua quinta parte é:\t" + result);

    }
}