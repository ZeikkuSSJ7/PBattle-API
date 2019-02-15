/**
 * Headbutt
 */
public class Headbutt extends Attack{
    public static String name = "Headbutt";
    public static int power = 90;
    public static String type = "Normal";
    public static int powerPoints = 15;
    public static String category = "Physical";
    public Headbutt() {
        super(name, power, type, powerPoints, category);
    }
}