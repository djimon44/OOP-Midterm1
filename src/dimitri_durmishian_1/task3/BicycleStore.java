package dimitri_durmishian_1.task3;

import java.util.ArrayList;
import java.util.List;

public class BicycleStore {
    // Inventory of bicycles in the store
    private final List<Bicycle> inventory = new ArrayList<>();

    // Add a bicycle to the store's inventory
    public void addBicycle(Bicycle bicycle) {
        if (!inventory.contains(bicycle)) {
            inventory.add(bicycle);
        } else {
            System.out.println("The bicycle is already in the inventory.");
        }
    }

    // Remove a bicycle from the store's inventory
    public boolean sellBicycle(Bicycle bicycle) {
        return inventory.remove(bicycle);
    }

    // Print the current inventory of bicycles in the store
    public void printInventory() {
        if (inventory.isEmpty()) {
            System.out.println("The inventory is empty");
        } else {
            for (Bicycle bike : inventory) {
                System.out.println("Brand: " + bike.getBrand() + ", Model: " + bike.getModel());
            }
        }
    }
}

