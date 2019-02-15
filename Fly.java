/**
 * Fly
 */
public class Fly extends Attack{
    public static String name = "Fly";
    public static int power = 90;
    public static double precision = 90;
    public static String type = "Flying";
    public static int powerPoints = 15;
    public static String category = "Physical";
    public Fly() {
        super(name, power, precision, type, powerPoints, category);
    }
}