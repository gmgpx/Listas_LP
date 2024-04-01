public class Main {
    public static void main(String[] args) {

        int[] vetor = {1, 2, 30, 4, 5, 6, 7, 8, 9, 120};

        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < vetor.length / 2; i++) {
            int aux = vetor[i];
            vetor[i] = vetor[(vetor.length - 1) - i];
            vetor[(vetor.length - 1) - i] = aux;
        }

        System.out.println("\nVetor invertido:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}

