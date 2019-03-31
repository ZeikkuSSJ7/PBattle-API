package pokemon;

import attacks.Attack;
import attacks.FlameBurst;
import attacks.Flamethrower;
import attacks.DarkPulse;
import attacks.DragonPulse;

/**
 * Houndoom
 */
public class Houndoom extends Pokemon{
    private static Attack[] aux = {new Flamethrower(), new DragonPulse(), new DarkPulse(), new FlameBurst()};
    public Houndoom() {
        super("Houndoom", 100, "Fire", "Dark", "Absorb Fire", 220, 190, 180, 240, 170, 220, aux);
    }
}