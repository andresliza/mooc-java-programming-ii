import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageUnits;

    public StorageFacility() {
        this.storageUnits = new HashMap<>();
    }

    // If the unit the item should be added to does not exist in the facility
    // we create said unit and initialize its ArrayList before adding the item
    // to the ArrayList of said unit.
    public void add(String unit, String item) {

        this.storageUnits.putIfAbsent(unit, new ArrayList<>());
        this.storageUnits.get(unit).add(item);

    }

    // If a storage unit is empty, we return an empty list.
    public ArrayList<String> contents(String storageUnit) {
        return this.storageUnits.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> items = this.storageUnits.get(storageUnit);
        if (items == null) {
            return;
        }
        items.remove(item);
        if (items.isEmpty()) {
            this.storageUnits.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> unitNames = new ArrayList<>();
        for (String name : this.storageUnits.keySet()) {
            if (!this.storageUnits.get(name).isEmpty())
                unitNames.add(name);
        }
        return unitNames;
    }
}
