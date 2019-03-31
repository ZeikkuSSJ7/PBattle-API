import main.SpecialEffect;
import main.Utilities;
import attacks.Attack;
import pokemon.Pokemon;

/**
 * Commands
 */
public class Commands {
    /**
     * Used for changing the pokemon if desired
     * @param pokemons your pokemons
     * @param pokemon your pokemon in battle
     * @param i position in your team of your pokemon in battle when changed
     * @return the new position of your pokemon
     */
    public static int pkmn(Pokemon[] pokemons, Pokemon pokemon, int i) {
        System.out.println("Which pokemon do you want to change?");
        System.out.println(Utilities.printPokemons(pokemons));
        try {
            int pos = Integer.parseInt(Main.sc.nextLine());
            if (!Utilities.checkDead(pokemons[pos - 1])) {
                Utilities.change(pokemon, pokemons[pos -1]);
                i = pos - 1;
            } else {
                System.out.println(pokemons[pos - 1].getName()+  " is dead!");
            }
        } catch (NumberFormatException e) {
            System.out.println("The sh*t. That is not a number.");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Not a valid pokemon!");
        }
        return i;
    }
    /**
     * Used in the main method for the command FIGHT
     * @param pokemons the pokemons of your team
     * @param enemyPokemons the pokemons of the enemy, to check if not all of them are dead
     * @param pokemon the pokemon in battle
     * @param pokemonEnemy the pokemon in battle of the enemy
     * @param i position of the pokemon in battle in your team
     * @param j position of the enemy pokemon in battle on the enemy team
     * @return j, in case it changes because pokemon enemy is defeated
     */
    public static int fight(Pokemon[] pokemons, Pokemon[] enemyPokemons, Pokemon pokemon, Pokemon pokemonEnemy, int i, int j) {
        System.out.println(Utilities.printAttacks(pokemons[i].getAttacks()));
        System.out.print("Select attack: ");
        try {
            int attackSelect = Integer.parseInt(Main.sc.nextLine());
            if (SpecialEffect.ableToFight(pokemon)){
                Attack.fight(pokemon, pokemonEnemy, attackSelect - 1);
                SpecialEffect.doSpecialEffect(pokemon, pokemonEnemy, pokemon.getAttacks()[attackSelect - 1]);
                enemyPokemons[j].setHp(pokemonEnemy.getHp());
                if (Utilities.checkDead(pokemonEnemy) && !Utilities.dead(enemyPokemons)) {
                    int pos = 0;
                    do {
                        try {
                            System.out.println(Utilities.printPokemons(enemyPokemons));
                            pos = Integer.parseInt(Main.sc.nextLine());
                            if (!Utilities.checkDead(enemyPokemons[pos - 1])) {
                                Utilities.change(pokemonEnemy, enemyPokemons[pos -1]);
                                j = pos - 1;
                            } else {
                                System.out.println(enemyPokemons[pos - 1].getName() +  " is dead!");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("The shit. That's not a number.");
                        } catch (ArrayIndexOutOfBoundsException e){
                            System.out.println("Not a valid pokemon!");
                        } catch (NullPointerException e){
                            System.out.println("The Pokemon does not exist!");
                        }
                    } while (Utilities.checkDead(enemyPokemons[pos - 1]) || !Utilities.validPosition(pos));
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("The f*ck. That's not a number.");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Not a valid attack!");
        } catch (NullPointerException e){
            System.out.println("The attack does not exist!");
        }
        return j;
    }
}