import java.util.Random;

/**
 * Attack
 */
public class Attack {
    private String name;
    private int power;
    private double precision;
    private int powerPoints;
    private String type;
    public Attack() {
        name = "Struggle";
        power = 50;
        type = null;
        precision = 0;
    }
    /** case it has null precision */
    public Attack(String name, int power, String type, int powerPoints) {
        this(name, powerPoints, type);
        this.power = power;
    }
    /**
     *  case it has null power
     * */ 
    public Attack(String name, String type,int powerPoints, double precision) {
        this(name, powerPoints, type);
        this.precision = precision;
    }
    /** case it has null power AND precision*/ 
    public Attack(String name, int powerPoints, String type) {
        this.name = name;
        this.powerPoints = powerPoints;
        this.type = type;
    }
    /** case it has all attributes */ 
    public Attack(String name, int power, double precision, int powerPoints, String type) {
        this(name, powerPoints, type);
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
    public static double fight(int pokemonLevel, double attack, double defense, int power, String type, String pokemonType1, String pokemonType2, String enemyPokemonType1, String enemyPokemonType2){
        Random ran = new Random();
        double efectivity = Efectivity.efectivity(type, enemyPokemonType1);
        if (pokemonType2 != null) {
            efectivity *= Efectivity.efectivity(type, enemyPokemonType2);
        }
        float stab = 1;
        if (type.equals(pokemonType1)) {
            stab = 1.5f;
        }
        if (pokemonType2 != null && stab != 1.5f) {
            if (type.equals(pokemonType2)) {
                stab = 1.5f;
            }
        }
        double bonus = efectivity*stab*0.01*(ran.nextInt(16) + 85);
        double damage = (((((0.2*pokemonLevel)+1)*attack*power)/(25*defense)) + 2)*bonus;
        return damage;
    }
    
}