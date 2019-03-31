package attacks;
/**
 * RockSlide
 */
public class RockSlide extends Attack{
    public static String name = "Rock Slide";
    public static int power = 100;
    public static int precision = 80;
    public static String type = "Rock";
    public static int powerPoints = 10;
    public static String category = "Physical";
    public RockSlide() {
        super(name, power, type, powerPoints, category);
    }
}