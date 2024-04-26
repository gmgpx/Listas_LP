import java.util.Random;

class Personagem {
    String nome;
    int vida, ataque, defesa;

    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.ataque = new Random().nextInt(11) + 20;
        this.defesa = new Random().nextInt(6) + 10;
    }

    void ataque(Personagem adversario) {
        int dano = this.ataque - adversario.defesa;
        adversario.vida -= dano;
        System.out.println(this.nome + " causou " + dano + " de dano em " + adversario.nome);
        if (adversario.vida <= 0) {
            System.out.println(adversario.nome + " foi derrotado!");
        } else {
            System.out.println(adversario.nome + " tem " + adversario.vida + " de vida restante.");
        }
    }
}