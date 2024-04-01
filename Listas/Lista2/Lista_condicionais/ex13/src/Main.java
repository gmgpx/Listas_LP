import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        double result, r, perimeter, areac, b, h, areat;
        double bret, hret, arearet, l1, l2, l3, perimetert, perimeterret;
        Scanner Scanner = new Scanner(System.in);

        System.out.println("**CALCULADORA GEOMÉTRICA**");

        System.out.println("MENU \n 1.Círculo \n 2.Triângulo Retângulo \n 3.Retângulo");
        System.out.println("Selecione uma opção: ");

        option = Scanner.nextInt();

        switch (option){
            case 1:

                System.out.println("Digite o raio do círculo:");

                r = Scanner.nextDouble();

                perimeter = 2 * Math.PI * r;
                areac = Math.PI * Math.pow(r,2);

                System.out.println("Perímetro do círculo: "+perimeter);
                System.out.println("Área do círculo: "+areac);

                break;
            case 2:

                System.out.println("Digite o primeiro,segundo e terceiro lado do Triângulo Retângulo:");

                l1 = Scanner.nextDouble();
                l2 = Scanner.nextDouble();
                l3 = Scanner.nextDouble();

                System.out.println("Digite a base do Triângulo Retângulo:");

                b = Scanner.nextDouble();

                System.out.println("Digite a altura do Triângulo Retângulo:");

                h = Scanner.nextDouble();

                areat = b * h / 2;
                perimetert = l1 + l2 + l3;

                System.out.println("Perímetro do Triângulo Retângulo: "+perimetert);

                System.out.println("Área do Triângulo Retângulo: "+areat);
                break;
            case 3:
                System.out.println("Digite a base do Triângulo Retângulo:");

                bret = Scanner.nextDouble();

                System.out.println("Digite a altura do Triângulo Retângulo:");

                hret = Scanner.nextDouble();

                perimeterret = 2 * (bret + bret);
                arearet = bret * hret;

                System.out.println("Área do Retângulo: "+arearet);
                System.out.println("Perímetro do Retângulo: "+perimeterret);

                break;
            default:
                System.out.println("Número Inválido!");
                break;
        }

    }
}