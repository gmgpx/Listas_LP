import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double n1;
        double result;

        System.out.println("Digite uma distância em milhas para converter em kilômetros:");
        n1 = in.nextDouble();
        result = n1 * 1.6;

        System.out.println("Em kilômetros equivale a:\t" + result + " km");
    }
}