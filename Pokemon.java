/**
 * Pokemon
 */
public class Pokemon {
    private String name;
    private int hp;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;
    public Pokemon(String name, int hp, int attack, int defense, int specialAttack, int specialDefense, int speed, int numeroDeattacks) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
    }
}