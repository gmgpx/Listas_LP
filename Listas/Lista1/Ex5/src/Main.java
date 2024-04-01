import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double n1;
        double result;

        System.out.println("Digite uma velocidade em kilômetros por hora (Km/h) para ser convertido em metros por segundo:");

        n1 = in.nextDouble();
        result = n1 / 3.6;

        System.out.println("A velocidade é:\t" + result + " m/s");

    }
}