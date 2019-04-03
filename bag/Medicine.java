package bag;

import pokemon.Pokemon;

public abstract class Medicine {
    private String name;
    private String description;
    private String effect;
    private int quantity;

    public Medicine(String name, String description, String effect, int quantity) {
        this.name = name;
        this.description = description;
        this.effect = effect;
        this.quantity = quantity;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the effect
     */
    public String getEffect() {
        return effect;
    }
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }
    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract void use(Pokemon pokemon);
}