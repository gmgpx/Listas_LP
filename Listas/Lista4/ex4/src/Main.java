import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] numeros = new int[10];
        int [] maior = new int [1];
        int [] menor = new int [1];

        System.out.println("Digite 10 números inteiros: ");

        for (int i = 1; i < numeros.length; i++) {
            numeros[i] = in.nextInt();
        if (numeros[i] > maior[0]) {
                maior[0] = numeros[i];
                maior[1] = i;
            }

            if (numeros[i] < menor[0]) {
                menor[0] = numeros[i];
                menor[1] = i;
            }
        }
        System.out.println("\nO maior número digitado é: " + maior[0] +" e está na "+maior[1]+"º posição do array.");
        System.out.println("O menor número digitado é: " + menor[0] +" e está na "+menor[1]+"º posição do array.");
    }
}