import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double n1;
        double result;

        System.out.println("Digite uma distância em km para converter em milhas:");
        n1 = in.nextDouble();
        result = n1 / 1.6;

        System.out.println("Em milhas equivale a:\t" + result + " milhas");
        }
    }