public class Main {
    public static void main(String[] args) {

        // Equipe 1
        Personagem ryu = new Personagem("Ryu");
        Personagem chunli = new Personagem("Chun-Li");
        // Equipe 2
        Personagem ken = new Personagem("Ken");
        Personagem blanka = new Personagem("Blanka");

        while (ryu.vida > 0 && ken.vida > 0 && blanka.vida > 0 && chunli.vida > 0) {
            ryu.ataque(ken);
            if (ken.vida <= 0) break;
            ken.ataque(chunli);
            if (chunli.vida <= 0) break;
            chunli.ataque(blanka);
            if (blanka.vida <= 0) break;
            blanka.ataque(ryu);
        }
        if(ryu.vida <= 0 || chunli.vida <= 0)
            System.out.println("Equipe 2 Win!");
        if(ken.vida <= 0 || blanka.vida <= 0)
            System.out.println("Equipe 1 Win!");

        System.out.println("                        █▄                   ██▄                                   ");
        System.out.println("                ▄▄▄     ▌ █  █▀▀▄█ █▀▄      ▐▌  ▀▄    ▄▄▄▀▀▀▀▀▀▄                   ");
        System.out.println("                █   ▀▄ ▐▌  ▐▀     █   ██  ▄▄ ▐▌  ██▀▀█  ▀▄    ▄▀▄▄      ▄▄         ");
        System.out.println("                  █▄ ▀██  ▐     ▄▄▄█▌ █  █  █  ▀▄ ▐█   █  ▄   █  █▄    █  █        ");
        System.out.println("                    █▄    ▌   █  ▐▌█▄ █ ▐▌ █    █▄ █ █ █  █   ▌    █   ▀▌ █        ");
        System.out.println("                      █  █▀▄   ▀▀  █▀▄ ▀▀  █     █  ▀█▄   ▌  █     █   █  █        ");
        System.out.println("                      ▐▄  █ ▀▀▀▀▀▀▀   ▀▀▀▀▀      ▀█▄██▄▄▄▀   █   ▄  ▀▀   █         ");
        System.out.println("                        ▀▀                               ▀▄▄▄▀▄▄▀ ▀▄▄▄▄▄▀          ");

    }
}
