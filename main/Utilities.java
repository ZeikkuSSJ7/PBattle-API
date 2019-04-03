package main;

import attacks.*;
import bag.Bag;
import bag.medicines.*;
import bag.items.*;
import pokemon.*;
/**
 * Utilities
 */
public abstract class Utilities {
    /**
     * Used for the start of the battle and for every time you want to change pokemons
     * @param pokemonInBattle the pokemon used in battle
     * @param pokemonInTeam the pokemon to change
     */
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
    /**
     * Used for changing pokemons, calls the method change()
     * @param pokemonInBattle the pokemon used in battle
     * @param pokemonInTeam the pokemon to change
     */
    public static void change(Pokemon pokemonInBattle, Pokemon pokemonInTeam){
        System.out.println(pokemonInBattle.getName() + " come back!");
        go(pokemonInBattle, pokemonInTeam);
    }
    /**
     * Used for checking if the pokemon team on the array recieved are all dead
     * @param pokemon the team to check
     * @return true for all dead, false for at least 1 alive
     */
    public static boolean dead(Pokemon[] pokemon) {
        for (int i = 0; i < pokemon.length; i++) {
            if (pokemon[i] != null) {
                if (pokemon[i].getHp() > 0) {
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * Used in the main class to print all attack data from the attack recieved
     * @param attack the attack to print
     * @return <code>String</code> with all attack data needed for the battle
     */
    private static String printAttack(Attack attack) {
        if (attack != null) {
            return attack.getName() + " " + attack.getPowerPoints() + "PP";
        }
        return "---";
    }
    /**
     * Used in the main class for printing all the data of the Attack array recieved, 
     * also calls the method print attack for each attack of the array
     * @param attacks the Attack array to print
     * @return String with the data of all attacks
     */
    public static String printAttacks(Attack[] attacks) {
        return "1. " + printAttack(attacks[0]) + " 2. " + printAttack(attacks[1]) + "\n3. " + printAttack(attacks[2]) + " 4. " + printAttack(attacks[3]);
    }
    /**
     * Prints LVL and HP for a pokemon, used in the change method
     * @param pokemon the pokemon to print
     * @return String with pokemon data
     */
    private static String printPokemon(Pokemon pokemon) {
        if(pokemon != null) {
            return pokemon.getName() + " LVL " + pokemon.getLevel() + " HP " + pokemon.getHp();
        }
        return "---";
    }
    /**
     * Prints LVL and HP for all pokemons recieved in the array
     * @param pokemons the Pokemon array to be printed
     * @return String with all pokemons LVL and HP
     */
    public static String printPokemons(Pokemon[] pokemons) {
        return printPokemon(pokemons[0]) + "\t\t\t" + printPokemon(pokemons[1]) + "\n" + 
        printPokemon(pokemons[2]) + "\t\t" + printPokemon(pokemons[3]) + "\n" + 
        printPokemon(pokemons[4]) + "\t\t\t" + printPokemon(pokemons[5]);
    }
    /**
     * Used in the main class for checking if the pokemon recieved is dead
     * @param pokemon the pokemon to check
     * @return true if is dead, false if is not dead
     */
    public static boolean checkDead(Pokemon pokemon) {
        if(pokemon.getHp() <= 0){
            pokemon.setHp(0);
            return true;
        }
        return false;
    }
    /**
     * Used in the main class for checking if the position recieved is valid
     * @param pos the position to check
     * @return true if it is valid, false if it is not
     */
    public static boolean validPosition(int pos) {
        if (pos > 0 || pos < 7) {
            return true;
        }
        return false;
    }
    /**
     * Initializes the recieved Pokemon[] with default values to test the whole Class Structure
     * @param pokemons the Pokemon[] to initialize
     */
    public static void initialize(Pokemon[] pokemons){
        pokemons[0] = new Pikachu();
        pokemons[1] = new Charizard();
        pokemons[2] = new Blastoise();
        pokemons[3] = new Venusaur();
        pokemons[4] = new Houndoom();
        pokemons[5] = new Kerbe();
    }
    public static void initialize(Bag bag) {
        bag.getMedicines().add(new Potion());
        bag.getMedicines().add(new Superpotion());
        bag.getMedicines().add(new Hyperpotion());
        bag.getItems().add(new Repel());
        bag.getItems().add(new Superrepel());
        bag.getItems().add(new MaximumRepel());
        
    }
}