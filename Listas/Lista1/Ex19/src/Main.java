import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double a, b, c, delta, x1, x2;

        System.out.println("Digite o coeficiente a:");
        a = in.nextDouble();

        System.out.println("Digite o coeficiente b:");
        b = in.nextDouble();

        System.out.println("Digite o coeficiente c:");
        c = in.nextDouble();

        delta = Math.pow(b,2) - 4 * a * c;
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);


        System.out.println("Resposta da equação desejada: " +a+"x² + (" + b + ")x + ("+c+") = 0, então x1 = " + x1 + " e x2 = " + x2);

    }
}