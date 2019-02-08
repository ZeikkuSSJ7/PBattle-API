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
    private double attack;
    private double defense;
    private double specialAttack;
    private double specialDefense;
    private double speed;
    private Attack[] attacks;
    private String heldItem;
    private String specialEffect;
    // case it has no second type AND item
    public Pokemon(String name, int level, String type1, String ability, int hp, double attack, double defense, double specialAttack, double specialDefense, double speed, int attackNumber) {
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
        attacks[0] = new Attack("Thunderbolt", 95, "Electric", 15, "Special");
        attacks[1] = new Attack("Electric Tackle", 120, "Electric", 10, "Physic");
        attacks[2] = new Attack("Poyo", 2000, "Kirb", 20, "Special");
    }
    // case it has all atributes
    public Pokemon(String name, int level, String type1, String type2, String ability, int hp, double attack, double defense, double specialAttack, double specialDefense, double speed, String heldItem, int attackNumber ) {
        this(name, level, type1, ability, hp, attack, defense, specialAttack, specialDefense, speed, attackNumber);
        this.type2 = type2;
        this.heldItem = heldItem;
    }
    // case it has no second type but held item
    public Pokemon(String name, int level, String type1, String ability, int hp, double attack, double defense, double specialAttack, double specialDefense, double speed, String heldItem, int attackNumber) {
        this(name, level, type1, ability, hp, attack, defense, specialAttack, specialDefense, speed, attackNumber);
        this.heldItem = heldItem;
    }
    // case it has second type but no held item
    public Pokemon(String name, int level, String type1, String type2, String ability, int hp, double attack, double defense, double specialAttack, double specialDefense, double speed, int attackNumber) {
        this(name, level, type1, ability, hp, attack, defense, specialAttack, specialDefense, speed, attackNumber);
        this.type2 = type2;
    }
    // one type and specialEffect
    public Pokemon(String name, int level, String type1, String ability, int hp, double attack, double defense, double specialAttack, double specialDefense, double speed, int attackNumber, String specialEffect) {
        this(name, level, type1, ability, hp, attack, defense, specialAttack, specialDefense, speed, attackNumber);
        this.specialEffect = specialEffect;
    }
    // second type and special effect
    public Pokemon(String name, int level, String type1, String type2, String ability, int hp, double attack, double defense, double specialAttack, double specialDefense, double speed, int attackNumber, String specialEffect) {
        this(name, level, type1, ability, hp, attack, defense, specialAttack, specialDefense, speed, attackNumber);
        this.type2 = type2;
        this.specialEffect = specialEffect;
    }
    // held item and special effect
    public Pokemon(String name, int level, String type1, String ability, int hp, double attack, double defense, double specialAttack, double specialDefense, double speed, String heldItem, int attackNumber, String specialEffect) {
        this(name, level, type1, ability, hp, attack, defense, specialAttack, specialDefense, speed, attackNumber);
        this.heldItem = heldItem;
        this.specialEffect = specialEffect;
    }
    // second type, special effect, no held item
    public Pokemon(String name, int level, String type1, String type2, String ability, int hp, double attack, double defense, double specialAttack, double specialDefense, double speed, int attackNumber, String heldItem, String specialEffect) {
        this(name, level, type1, ability, hp, attack, defense, specialAttack, specialDefense, speed, attackNumber);
        this.specialEffect = specialEffect;
    }
    // default case, a missigno is created
    public Pokemon() {
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
        Attack struggle = new Attack();
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
    public double getAttack() {
        return attack;
    }
    public double getDefense() {
        return defense;
    }
    public String getHeldItem() {
        return heldItem;
    }
    public int getHp() {
        return hp;
    }
    public double getSpecialAttack() {
        return specialAttack;
    }
    public double getSpecialDefense() {
        return specialDefense;
    }
    public double getSpeed() {
        return speed;
    }
    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }
    public void setAbility(String ability) {
        this.ability = ability;
    }
    public void setAttack(double attack) {
        this.attack = attack;
    }
    public void setAttacks(Attack[] attacks) {
        this.attacks = attacks;
    }
    public void setDefense(double defense) {
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
    public void setSpecialAttack(double specialAttack) {
        this.specialAttack = specialAttack;
    }
    public void setSpecialDefense(double specialDefense) {
        this.specialDefense = specialDefense;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public void setType1(String type1) {
        this.type1 = type1;
    }
    public void setType2(String type2) {
        this.type2 = type2;
    }
    /**
     * @param specialEffect the specialEffect to set
     */
    public void setSpecialEffect(String specialEffect) {
        this.specialEffect = specialEffect;
    }
    /**
     * @return the specialEffect
     */
    public String getSpecialEffect() {
        return specialEffect;
    }
}