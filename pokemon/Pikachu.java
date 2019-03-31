package pokemon;

import attacks.Attack;
import attacks.ElectricTackle;
import attacks.Thunderbolt;
import attacks.Poyo;

/**
 * Pikachu
 */
public class Pikachu extends Pokemon{
    private static Attack[] aux = {new Thunderbolt(), new ElectricTackle(), new Poyo(), null};
    public Pikachu() {
        super("Pikachu", 100, "Electric", "Static Charge", 250, 190, 160, 195, 140, 210, aux);
    }
}