/**
 * DragonPulse
 */
public class DragonPulse extends Attack{
    public static String name = "Dragon Pulse";
    public static int power = 95;
    public static String type = "Dragon";
    public static int powerPoints = 15;
    public static String category = "Special";
    public DragonPulse() {
        super(name, power, type, powerPoints, category);
    }
}