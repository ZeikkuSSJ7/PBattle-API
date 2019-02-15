/**
 * SludgeBomb
 */
public class SludgeBomb extends Attack {
    public static String name = "Sludge Bomb";
    public static int power = 95;
    public static String type = "Poison";
    public static int powerPoints = 15;
    public static String category = "Special";
    public SludgeBomb() {
        super(name, power, type, powerPoints, category);
    }
}