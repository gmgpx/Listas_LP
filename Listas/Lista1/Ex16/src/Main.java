import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double altura;
        double raio;
        double result;

        System.out.println("Digite a altura do cone:");

        altura = in.nextDouble();

        System.out.println("Digite o raio do cone:");

        raio = in.nextDouble();

        raio = raio * raio;
        result = altura * raio;
        result = result * 3.141592653589;
        result = result / 3;

        System.out.println("O volume desse cone é:\t" + result);

    }
}