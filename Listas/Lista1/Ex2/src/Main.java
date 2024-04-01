import java.util.Scanner;
import java.lang.Math;  //Biblioteca matemática , sqrt=Raiz quadrada
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double number;
        double result;

        System.out.println("Digite um número para exibi-lo ao quadrado:");

        number = in.nextDouble();
        result = Math.pow(number,2);

        System.out.println("O seu número dobrado é:\t" + result);

    }
}