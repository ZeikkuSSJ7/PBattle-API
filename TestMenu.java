
import java.util.Scanner;

import bag.Bag;
import bag.items.*;
import bag.medicines.*;
import main.Utilities;
import pokemon.Pokemon;
/**
 * TestMenu
 */
public abstract class TestMenu {
    public static void main(String[] args) {
        Bag b = new Bag();
        Pokemon[] pokemonInTeam = new Pokemon[6];
        Utilities.initialize(pokemonInTeam);
        Utilities.initialize(b);
        Commands.bag(b, pokemonInTeam);
    }
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("What do you want to work?");
            System.out.println("1.- Show items");
            System.out.println("2.- Show medicines");
            System.out.println("3.- Use medicine");
            switch (sc.nextLine()) {
                case "1":
                    b.listItems();
                    System.out.print("From which item do you want to see data? ");
                    b.listItemData(Integer.parseInt(sc.nextLine()) - 1);
                    break;
                case "2":
                    b.listMedicines();
                    System.out.print("From which medicine do you want to see data? ");
                    b.listMedicineData(Integer.parseInt(sc.nextLine()) - 1);
                    break;
                case "3":
                    b.listMedicines();
                    System.out.print("Which one do you want to use? ");
                    b.getMedicines().get(Integer.parseInt(sc.nextLine()) - 1).use(new Pokemon());
                    break;
                case "shit":
                    System.out.println("FUCK!");
                default:
                    System.out.println("Not a valid option!");
                    break;
            }
        }
    }*/
}