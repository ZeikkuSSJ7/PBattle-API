/**
 * Thunderbolt
 */
import java.util.*;
public class Thunderbolt {
    public static String name = "Thunderbolt";
    public static int power = 90;
    public static String type = "Electric";
    public static int powerPoints = 15;
    public static String specialEffect() {
        Random ran = new Random();
        if (ran.nextInt(35) + 1 < 30) {
            return "Paralized";
        }
        return null;
    }
}