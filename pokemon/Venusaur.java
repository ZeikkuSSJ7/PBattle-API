package pokemon;

import attacks.Attack;
import attacks.DoubleEdge;
import attacks.EnergyBall;
import attacks.Gigadrain;
import attacks.SludgeBomb;


/**
 * Venusaur
 */
public class Venusaur extends Pokemon{
    private static Attack[] aux = {new Gigadrain(), new SludgeBomb(), new EnergyBall(), new DoubleEdge()};
    public Venusaur() {
        super("Venusaur", 100, "Grass", "Posion",  "Overgrow", 230, 140, 190, 210, 200, 160, aux);
    }
}