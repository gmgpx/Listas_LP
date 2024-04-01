import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase para verificar se é um palíndromo: ");
        String palavra = in.nextLine();

        if (isPalindrome(palavra)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }
    }
    public static boolean isPalindrome(String str) {

        // Remove caracteres não alfabéticos e converte para minúsculas
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
