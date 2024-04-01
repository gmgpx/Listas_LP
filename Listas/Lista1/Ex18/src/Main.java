import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double result;

        System.out.println("Digite o coeficiente a:");
        a = in.nextDouble();

        System.out.println("Digite o coeficiente b:");
        b = in.nextDouble();

        result = -b / a;

        System.out.println("Resposta da equação desejada:\t" +a+"X + (" + b + ") = 0, então x=" + result);

    }
}