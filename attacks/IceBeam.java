package attacks;
import main.Attack;
/**
 * IceBeam
 */
public class IceBeam extends Attack{
    public static String name = "Ice Beam";
    public static int power = 95;
    public static String type = "Ice";
    public static int powerPoints = 15;
    public static String category = "Special";
    public IceBeam() {
        super(name, power, type, powerPoints, category);
    }
}