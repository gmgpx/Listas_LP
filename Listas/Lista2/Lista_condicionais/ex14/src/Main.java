import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("**GM STORE**\n");
        System.out.print("Seu sonho está aqui.\n\n");
        System.out.print("Digite o valor da compra: R$");
        double valorCompra = scanner.nextDouble();

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - Débito");
        System.out.println("2 - Crédito");
        System.out.println("3 - Pix");
        System.out.print("Opção: ");
        int formaPagamento = scanner.nextInt();

        double totalPagar;
        switch (formaPagamento) {
            case 1:
                totalPagar = valorCompra * 0.95;
                break;
            case 2:
                System.out.print("Digite o número de parcelas: ");
                int parcelas = scanner.nextInt();
                if (parcelas <= 4) {
                    totalPagar = valorCompra * (1 + 0.02 * parcelas);
                } else {
                    totalPagar = valorCompra * (1 + 0.05 * parcelas);
                }
                break;
            case 3:
                totalPagar = valorCompra * 0.90;
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("Total a pagar: R$" + totalPagar);

    }
}