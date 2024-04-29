package dimitri_durmishian_1.task3;

public class BicycleStoreTester {
    public static void main(String[] args) {
        BicycleStore store = new BicycleStore();

        // Creating sample bicycles
        Bicycle bike1 = new Bicycle();
        bike1.setBrand("Trek");
        bike1.setModel("FX");

        Bicycle bike2 = new Bicycle();
        bike2.setBrand("Giant");
        bike2.setModel("Defy");

        // Adding bicycles to the store's inventory
        store.addBicycle(bike1);
        store.addBicycle(bike1); // Attempting to add the same bicycle again
        store.addBicycle(bike2);

        // Printing the current inventory of bicycles in the store
        store.printInventory();
    }
}

