public class Main {
    public static void main(String[] args) {
        System.out.println("Tabela de conversão de Celsius para Fahrenheit:");
        System.out.println("Celsius \t Fahrenheit");

        for (int celsius = -80; celsius <= 80; celsius += 10) {
            double fahrenheit = (9.0 / 5.0) * celsius + 32;
            System.out.printf("%d \t\t %.1f\n", celsius, fahrenheit);
        }
    }
}
