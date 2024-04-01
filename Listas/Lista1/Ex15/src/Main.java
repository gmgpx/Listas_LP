import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double altura;
        double raio;
        double result;

        System.out.println("Digite a altura do cilindro:");

        altura = in.nextDouble();

        System.out.println("Digite o raio do cilindro:");

        raio = in.nextDouble();

        raio = Math.pow(raio,2);
        result = altura * raio;
        result = result * Math.PI;

        System.out.println("O volume desse cilindro é:\t" + result);

    }
}