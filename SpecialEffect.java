/**
 * SpecialEffect v1.0
 * 
 */
public class SpecialEffect {
    /**
     * 
     * @param specialEffect
     * @return 0.25 of the speed of the Pokemon
     */
    public static double paralized(String specialEffect) {
        if (specialEffect.equals("Paralized")) {
            return 0.25; 
        }
        return 1;
    }
    /**
     * 
     * @param specialEffect
     * @return true if Pokemon has specialEffect Asleep, Freezed or Confused
     */
    public static boolean asleepFreezed(String specialEffect) {
        if (specialEffect.equals("Freezed")) {
            return true;
        }
        if (specialEffect.equals("Asleep")){
            return true;
        }
        if (specialEffect.equals("Confused")) {
            return true;
        }
        return false;
    }
    /**
     * 
     * @param specialEffect
     * @return 0.5 to the attack of the pokemon
     */
    public static double burned(String specialEffect) {
        if (specialEffect.equals("Burned")) {
            return 0.5;
        }
        return 1;
    }
    public static int turns = 0;
    /**
     * 
     * @param specialEffect
     * @return 1/16 case poisoned, 1/16 by turns toxic number
     */
    public static double poisonedToxic(String specialEffect) {
        turns++;
        if (specialEffect.equals("Toxic")) {
            return (1*turns)/16;  
        }
        if (specialEffect.equals("Poisoned")) {
            return 1/16;
        }
        return 0;
    }
    public static void doSpecialEffect(String specialEffect) {
        if (specialEffect != null) {
            asleepFreezed(specialEffect);
            burned(specialEffect);
            poisonedToxic(specialEffect);
            paralized(specialEffect);
        }
    }
}