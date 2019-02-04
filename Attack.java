/**
 * Attack
 */
public class Attack {
    private String name;
    private int power;
    private int precision;
    private int powerPoints;
    private String type;
    public Attack() {
        super();
        name = "Struggle";
        power = 50;
        type = null;
        precision = 0;
    }
    // case it has null precision
    public Attack(String name, int power, String type, int powerPoints) {
        super();
        this.name = name;
        this.power = power;
        this.powerPoints = powerPoints;
        this.type = type;
    }
    // case it has null power
    public Attack(String name, String type,int powerPoints, int precision) {
        super();
        this.name = name;
        this.precision = precision;
        this.powerPoints = powerPoints;
        this.type = type;
    }
    // case it has null power AND precision
    public Attack(String name, int powerPoints, String type) {
        super();
        this.name = name;
        this.powerPoints = powerPoints;
        this.type = type;
    }
    // case it has all attributes
    public Attack(String name, int power, int precision, int powerPoints, String type) {
        super();
        this.name = name;
        this.power = power;
        this.precision = precision;
        this.powerPoints = powerPoints;
        this.type = type;
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
    
    public int getPrecision() {
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
    public void setPrecision(int precision) {
        this.precision = precision;
    }
    public void setType(String type) {
        this.type = type;
    }
}