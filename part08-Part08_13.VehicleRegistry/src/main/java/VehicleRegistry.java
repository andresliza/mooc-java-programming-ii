import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {

        if (!this.registry.containsKey(licensePlate)) {
            this.registry.put(licensePlate, owner);
            return true;
        }

        return false;
    }

    public String get(LicensePlate licensePlate) {
        return this.registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {

        if (this.registry.containsKey(licensePlate)) {
            this.registry.remove(licensePlate);
            return true;
        }

        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate license : this.registry.keySet()) {
            System.out.println(license);
        }
    }

    // We want to print owners just once, so we store those already printed
    // so we don't print them again.
    public void printOwners() {
        ArrayList<String> alreadyPrinted = new ArrayList<>();

        for (String owner : this.registry.values()) {
            if (!alreadyPrinted.contains(owner)) {
                System.out.println(owner);
                alreadyPrinted.add(owner);
            }
        }
    }

}
