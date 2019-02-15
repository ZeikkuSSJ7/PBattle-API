package attacks;
import main.Attack;
/**
 * Poyo
 */
public class Poyo extends Attack {
    public static String name = "Poyo";
    public static int power = 2000;
    public static String type = "Kirb";
    public static int powerPoints = 20;
    public static String category = "Special";
    public Poyo() {
        super(name, power, type, powerPoints, category);
    }
}