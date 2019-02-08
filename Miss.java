/**
 * Miss
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