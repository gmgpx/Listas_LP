import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double vo;
        double a;
        double s;
        double result;

        System.out.println("Digite a velocidade inicial:");

        vo = in.nextDouble();

        System.out.println("Digite a aceleração do corpo:");

        a = in.nextDouble();

        System.out.println("Digite o tempo de percurso:");

        s = in.nextDouble();

        result = 2 * a * s;
        vo = vo * vo;
        result = vo * result;
        result = result * result;

        System.out.println("A velocidade final do corpo é:\t" + result);

    }
}