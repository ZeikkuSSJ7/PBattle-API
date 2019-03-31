package attacks;
/**
 * EnergyBall
 */
public class EnergyBall extends Attack{
    public static String name = "Energy Ball";
    public static int power = 90;
    public static String type = "Grass";
    public static int powerPoints = 10;
    public static String category = "Special";
    public EnergyBall() {
        super(name, power, type, powerPoints, category);
    }
}