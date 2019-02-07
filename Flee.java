import java.util.Random;

/**
 * Flee v1.0
 */
public class Flee {
    public static int tries = 0;
    public static boolean flee(int enemyPokemonSpeed, int pokemonSpeed) {
        Random ran = new Random();
        float f;
        f = (((pokemonSpeed*128)/enemyPokemonSpeed) + (30 * tries)) % 256;
        System.out.println(f);
        if (f>ran.nextInt(256)) {
            return true;
        }
        return false;
    }
}