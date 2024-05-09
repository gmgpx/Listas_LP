import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String str = "cleber@hotmail.com";
        Random r = new Random();
        System.out.println(r.nextInt(11));

        r.setSeed(34);
        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt(100));

        r.setSeed(43);
        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt(100));

        r.setSeed(34);
        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt(100));

        System.out.println("O tamanho da string é igual a " + str.length());
        System.out.println("A letra 'o' aparece na posição: " + str.indexOf('o'));
        System.out.println("A posição 7 tem esse caractere: " + str.charAt(7));
        System.out.println("Mostre essa substring depois do char alvo: " + str.substring(9));

        System.out.println("dominio: " + str.substring(str.indexOf("@")+1));

        System.out.println(str.replace('c', '.'));


    }
}