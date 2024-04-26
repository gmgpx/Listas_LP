import java.util.Scanner;

class Arquivo {
    private String nome;
    private int tamanho;
    private String conteudo;

    Scanner scanner = new Scanner(System.in);

    public Arquivo() {
        this.nome = "";
        this.conteudo = "";
        this.tamanho = 0;
    }

    public void abrir() {
        System.out.println("Abrindo arquivo: " + this.nome);
        System.out.println("Conteúdo: " + this.conteudo);
        System.out.println("Tamanho: " + this.tamanho + " bits\n");
    }

    public void editar() {
        System.out.println("Digite o novo conteúdo:");
        this.conteudo += scanner.nextLine();
        this.tamanho = this.conteudo.length() * 8; // 1 byte = 1 caracter = 8 bits
        System.out.println("Arquivo editado!\n");
    }

    public void renomear() {
        System.out.println("Digite o novo nome:");
        this.nome = scanner.nextLine();
        System.out.println("Arquivo renomeado para: " + this.nome + "!\n");
    }

    public void limpar() {
        this.conteudo = "";
        this.tamanho = 0;
        System.out.println("Arquivo limpo!");
    }
}