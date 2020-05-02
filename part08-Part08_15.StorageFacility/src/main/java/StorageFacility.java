
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StorageFacility {

    private final HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList());
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (!this.storage.containsKey(storageUnit)) {
            return new ArrayList<String>();
        }
        return this.storage.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        if (this.storage.containsKey(storageUnit)) {
            this.storage.get(storageUnit).remove(item);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> output = new ArrayList<>();
        for (Map.Entry<String, ArrayList<String>> entry : this.storage.entrySet()) {
            if (!(entry.getValue().isEmpty())) {
                output.add(entry.getKey());
            }
        }
        return output;
        

    }
}
