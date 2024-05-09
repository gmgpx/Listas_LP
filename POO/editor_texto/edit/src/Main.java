public class Main{
    public static void main(String[] args) {
        Arquivo arquivo = new Arquivo();

        System.out.println(arquivo);

        arquivo.renomear();

        System.out.println(arquivo);

        arquivo.editar();

        System.out.println(arquivo);

        arquivo.limpar();

        System.out.println(arquivo);
    }
}