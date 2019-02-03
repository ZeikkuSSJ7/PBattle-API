/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Flee flee = new Flee();
        Attack attack = new Attack();
        System.out.println(attack.getName());
        System.out.println(attack.getPower());
        System.out.println(attack.getPowerPoints());
        System.out.println(attack.getPrecision());
        System.out.println(attack.getType());
    }
}