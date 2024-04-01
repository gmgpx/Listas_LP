import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double altura;
        double base;
        double result;

        System.out.println("Digite a altura do triângulo:");

        altura = in.nextDouble();

        System.out.println("Digite a base do triângulo:");

        base = in.nextDouble();

        result = altura * base;
        result = result / 2;

        System.out.println("A área desse triângulo é:\t" + result);

    }
}