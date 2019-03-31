package attacks;
/**
 * FlameBurst
 */
public class FlameBurst extends Attack{
    public static String name = "Flame Burst";
    public static int power = 120;
    public static double precision = 80;
    public static String type = "Fire";
    public static int powerPoints = 5;
    public static String category = "Special";
    public FlameBurst() {
        super(name, power, precision, type, powerPoints, category);
    }
}