package pokemon;

import attacks.Attack;
import attacks.Headbutt;
import attacks.HydroPump;
import attacks.IceBeam;
import attacks.Surf;


/**
 * Blastoise
 */
public class Blastoise extends Pokemon{
    private static Attack[] aux = {new Surf(), new Headbutt(), new HydroPump(), new IceBeam()};
    public Blastoise() {
        super("Blastoise", 100, "Water",  "Torrent", 250, 140, 210, 180, 200, 150, aux);
    }
}