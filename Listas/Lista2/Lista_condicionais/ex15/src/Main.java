import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("**GM Cafeteria**");

        System.out.print("\nDigite o valor em reais para compra: R$");
        double valor = scanner.nextDouble();

        System.out.println("Menu de opções:");
        System.out.println("1 - Café expresso - R$1.50");
        System.out.println("2 - Café com leite(Pingado) - R$2.50");
        System.out.println("3 - Cappuccino - R$3.00");
        System.out.println("4 - Chocolate - R$2.00");
        System.out.print("Escolha a opção desejada: ");
        int opcao = scanner.nextInt();

        String bebida;
        double preco;

        switch (opcao) {
            case 1:

                if(valor >= 1.50){

                    bebida = "Café expresso";
                    preco = 1.50;

                }else{

                    System.out.print("\nSaldo insuficiente! Tente Novamente");
                    System.out.println("\nTroco: R$" + valor);

                    return;

                }
                break;
            case 2:

                if(valor >= 2.50){

                    bebida = "Café com leite (Pingado)";
                    preco = 2.50;

                }else{

                    System.out.print("\nSaldo insuficiente! Tente Novamente");
                    System.out.println("\nTroco: R$" + valor);

                    return;

                }
                break;
            case 3:

                if(valor >= 3){

                    bebida = "Cappuccino";
                    preco = 3;

                }else{

                    System.out.print("\nSaldo insuficiente! Tente Novamente");
                    System.out.println("\nTroco: R$" + valor);

                    return;

                }
                break;
            case 4:

                if(valor >= 2){

                    bebida = "Chocolate";
                    preco = 2;

                }else{

                    System.out.print("\nSaldo insuficiente! Tente Novamente");
                    System.out.println("\nTroco: R$" + valor);

                    return;

                }
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        double troco = valor - preco;

        System.out.println("\nÓtima escolha! " + bebida + " saindo!");
        System.out.println("Troco: R$" + troco);

    }
}