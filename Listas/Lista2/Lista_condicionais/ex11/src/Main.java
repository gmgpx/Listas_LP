import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número para descobrir o dia da semana: ");

        option = in.nextInt();

        switch (option){
            case 1:
                System.out.println("\nDomingo");
                break;
            case 2:
                System.out.println("\nSegunda-Feira");
                break;
            case 3:
                System.out.println("\nTerça-Feira");
                break;
            case 4:
                System.out.println("\nQuarta-Feira");
                break;
            case 5:
                System.out.println("\nQuinta-Feira");
                break;
            case 6:
                System.out.println("\nSexta-Feira");
                break;
            case 7:
                System.out.println("\nSábado");
                break;
            default:
                System.out.println("Número Inválido!");
                break;
        }

    }
}