
/**
 * SpecialEffect v1.0
 * 
 */
public class SpecialEffect {
    public static String paralized() {
        if (Main.ran.nextInt(100) + 1 < 30) {
            return "Paralized";
        }
        return null;
    }
    public static double growDefense() {
        if (Main.ran.nextInt(100) + 1 < 20){
            return 1.5;
        }
        return 1;
    }
    public static String burned() {
        if (Main.ran.nextInt(100) + 1 < 20) {
            return "Burned";
        }
        return null;
    }
    public static double recoil(Pokemon pokemon) {
        double recoil = pokemon.getHp() * 0.125;
        return recoil;
    }
    public static void doSpecialEffect(Pokemon battle, Pokemon enemy, Attack attack) {
        if (attack instanceof Thunderbolt) {
            enemy.setSpecialEffect(paralized());
        }
        if (attack instanceof ElectricTackle){
            enemy.setSpecialEffect(paralized());
        }
        if (attack instanceof Headbutt) {
            battle.setDefense(growDefense());
        }
        if (attack instanceof Flamethrower) {
            enemy.setSpecialEffect(burned());
        }
        if (attack instanceof DoubleEdge) {
            battle.setHp((int)recoil(battle));
        }
    }
}