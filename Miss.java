/**
 * Miss V1.0 FINAL
 * - Probably the last time I will change this class
 * - @return true or false depending if the pokemon misses or not
 * - @param precision recieves the precision of the attack when called in the Attack class
 */
import java.util.*;
public class Miss {
    private static int precision = 1;
    private static int evasion = 1;
    public static boolean miss(double precision) {
        Random ran = new Random();
        if(precision*Miss.precision/Miss.evasion > ran.nextInt(100)){
            return true;
        }
        return false;
    }
}