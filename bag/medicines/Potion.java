package bag.medicines;

import bag.Medicine;
import pokemon.Pokemon;

/**
 * Potion
 */
public class Potion extends Medicine {
    public Potion() {
        super("Potion", "Heals 20 HP from a Pokemon", "20", 10);
    }

    @Override
    public void use(Pokemon pokemon) {
        pokemon.setHp(pokemon.getHp() + Integer.parseInt(getEffect()));
        System.out.println(pokemon.getName() + " healed " + getEffect() + "HP!");
    }
    
}