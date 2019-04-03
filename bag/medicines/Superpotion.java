package bag.medicines;

import bag.Medicine;
import pokemon.Pokemon;

/**
 * Superpotion
 */
public class Superpotion extends Medicine {
    public Superpotion() {
        super("Superpotion", "Heals 50 HP from a Pokemon", "50", 10);
    }

    @Override
    public void use(Pokemon pokemon) {
        pokemon.setHp(pokemon.getHp() + Integer.parseInt(getEffect()));
        System.out.println(pokemon.getName() + " healed " + getEffect() + "HP!");
        System.out.println("Now " + pokemon.getName() + " has " + pokemon.getHp() + "HP!");
    }
    
}