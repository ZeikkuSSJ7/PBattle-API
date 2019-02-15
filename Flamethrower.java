/**
 * Flamethrower
 */
public class Flamethrower extends Attack{
    public static String name = "Flamethrower";
    public static int power = 95;
    public static String type = "Fire";
    public static int powerPoints = 15;
    public static String category = "Special";
    public Flamethrower() {
        super(name, power, type, powerPoints, category);
    }
}