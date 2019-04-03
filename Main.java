import pokemon.Pokemon;
import main.Utilities;
import java.util.Scanner;

import bag.Bag;
/**
 * Main
 */
public abstract class Main {
    public static int i = 0;
    public static int j = 0;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean valid = false;
        Pokemon[] pokemonInTeam = new Pokemon[6];
        Bag bag = new Bag();
        Pokemon[] pokemonEnemyInTeam = new Pokemon[6];
        Bag enemyBag = new Bag();
        Utilities.initialize(pokemonInTeam);
        Utilities.initialize(bag);
        Utilities.initialize(pokemonEnemyInTeam);
        Utilities.initialize(enemyBag);
        Pokemon pokemonInBattle = new Pokemon();
        Pokemon pokemonEnemyInBattle = new Pokemon();
        Utilities.go(pokemonInBattle, pokemonInTeam[0]);
        Utilities.go(pokemonEnemyInBattle, pokemonEnemyInTeam[0]);
        do {
            System.out.println("Player 1, turn's yours!");
            do {
            System.out.println("\t\t\t| FIGHT\tBAG |\nWhat will " + pokemonInBattle.getName() + 
            " do?\t| PKMN\tRUN |");
            valid = false;
                switch (sc.nextLine()) {
                    case "1":
                        int o = Commands.fight(pokemonInTeam, pokemonEnemyInTeam, pokemonInBattle, pokemonEnemyInBattle, i, j);
                        if (o != -1){
                            j = o;
                            valid = true;
                        }
                        break;
                    case "2":
                        int e = Commands.pkmn(pokemonInTeam, pokemonInBattle, i);
                        if (e != i){
                            i = e;
                            valid = true;
                        }
                        break;   
                    case "3":
                        if(Commands.bag(bag, pokemonInTeam, pokemonInBattle))
                            valid = true;
                        break;   
                }
            } while (!valid);
            valid = false;
            pokemonEnemyInTeam[j].setHp(pokemonEnemyInBattle.getHp());
            if (Utilities.dead(pokemonEnemyInTeam)) {
                break;
            }
            System.out.println("Player 2, turn's yours!");
            do {
            System.out.println("\t\t\t| FIGHT\tBAG |\nWhat will " + pokemonEnemyInBattle.getName() + 
            " do?\t| PKMN\tRUN |");
                switch (sc.nextLine()) {
                    case "1":
                        int o = Commands.fight(pokemonEnemyInTeam, pokemonInTeam, pokemonEnemyInBattle, pokemonInBattle, j, i);
                        if (o != -1) {
                            i = o;
                            valid = true;
                        }
                        break;
                    case "2":
                        int e = Commands.pkmn(pokemonEnemyInTeam, pokemonEnemyInBattle, j);
                        if (e != j) {
                            j = e;
                            valid = true;
                        }
                        break;
                    case "3":
                        if (Commands.bag(enemyBag, pokemonEnemyInTeam, pokemonEnemyInBattle))
                            valid = true;
                        break; 
                }
            } while (!valid);
            pokemonInTeam[i].setHp(pokemonEnemyInBattle.getHp());
        } while (!Utilities.dead(pokemonEnemyInTeam) && !Utilities.dead(pokemonInTeam));
    }
}
