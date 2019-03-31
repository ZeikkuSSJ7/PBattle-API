package attacks;
/**
 * Thunderbolt
 */
public class Thunderbolt extends Attack{
    public static String name = "Thunderbolt";
    public static int power = 90;
    public static String type = "Electric";
    public static int powerPoints = 15;
    public static String category = "Special";
    public Thunderbolt() {
        super(name, power, type, powerPoints, category);
    }
}