package attacks;
/**
 * Hydropump
 */
public class HydroPump extends Attack{
    public static String name = "Hydro Pump";
    public static int power = 120;
    public static double precision = 85;
    public static String type = "Water";
    public static int powerPoints = 5;
    public static String category = "Special";
    public HydroPump() {
        super(name, power, precision, type, powerPoints, category);
    }
}