import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Banco SENAI\n\n");
        System.out.print("**Validação de segurança pendente**\n\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu código de segurança: \n");

        int n1 = scanner.nextInt();

        if ( n1 == 5 || n1 == 6 || n1 == 7 || n1 == 8 || n1 == 9){

            System.out.print("Código válido");


        }else{

            System.out.print("Código inválido");

        }
    }
}