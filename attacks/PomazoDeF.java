package attacks;

/**
 * PomazoDeF
 */
public class PomazoDeF extends Attack {

    public static String name = "Pomazo de F";
    public static int power = 5000;
    public static String type = "Kirb";
    public static int powerPoints = 20;
    public static String category = "Physical";
    public PomazoDeF() {
        super(name, power, type, powerPoints, category);
    }
}