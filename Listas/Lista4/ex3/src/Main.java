import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Escreva um número inteiro: ");
        int n = in.nextInt();

        int pos = -1;
        for(int i=0; i < numeros.length; i++){

            if(numeros[i] == n){
                pos = i;
                break;
            }
        }
        if(pos != -1)
        System.out.println("\n"+n+" está na "+pos+"º posição do array.");
            else
            System.out.println("Esse número não existe dentro do array.");
    }
}