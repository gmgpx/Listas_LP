public class Main {
    public static void main(String[] args) {

        for (int tabuada = 1; tabuada <= 10; tabuada++) {
            System.out.println("Tabuada do " + tabuada + ":");

            for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                int resultado = tabuada * multiplicador;
                System.out.println(tabuada + " x " + multiplicador + " = " + resultado);
            }

            System.out.println();
        }
    }
}
