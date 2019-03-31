package pokemon;

import attacks.Attack;
import attacks.FlameBurst;
import attacks.Flamethrower;
import attacks.Fly;
import attacks.RockSlide;

/**
 * Charizard
 */
public class Charizard extends Pokemon{
    private static Attack[] aux = {new Flamethrower(), new Fly(), new RockSlide(), new FlameBurst()};
    public Charizard() {
        super("Charizard", 100, "Fire", "Flying", "Fire Sea", 240, 200, 140, 210, 150, 190, aux);
    }
}