
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {

        if (registry.containsKey(licensePlate)) {
            return false;
        }

        registry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return this.registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            registry.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {

        for (LicensePlate lp : this.registry.keySet()) {
            System.out.println(lp);
        }
    }

    public void printOwners() {
        Set<String> owners = new TreeSet();

        for (String st : registry.values()) {
            owners.add(st);
        }
        for (String st : owners) {
            System.out.println(st);
        }
        
    }
}
