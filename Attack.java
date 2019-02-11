import java.util.Random;

/**
 * Attack v1.1
 * - Mostly all attributes for every attack in Pokemon, except for special effects like confused or lowering attack
 * - 4 constructors and 1 default constructor
 * - All getters and setter if needed
 */
public class Attack {
    private String name;
    private int power;
    private double precision;
    private int powerPoints;
    private String type;
    private String category;
    public Attack() {
        name = "Struggle";
        power = 50;
        type = null;
        precision = 0;
        category = "Status";
    }
    /** case it has null precision */
    public Attack(String name, int power, String type, int powerPoints, String category) {
        this(name, powerPoints, type, category);
        this.power = power;
    }
    /**
     *  case it has null power
     * */ 
    public Attack(String name, String type,int powerPoints, double precision, String category) {
        this(name, powerPoints, type, category);
        this.precision = precision;
    }
    /** case it has null power AND precision*/ 
    public Attack(String name, int powerPoints, String type, String category) {
        this.name = name;
        this.powerPoints = powerPoints;
        this.type = type;
        this.category = category;
    }
    /** case it has all attributes */ 
    public Attack(String name, int power, double precision, String type, int powerPoints, String category) {
        this(name, powerPoints, type, category);
        this.power = power;
        this.precision = precision;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPower() {
        return power;
    }
    public int getPowerPoints() {
        return powerPoints;
    }
    
    public double getPrecision() {
        return precision;
    }
    
    public String getType() {
        return type;
    }
    public String getCategory() {
        return category;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public void setPowerPoints(int powerPoints) {
        this.powerPoints = powerPoints;
    }
    public void setPrecision(double precision) {
        this.precision = precision;
    }
    public void setType(String type) {
        this.type = type;
    }
    /**
     * Method fight is used in the Main class
     * Checks for efectivity with all types available
     * Checks for stab too
     * Checks for the category of the attack, Special or Physical
     * Checks for critical hits and for missed attacks, also tells if the hit has been effective or not
     * @param pokemon the pokemon to fight
     * @param pokemon2 the pokemon that recieves the hit
     * @param i the position of the attack used
     */
    public static void fight(Pokemon pokemon, Pokemon pokemon2, int i){
        Random ran = new Random();
        double efectivity = Efectivity.efectivity(pokemon.getAttacks()[i].getType(), pokemon2.getType1());
        if (pokemon2.getType2() != null) {
            efectivity *= Efectivity.efectivity(pokemon.getAttacks()[i].getType(), pokemon2.getType2());
        }
        float stab = 1;
        if (pokemon.getAttacks()[i].getType().equals(pokemon.getType1())) {
            stab = 1.5f;
        }
        if (pokemon.getType2() != null && stab != 1.5f) {
            if (pokemon.getAttacks()[i].getType().equals(pokemon.getType2())) {
                stab = 1.5f;
            }
        }
        double bonus = efectivity*stab*0.01*(ran.nextInt(16) + 85);
        double damage = 0;
        if (pokemon.getAttacks()[i].getCategory().equals("Physical")) {
            damage = (((((0.2*pokemon.getLevel())+1)*pokemon.getAttack()*pokemon.getAttacks()[i].getPower())/(25*pokemon2.getDefense())) + 2)*bonus;
        }
        if (pokemon.getAttacks()[i].getCategory().equals("Special")) {
            damage = (((((0.2*pokemon.getLevel())+1)*pokemon.getSpecialAttack()*pokemon.getAttacks()[i].getPower())/(25*pokemon2.getSpecialDefense())) + 2)*bonus;
        }
        boolean critical = false;
        if (ran.nextInt(100) + 1 < 5) {
            critical = true;
            damage *= 2;
        }
        
        if (Miss.miss(pokemon.getAttacks()[i].getPrecision()) || pokemon.getAttacks()[i].getPrecision() == 0) {
            System.out.println(pokemon.getName() + " used " + pokemon.getAttacks()[i].getName() + "!");
            pokemon2.setHp(pokemon2.getHp() - (int)damage);
            if (critical) {
                System.out.println("A critical hit!");
            }
            if (efectivity == 2 || efectivity == 4) {
                System.out.println("It's super efective!");
            }
            if (efectivity == 0.5 || efectivity == 0.25) {
                System.out.println("It's not very efective...");
            }
            System.out.println(pokemon2.getName() + " lost " + (int)damage + " HP!");
        } else{
            System.out.println(pokemon.getName() + " missed the attack!");
        }
        if (pokemon2.getHp() <= 0) {
            System.out.println(pokemon2.getName() + " debilitated!");
        }
    }    
}