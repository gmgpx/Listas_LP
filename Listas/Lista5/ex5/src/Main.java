import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor alvo dentro do array: ");
        int target = in.nextInt();

        int position = binarySearch(array, target);
        if (position != -1) {
            System.out.println("O elemento " + target + " foi encontrado na posição " + position);
        } else {
            System.out.println("O elemento " + target + " não foi encontrado no array.");
        }
    }
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Elemento encontrado, retorna a posição
            } else if (array[mid] < target) {
                left = mid + 1; // Busca na metade direita do array
            } else {
                right = mid - 1; // Busca na metade esquerda do array
            }
        }
        return -1; // Elemento não encontrado
    }
}
