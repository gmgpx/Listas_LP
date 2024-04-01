import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        // Lê o número real fornecido pelo usuário
        double numero = scanner.nextDouble();

        // Verifica se o número é positivo
        if (numero >= 0) {
            // Calcula a raiz quadrada usando o método Math.sqrt
            double raizQuadrada = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + numero + " é " + raizQuadrada);
        } else {
            System.out.println("Valor inválido!");
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}