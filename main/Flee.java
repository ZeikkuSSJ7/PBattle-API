package main;

/**
 * Flee v1.0
 */
public abstract class Flee {
    public static int tries = 0;
    public static boolean flee(int enemyPokemonSpeed, int pokemonSpeed) {
        float f;
        f = (((pokemonSpeed*128)/enemyPokemonSpeed) + (30 * tries)) % 256;
        System.out.println(f);
        if (f>RandomClass.ran.nextInt(256)) {
            return true;
        }
        return false;
    }
}