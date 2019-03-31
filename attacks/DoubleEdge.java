package attacks;
/**
 * DoubleEdge
 */
public class DoubleEdge extends Attack{
    public static String name = "Double Edge";
    public static int power = 120;
    public static String type = "Normal";
    public static int powerPoints = 15;
    public static String category = "Physical";
    public DoubleEdge() {
        super(name, power, type, powerPoints, category);
    }
}