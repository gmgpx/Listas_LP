import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = in.nextInt();
        System.out.print("Digite o número da potência: ");
        int expo = in.nextInt();

        int resultado = pot(n, expo);
        System.out.println("\nA potência de " + n + " elevado a " + expo + " é: " + resultado);
    }
    static int pot(int numero, int expoente) {
        int resultado = 1;
        for(int i = 0; i < expoente; i++) {
            resultado *= numero;
        }
        return resultado;
    }
}
