package main;

import pokemon.Pokemon;
import attacks.*;
/**
 * SpecialEffect v1.0
 * 
 */
public abstract class SpecialEffect {
    /**
     * Uses a 30 in 100 random chance to check if the pokemon 
     * will be paralized the moment it recieves an attack that 
     * has this special effect
     * @param pokemon the pokemon to paralize
     */
    private static void paralized(Pokemon pokemon) {
        if (RandomClass.ran.nextInt(100) + 1 < 20) {
            pokemon.setSpecialEffect("Paralized");
            System.out.println(pokemon.getName() + " paralized!");
            pokemon.setSpeed(pokemon.getSpeed() * 0.25);
        }
    }
    /**
     * Uses a 20 in 100 random chance to check if the pokemon 
     * will grow its defense the moment it attacks
     * @param pokemon the pokemon to grow defense
     */
    private static double growDefense(Pokemon pokemon) {
        if (RandomClass.ran.nextInt(100) + 1 < 20){
            pokemon.setDefense(pokemon.getDefense() * 1.5);
            System.out.println(pokemon.getName() + "'s defense growed");
        }
        return 1;
    }
    /**
     * Uses a 20 in 100 random chance to check if the pokemon 
     * will be burned the moment it recieves an attack that 
     * has this special effect
     * @param pokemon the pokemon to burn
     */
    private static void burned(Pokemon pokemon) {
        if (RandomClass.ran.nextInt(100) + 1 < 20) {
            System.out.println(pokemon.getName() + " burned!");
            pokemon.setSpecialEffect("Burned");
        }
    }
    /**
     * Makes the pokemon take a little bit of damage by attacking 
     * @param pokemon the pokemon to recieve the recoil
     */
    private static void recoil(Pokemon pokemon) {
        pokemon.setHp(pokemon.getHp() - (int)(pokemon.getHp() * 0.125));
        System.out.println(pokemon.getName() + " lost HP due to recoil!");
    }
    /**
     * Uses a 20 in 100 random chance to check if the pokemon 
     * will be frozen the moment it recieves an attack that 
     * has this special effect
     * @param pokemon the pokemon to freeze
     */
    private static void frozen(Pokemon pokemon){
        if (RandomClass.ran.nextInt(100) + 1 < 20 ) {
            pokemon.setSpecialEffect("Frozen");;
        }
    }
    /**
     * Uses a 20 in 100 random chance to check if the pokemon will 
     * lower defense
     * @param pokemon the pokemon to lower defense
     */
    private static void lowerSpecialDefense(Pokemon pokemon) {
        if (RandomClass.ran.nextInt(100) + 1 < 30) {
            pokemon.setSpecialDefense(pokemon.getSpecialDefense() * 0.75);
            System.out.println(pokemon.getName() + "'s special defense was lowered!");
        }
    }
    /**
     * Used to check every kind of attack programmed for its special effect
     * @param battle the pokemon that uses the attack
     * @param enemy the pokemon that recieves the attack
     * @param attack the attack used
     */
    public static void doSpecialEffect(Pokemon battle, Pokemon enemy, Attack attack) {
        if (enemy.getSpecialEffect() == null) {
            if (attack instanceof Thunderbolt) {
                paralized(enemy);
            }
            if (attack instanceof ElectricTackle) {
                paralized(enemy);
            }
            if (attack instanceof Flamethrower) {
                burned(enemy);
            }
            if (attack instanceof IceBeam) {
                frozen(enemy);
            }
            if (attack instanceof FlameBurst) {
                burned(enemy);
            }
        }
        if (attack instanceof DoubleEdge) {
            recoil(battle);
        }
        if (attack instanceof Headbutt) {
            growDefense(battle);
        }
        if (attack instanceof DarkPulse) {
            lowerSpecialDefense(enemy);
        }
    }
    /**
     * Used for checking if the pokemon is able to fight when it has a special 
     * effect set
     * @param pokemon the pokemon to check
     * @return true if it can fight, false if not
     */
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