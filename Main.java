/**
 * Main
 */
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Flee flee = new Flee();
        Attack attack = new Attack();

        Scanner sc = new Scanner(System.in);
        Pokemon pokemon = new Pokemon("Pikachu", "Electric", "Static Charge", 90, 70, 60, 70, 65, 85, 4);
        System.out.println(pokemon.getName() + " quiere aprender el ataque " + pokemon.getAttacks()[0].getName());
        System.out.println("Donde lo quieres aprender?");
        pokemon.setAttacks(null);
        System.out.println(pokemon.getAttacks()[0].getName());
        System.out.println(pokemon.getAttacks()[0].getPower());
        System.out.println(pokemon.getAttacks()[0].getPowerPoints());
        System.out.println(pokemon.getAttacks()[0].getPrecision());
        System.out.println(pokemon.getAttacks()[0].getType());
    }
}