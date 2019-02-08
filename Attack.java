import java.util.Random;

/**
 * Attack v1.1
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
    public Attack(String name, int power, double precision, int powerPoints, String type, String category) {
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
    /**
     * @return the category
     */
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
    public static void fight(Pokemon pokemon, Pokemon pokemon2){
        Random ran = new Random();
        double efectivity = Efectivity.efectivity(pokemon.getAttacks()[0].getType(), pokemon2.getType1());
        if (pokemon2.getType2() != null) {
            efectivity *= Efectivity.efectivity(pokemon.getAttacks()[0].getType(), pokemon2.getType2());
        }
        float stab = 1;
        if (pokemon.getAttacks()[0].getType().equals(pokemon.getType1())) {
            stab = 1.5f;
        }
        if (pokemon.getType2() != null && stab != 1.5f) {
            if (pokemon.getAttacks()[0].getType().equals(pokemon.getType2())) {
                stab = 1.5f;
            }
        }
        double bonus = efectivity*stab*0.01*(ran.nextInt(16) + 85);
        double damage = 0;
        if (pokemon.getAttacks()[0].getCategory().equals("Physical")) {
            damage = (((((0.2*pokemon.getLevel())+1)*pokemon.getAttack()*pokemon.getAttacks()[0].getPower())/(25*pokemon2.getDefense())) + 2)*bonus;
        }
        if (pokemon.getAttacks()[0].getCategory().equals("Special")) {
            damage = (((((0.2*pokemon.getLevel())+1)*pokemon.getSpecialAttack()*pokemon.getAttacks()[0].getPower())/(25*pokemon2.getSpecialDefense())) + 2)*bonus;
        }
        if (ran.nextInt(100) + 1 < 5) {
            damage *= 2;
        }
        if (Miss.miss(pokemon.getAttacks()[0].getPrecision()) || pokemon.getAttacks()[0].getPrecision() == 0) {
            pokemon2.setHp(pokemon2.getHp() - (int)damage);;
            System.out.println(pokemon2.getHp());
            System.out.println(pokemon2.getName() + " lost " + damage + " HP");
        } else{
            System.out.println(pokemon.getName() + " missed the attack!");
        }
    }    
}