import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, sobra;

        System.out.println("Digite um número inteiro: ");
        n = in.nextInt();

        sobra = n%2;

        if(sobra >= 0.1){

            System.out.println(+ n +" é um número impar");


        }else{

            System.out.println(+ n +" é um número par");

        }
    }

}