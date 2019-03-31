package pokemon;

import attacks.Attack;
import attacks.Earrape;
import attacks.Haaai;
import attacks.PomazoDeF;
import attacks.Poyo;


/**
 * Houndoom
 */
public class Kerbe extends Pokemon{
    private static Attack[] aux = {new Poyo(), new Earrape(), new Haaai(), new PomazoDeF()};
    public Kerbe() {
        super("Kerbe", 100, "Kirb", "Pomazo de F", 32234, 200, 300, 400, 350, 150, aux);
    }
}