import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número para saber sua tabuada: ");

        int n = in.nextInt();

        if(n>=0 && n<=10){

            System.out.println("\nTabuada do "+n+"\n");

            for(int i=0; i<11; i++){

                System.out.println(n +" x "+i+" = "+ n*i);

            }
        }
    }
}