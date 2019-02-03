import java.util.Random;

/**
 * Flee
 */
public class Flee {
    private int tries;
    public Flee() {
        this.tries = 0;
    }
    public int getTries() {
        return tries;
    }
    public void setTries(int tries) {
        this.tries = tries;
    }
    public boolean flee(int enemyPokemonSpeed, int pokemonSpeed) {
        Random ran = new Random();
        float f;
        f = (((pokemonSpeed*128)/enemyPokemonSpeed) + (30 * this.tries)) % 256;
        System.out.println(f);
        if (f>ran.nextInt(256)) {
            return true;
        }
        return false;
    }
}