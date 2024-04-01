import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double n1;
        double result;
        System.out.println("Digite o raio para calcular a sua área:");

        n1 = in.nextDouble();
        result = Math.PI * Math.pow(n1,2);

        System.out.println("A área desse círculo é:\t" + result);

    }
}