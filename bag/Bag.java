package bag;

import java.util.ArrayList;

/**
 * Bag
 */
public class Bag {

    private ArrayList<Medicine> medicines = new ArrayList<>();
    /**
     * @return the items
     */
    public ArrayList<Medicine> getMedicines() {
        return medicines;
    }
    public void listMedicines() {
        for (int i = 0; i < medicines.size(); i++) {
            System.out.println((i + 1) + ".- " + medicines.get(i).getName() + " : " + medicines.get(i).getQuantity());
        }
    }
    public void listMedicineData(int i) {
        System.out.println(medicines.get(i).getName() + ": " +
            medicines.get(i).getDescription() + " | " +
            medicines.get(i).getQuantity());
    }

    private ArrayList<Item> items = new ArrayList<>();
    /**
     * @return the items
     */
    public ArrayList<Item> getItems() {
        return items;
    }
    public void listItems() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ".- " + items.get(i).getName() + " : " + items.get(i).getQuantity());
        }
    }
    public void listItemData(int i) {
        System.out.println(items.get(i).getName() + ": " + 
        items.get(i).getDescription() + " | " + 
        items.get(i).getQuantity());
    }

}