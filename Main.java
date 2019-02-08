/**
 * Main
 */
import java.util.*;
public class Main {
    public static boolean changed = false;
    public static boolean enemyChanged = false;
    public static Pokemon doSpecialEffect(Pokemon pokemon) {
        if (pokemon.getSpecialEffect() != null) {
            pokemon.setAttack(pokemon.getAttack() * SpecialEffect.burned(pokemon.getSpecialEffect()));
            pokemon.setSpeed(pokemon.getSpeed() * SpecialEffect.paralized(pokemon.getSpecialEffect()));
        }
        return pokemon;
    }
    public static void go(Pokemon pokemonInBattle, Pokemon pokemonInTeam) {
        pokemonInBattle.setName(pokemonInTeam.getName());
        pokemonInBattle.setType1(pokemonInTeam.getType1());
        pokemonInBattle.setType2(pokemonInTeam.getType2());
        pokemonInBattle.setAbility(pokemonInTeam.getAbility());
        pokemonInBattle.setAttack(pokemonInTeam.getAttack());
        pokemonInBattle.setDefense(pokemonInTeam.getDefense());
        pokemonInBattle.setSpecialAttack(pokemonInTeam.getSpecialAttack());
        pokemonInBattle.setSpecialDefense(pokemonInTeam.getSpecialDefense());
        pokemonInBattle.setSpeed(pokemonInTeam.getSpeed());
        pokemonInBattle.setSpecialEffect(pokemonInTeam.getSpecialEffect());
        pokemonInBattle.setHeldItem(pokemonInTeam.getHeldItem());
        pokemonInBattle.setHp(pokemonInTeam.getHp());
        pokemonInBattle.setAttacks(pokemonInTeam.getAttacks());
        pokemonInBattle.setLevel(pokemonInTeam.getLevel());
        System.out.println("Go " + pokemonInBattle.getName() + "!");
    }
    public static void change(Boolean changed, Pokemon pokemonInBattle, Pokemon pokemonInTeam){
        if (!changed) {
            go(pokemonInBattle, pokemonInTeam);
            changed = true;
        } else{
            System.out.println(pokemonInBattle.getName() + " come back!");
            go(pokemonInBattle, pokemonInTeam);
        }

    }
    public static boolean dead(Pokemon[] pokemon) {
        int cont = 0;
        
            if (pokemon[0].getHp() > 0) {
                cont++;
            }
        
        System.out.println(cont);
        if (cont > 0) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pokemon[] pokemonInTeam = new Pokemon[1];
        pokemonInTeam[0] = new Pokemon("Pikachu", 100, "Electric", "Static Charge", 90, 70, 60, 70, 65, 85, 4);
        Pokemon[] pokemonEnemyInTeam = new Pokemon[1];
        pokemonEnemyInTeam[0] = new Pokemon("Ludicolo", 100, "Grass", "Absorb Water", 120, 60, 80, 70, 100, 60, 4);
        Pokemon pokemonInBattle = new Pokemon();
        Pokemon pokemonEnemyInBattle = new Pokemon();
        change(changed, pokemonInBattle, pokemonInTeam[0]);
        change(enemyChanged, pokemonEnemyInBattle, pokemonEnemyInTeam[0]);
        do {
            String select = sc.next();
            switch (select) {
                case "1":
                    System.out.println("PIKACUse INFORMATION!");
                    Attack.fight(pokemonInBattle, pokemonEnemyInBattle);
                    doSpecialEffect(pokemonInBattle);
                    pokemonInBattle.setSpecialEffect(Thunderbolt.specialEffect());
                    System.out.println(pokemonInBattle.getSpecialEffect());
                    doSpecialEffect(pokemonEnemyInBattle);
                    break;
            
                default:
                    break;
            }
            System.out.println(dead(pokemonEnemyInTeam));
        } while (!dead(pokemonEnemyInTeam));
    }
}