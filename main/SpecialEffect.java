package main;
import attacks.*;
/**
 * SpecialEffect v1.0
 * 
 */
public class SpecialEffect {
    public static void paralized(Pokemon pokemon) {
        if (RandomClass.ran.nextInt(100) + 1 < 20) {
            pokemon.setSpecialEffect("Paralized");
            System.out.println(pokemon.getName() + " paralized!");
            pokemon.setSpeed(pokemon.getSpeed() * 0.25);
        }
    }
    public static double growDefense(Pokemon pokemon) {
        if (RandomClass.ran.nextInt(100) + 1 < 20){
            pokemon.setDefense(pokemon.getDefense() * 1.5);
            System.out.println(pokemon.getName() + "'s defense growed");
        }
        return 1;
    }
    public static void burned(Pokemon pokemon) {
        if (RandomClass.ran.nextInt(100) + 1 < 20) {
            System.out.println("Pokemon Burne");
            pokemon.setSpecialEffect("Burned");
        }
    }
    public static void recoil(Pokemon pokemon) {
        pokemon.setHp(pokemon.getHp() - (int)(pokemon.getHp() * 0.125));
        System.out.println(pokemon.getName() + " lost HP due to recoil!");
    }
    public static void frozen(Pokemon pokemon){
        if (RandomClass.ran.nextInt(100) + 1 < 20 ) {
            pokemon.setSpecialEffect("Frozen");;
        }
    }
    public static void doSpecialEffect(Pokemon battle, Pokemon enemy, Attack attack) {
        if (enemy.getSpecialEffect() == null) {
            if (attack instanceof Thunderbolt) {
                paralized(enemy);
            }
            if (attack instanceof ElectricTackle){
                paralized(enemy);
            }
            if (attack instanceof Flamethrower) {
                burned(enemy);
            }
            if (attack instanceof IceBeam) {
                frozen(enemy);
            }
        }
        if (attack instanceof DoubleEdge) {
            recoil(battle);
        }
        if (attack instanceof Headbutt) {
            growDefense(battle);
        }
    }
    public static boolean ableToFight(Pokemon pokemon) {
        if (pokemon.getSpecialEffect() != null) {
            if (pokemon.getSpecialEffect().equals("Burned")) {
                pokemon.setHp(pokemon.getHp() - (int)(pokemon.getHp() * 0.08));
                System.out.println(pokemon.getName() + " is burned!");
            }
            if (pokemon.getSpecialEffect().equals("Frozen")) {
                if (RandomClass.ran.nextBoolean() == false) {
                    System.out.println(pokemon.getName() + " is not frozen anymore!");
                    pokemon.setSpecialEffect(null);
                    return true;
                }
                System.out.println(pokemon.getName() + " is frozen solid!");
                return false;
            }
            if (pokemon.getSpecialEffect().equals("Paralized")) {
                if (RandomClass.ran.nextInt(100) + 1 < 25) {
                    System.out.println(pokemon.getName() + " is paralized!");
                    return false;
                }
            }
            if (pokemon.getSpecialEffect().equals("Poisoned")) {
                pokemon.setHp(pokemon.getHp() - (int)(pokemon.getHp() * 0.08));
                System.out.println(pokemon.getName() + " is posioned!");
            }
        }
        return true;
    }
}