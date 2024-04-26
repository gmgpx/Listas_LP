import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Arquivo arquivo = new Arquivo();

        arquivo.abrir();

        arquivo.renomear();

        arquivo.abrir();

        arquivo.editar();

        arquivo.abrir();

        arquivo.limpar();

        arquivo.abrir();
    }
}