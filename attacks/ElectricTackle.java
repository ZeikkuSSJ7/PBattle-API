package attacks;
import main.Attack;
/**
 * ElectricTackle
 */
public class ElectricTackle extends Attack{
    public static String name = "Electric Tackle";
    public static int power = 120;
    public static String type = "Electric";
    public static int powerPoints = 10;
    public static String category = "Physical";
    public ElectricTackle() {
        super(name, power, type, powerPoints, category);
    }
}