package bag.medicines;

import bag.Medicine;
import pokemon.Pokemon;

/**
 * Hyperpotion
 */
public class Hyperpotion extends Medicine {
    public Hyperpotion() {
        super("Hyperpotion", "Heals 200 HP from a Pokemon", "200", 10);
    }

    @Override
    public void use(Pokemon pokemon) {
        pokemon.setHp(pokemon.getHp() + Integer.parseInt(getEffect()));
        System.out.println(pokemon.getName() + " healed " + getEffect() + "HP!");
        System.out.println("Now " + pokemon.getName() + " has " + pokemon.getHp() + "HP!");
    }
    
}