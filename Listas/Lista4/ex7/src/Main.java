import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = in.nextInt();
            }
        }
        int maiorSomaLinhas = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            int soma = 0;
            for (int j = 0; j < 5; j++) {
                soma += matriz[i][j];
            }
            if (soma > maiorSomaLinhas) {
                maiorSomaLinhas = soma;
            }
        }
        int maiorSomaColunas = Integer.MIN_VALUE;
        for (int j = 0; j < 5; j++) {
            int soma = 0;
            for (int i = 0; i < 5; i++) {
                soma += matriz[i][j];
            }
            if (soma > maiorSomaColunas) {
                maiorSomaColunas = soma;
            }
        }
        System.out.println("Maior soma entre as linhas: " + maiorSomaLinhas);
        System.out.println("Maior soma entre as colunas: " + maiorSomaColunas);
    }
}