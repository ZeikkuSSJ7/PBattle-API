/**
 * Pokemon
 */
public class Pokemon {
    private String name;
    private int level;
    private String type1;
    private String type2;
    private String ability;
    private int hp;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;
    private Attack[] attacks;
    private String heldItem;
    // case it has all atributes
    public Pokemon(String name, int level, String type1, String type2, String ability, int hp, int attack, int defense, int specialAttack, int specialDefense, int speed, int attackNumber, String heldItem) {
        this(name, level, type1, ability, hp, attack, defense, specialAttack, specialDefense, speed, attackNumber);
        this.type2 = type2;
        this.heldItem = heldItem;
    }
    // case it has no second type but held item
    public Pokemon(String name, int level, String type1, String ability, int hp, int attack, int defense, int specialAttack, int specialDefense, int speed, int attackNumber, String heldItem) {
        this(name, level, type1, ability, hp, attack, defense, specialAttack, specialDefense, speed, attackNumber);
        this.heldItem = heldItem;
    }
    // case it has second type but no held item
    public Pokemon(String name, int level, String type1, String type2, String ability, int hp, int attack, int defense, int specialAttack, int specialDefense, int speed, int attackNumber) {
        this(name, level, type1, type2, ability, hp, attack, defense, specialAttack, specialDefense, speed, attackNumber, ability);
        this.type2 = type2;
    }
    // case it has no second type AND item
    public Pokemon(String name, int level, String type1, String ability, int hp, int attack, int defense, int specialAttack, int specialDefense, int speed, int attackNumber) {
        super();
        this.name = name;
        this.level = level;
        this.type1 = type1;
        this.ability = ability;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
        this.attacks = new Attack[attackNumber];
        attacks[0] = new Attack("Thunderbolt", 95, "Electric", 15);
        attacks[1] = new Attack("Electric Tackle", 120, "Electric", 10);
        attacks[2] = new Attack("Poyo", 2000, "Kirb", 20);
    }
    // default case, a missigno is created
    public Pokemon() {
        super();
        name = "MissingNo.";
        type1 = "Bird";
        type2 = "Normal";
        ability = "???";
        hp = 999;
        attack = 420;
        defense = 0;
        specialAttack = 120;
        specialDefense = 0;
        speed = 999;
        Attack struggle = new Attack("Struggle", 50, "Normal", 0);
    }
    public Attack[] getAttacks() {
        return attacks;
    }
    public String getName() {
        return name;
    }
    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }
    public String getType1() {
        return type1;
    }
    public String getType2() {
        return type2;
    }
    public String getAbility() {
        return ability;
    }
    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }
    public String getHeldItem() {
        return heldItem;
    }
    public int getHp() {
        return hp;
    }
    public int getSpecialAttack() {
        return specialAttack;
    }
    public int getSpecialDefense() {
        return specialDefense;
    }
    public int getSpeed() {
        return speed;
    }
    public void setAbility(String ability) {
        this.ability = ability;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public void setAttacks(Attack[] attacks) {
        this.attacks = attacks;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    public void setHeldItem(String heldItem) {
        this.heldItem = heldItem;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSpecialAttack(int specialAttack) {
        this.specialAttack = specialAttack;
    }
    public void setSpecialDefense(int specialDefense) {
        this.specialDefense = specialDefense;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setType1(String type1) {
        this.type1 = type1;
    }
    public void setType2(String type2) {
        this.type2 = type2;
    }
}