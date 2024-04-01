import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        double result, n1, n2;

        System.out.println("**CALCULADORA JAVA**");

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");

        n1 = Scanner.nextDouble();

        System.out.println("Digite outro número: ");

        n2 = Scanner.nextDouble();

        System.out.println("MENU \n 1.Soma \n 2.Subtração \n 3.Multiplicação \n 4.Divisão");
        System.out.println("Selecione uma opção: ");

        option = Scanner.nextInt();

        switch (option){
            case 1:
                result = n1+n2;
                System.out.println("Resultado "+n1+" + "+n2+" = "+result);
                break;
            case 2:
                result = n1-n2;
                System.out.println("Resultado "+n1+" - "+n2+" = "+result);
                break;
            case 3:
                result = n1*n2;
                System.out.println("Resultado "+n1+" x "+n2+" = "+result);
                break;
            case 4:
                result = n1/n2;
                System.out.println("Resultado "+n1+" / "+n2+" = "+result);
                break;
            default:
                System.out.println("Número Inválido!");
                break;
        }

    }
}