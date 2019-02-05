/**
 * Main
 */
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Flee flee = new Flee();
        Attack attack = new Attack();

        Scanner sc = new Scanner(System.in);
        Pokemon pokemon = new Pokemon("Pikachu", 100, "Electric", "Static Charge", 90, 70, 60, 70, 65, 85, 4);
        Pokemon pokemon2 = new Pokemon("Ludicolo", 100, "Grass", "Water", "Absorb Water", 120, 60, 80, 70, 100, 60, 4);
        System.out.println("PIKACUse INFORMATION!");
        System.out.println("PIKAC damage " + Attack.fight(pokemon.getLevel(), pokemon.getSpecialAttack(), pokemon2.getSpecialDefense(), pokemon.getAttacks()[0].getPower(), pokemon.getAttacks()[0].getType(), pokemon.getType1(), pokemon2.getType1(), pokemon2.getType2()) + "!");
    }
}