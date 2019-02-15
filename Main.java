import attacks.*;
import main.*;
import java.util.Scanner;
/**
 * Main
 */
public class Main {
    public static int i = 0;
    public static int j = 0;
    public static Scanner sc;
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
            int attackSelect = Integer.parseInt(sc.nextLine());
            if (SpecialEffect.ableToFight(pokemon)){
                Attack.fight(pokemon, pokemonEnemy, attackSelect - 1);
                SpecialEffect.doSpecialEffect(pokemon, pokemonEnemy, pokemon.getAttacks()[attackSelect - 1]);
            }
            enemyPokemons[j].setHp(pokemonEnemy.getHp());
            Utilities.checkDead(enemyPokemons[j]);
            if (Utilities.checkDead(pokemonEnemy) && !Utilities.dead(enemyPokemons)) {
                int pos = 0;
                do {
                    try {
                        System.out.println(Utilities.printPokemons(enemyPokemons));
                        pos = Integer.parseInt(sc.nextLine());
                        if (!Utilities.checkDead(enemyPokemons[pos - 1])) {
                            Utilities.change(pokemonEnemy, enemyPokemons[pos -1]);
                            j = pos - 1;
                        } else {
                            System.out.println(enemyPokemons[pos - 1].getName() +  " is dead!");
                        }
                    } catch (Exception e) {
                        System.out.println("Not valid Pokemon!");
                    }
                } while (Utilities.checkDead(enemyPokemons[pos - 1]) || !Utilities.validPosition(pos));
            }
        } catch (Exception e) {
            System.out.println("The f*ck");
        }
        return j;
    }
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
            int pos = Integer.parseInt(sc.nextLine());
            if (!Utilities.checkDead(pokemons[pos - 1])) {
                Utilities.change(pokemon, pokemons[pos -1]);
                i = pos - 1;
            } else {
                System.out.println(pokemons[pos - 1] .getName()+  " is dead!");
            }
        } catch (Exception e) {
            System.out.println("The sh*t");
        }
        return i;
    }
    /**
     * Initializes the recieved Pokemon[] with default values to test the whole Class Structure
     * @param pokemons the Pokemon[] to initialize
     */
    public static void initialize(Pokemon[] pokemons){
        Attack[] aux = {new Thunderbolt(), new ElectricTackle(), new Poyo(), null};
        Attack[] aux2 = {new Surf(), new Headbutt(), new HydroPump(), new IceBeam()};
        Attack[] aux3 = {new Flamethrower(), new Fly(), new RockSlide(), new FlameBurst()};
        Attack[] aux4 = {new Gigadrain(), new SludgeBomb(), new EnergyBall(), new DoubleEdge()};
        Attack[] aux5 = {new Flamethrower(), new DarkPulse(), new FlameBurst(), new DragonPulse()};
        Attack[] aux6 = {new Poyo(), new Earrape(), new Haaai(), new PomazoDeF()};
        pokemons[0] = new Pokemon("Pikachu", 100, "Electric", "Static Charge", 250, 190, 160, 195, 140, 210, aux);
        pokemons[1] = new Pokemon("Blastoise", 100, "Water",  "Torrent", 250, 140, 210, 180, 200, 150, aux2);
        pokemons[2] = new Pokemon("Charizard", 100, "Fire", "Flying", "Fire Sea", 240, 200, 140, 210, 150, 190, aux3);
        pokemons[3] = new Pokemon("Venusaur", 100, "Grass", "Posion",  "Overgrow", 230, 140, 190, 210, 200, 160, aux4);
        pokemons[4] = new Pokemon("Houndoom", 100, "Fire", "Dark", 220, 190, 180, 240, 170, 220, aux5);
        pokemons[5] = new Pokemon("Kerbe", 100, "Kirb", "Pomazo de F", 32234, 200, 300, 400, 350, 150, aux6);
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Pokemon[] pokemonInTeam = new Pokemon[6];
        Pokemon[] pokemonEnemyInTeam = new Pokemon[6];
        initialize(pokemonInTeam);
        initialize(pokemonEnemyInTeam);
        Attack[] aux6 = {new Poyo(), new Earrape(), new Earrape(), new PomazoDeF()};
        pokemonEnemyInTeam[5] = new Pokemon("Kerbe", 100, "Kirb", "Pomazo de F", 3223, 200, 300, 400, 350, 150, aux6);
        Pokemon pokemonInBattle = new Pokemon();
        Pokemon pokemonEnemyInBattle = new Pokemon();
        Utilities.go(pokemonInBattle, pokemonInTeam[0]);
        Utilities.go(pokemonEnemyInBattle, pokemonEnemyInTeam[0]);
        do {
            System.out.println("Player 1, turn's yours!");
            System.out.println("\t\t\t| FIGHT\tBAG |\nWhat will " + pokemonInBattle.getName() + 
            " do?\t| PKMN\tRUN |");
            String select = sc.nextLine();
            switch (select) {
                case "1":
                    j = fight(pokemonInTeam, pokemonEnemyInTeam, pokemonInBattle, pokemonEnemyInBattle, i, j);
                    break;
                case "2":
                    i = pkmn(pokemonInTeam, pokemonInBattle, i);
                    break;
                default:
                	break;
            }
            pokemonEnemyInTeam[j].setHp(pokemonEnemyInBattle.getHp());
            if (Utilities.dead(pokemonEnemyInTeam)) {
                break;
            }
            System.out.println("Player 2, turn's yours!");
            System.out.println("\t\t\t| FIGHT\tBAG |\nWhat will " + pokemonEnemyInBattle.getName() + 
            " do?\t| PKMN\tRUN |");
            select = sc.nextLine();
            switch (select) {
                case "1":
                    i = fight(pokemonEnemyInTeam, pokemonInTeam, pokemonEnemyInBattle, pokemonInBattle, j, i);
                    break;
                case "2":
                    j = pkmn(pokemonEnemyInTeam, pokemonEnemyInBattle, j);
                    break;
                default:
                    break;
            }
            pokemonInTeam[i].setHp(pokemonEnemyInBattle.getHp());
        } while (!Utilities.dead(pokemonEnemyInTeam) && !Utilities.dead(pokemonInTeam));
    }
}
