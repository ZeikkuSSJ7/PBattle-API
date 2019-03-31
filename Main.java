import pokemon.Pokemon;
import main.Utilities;
import java.util.Scanner;
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
        Pokemon[] pokemonEnemyInTeam = new Pokemon[6];
        Utilities.initialize(pokemonInTeam);
        Utilities.initialize(pokemonEnemyInTeam);
        Pokemon pokemonInBattle = new Pokemon();
        Pokemon pokemonEnemyInBattle = new Pokemon();
        Utilities.go(pokemonInBattle, pokemonInTeam[0]);
        Utilities.go(pokemonEnemyInBattle, pokemonEnemyInTeam[0]);
        do {
            System.out.println("Player 1, turn's yours!");
            System.out.println("\t\t\t| FIGHT\tBAG |\nWhat will " + pokemonInBattle.getName() + 
            " do?\t| PKMN\tRUN |");
            valid = false;
            do {
                switch (sc.nextLine()) {
                    case "1":
                        j = Commands.fight(pokemonInTeam, pokemonEnemyInTeam, pokemonInBattle, pokemonEnemyInBattle, i, j);
                        valid = true;
                        break;
                    case "2":
                        i = Commands.pkmn(pokemonInTeam, pokemonInBattle, i);
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
            System.out.println("\t\t\t| FIGHT\tBAG |\nWhat will " + pokemonEnemyInBattle.getName() + 
            " do?\t| PKMN\tRUN |");
            do {
                switch (sc.nextLine()) {
                    case "1":
                        i = Commands.fight(pokemonEnemyInTeam, pokemonInTeam, pokemonEnemyInBattle, pokemonInBattle, j, i);
                        valid = true;
                        break;
                    case "2":
                        j = Commands.pkmn(pokemonEnemyInTeam, pokemonEnemyInBattle, j);
                        valid = true;
                        break;
                }
            } while (!valid);
            pokemonInTeam[i].setHp(pokemonEnemyInBattle.getHp());
        } while (!Utilities.dead(pokemonEnemyInTeam) && true && !Utilities.dead(pokemonInTeam));
    }
}
