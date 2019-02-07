/**
 * Main
 */
import java.util.*;
public class Main {
    public static Pokemon doSpecialEffect(Pokemon pokemon) {
        if (pokemon.getSpecialEffect() != null) {
            pokemon.setAttack(pokemon.getAttack() * SpecialEffect.burned(pokemon.getSpecialEffect()));
            pokemon.setSpeed(pokemon.getSpeed() * SpecialEffect.paralized(pokemon.getSpecialEffect()));
        }
        return pokemon;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pokemon pokemon = new Pokemon("Pikachu", 100, "Electric", "Static Charge", 90, 70, 60, 70, 65, 85, 4);
        Pokemon pokemon2 = new Pokemon("Ludicolo", 100, "Grass", "Absorb Water", 120, 60, 80, 70, 100, 60, 4);
        String select = sc.next();
        System.out.println("PIKACUse INFORMATION!");
        
        switch (select) {
            case "1":
                int pepe = (int)Attack.fight(pokemon.getLevel(), pokemon.getSpecialAttack(), pokemon2.getSpecialDefense(), pokemon.getAttacks()[0].getPower(), pokemon.getAttacks()[0].getType(), pokemon.getType1(), pokemon.getType2(), pokemon2.getType1(), pokemon2.getType2());
                pokemon.setSpecialEffect(Thunderbolt.specialEffect());
                doSpecialEffect(pokemon);
                System.out.println(pokemon.getSpecialEffect());
                doSpecialEffect(pokemon2);
                System.out.println("PIKAC damage " + pepe + "!");
                break;
        
            default:
                break;
        }
    }
}