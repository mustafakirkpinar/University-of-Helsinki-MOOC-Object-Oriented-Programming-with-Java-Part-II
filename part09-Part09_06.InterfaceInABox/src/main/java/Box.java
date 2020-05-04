
import java.util.ArrayList;

public class Box implements Packable {

    private double capacity;
    private double currentWeight;
    private ArrayList<Packable> members;

    public Box(double capacity) {
        this.capacity = capacity;
        this.members = new ArrayList<>();
    }

    public void add(Packable packable) {
        if (packable.weight() + this.weight() < this.capacity) {
            this.members.add(packable);
        }

    }

    @Override
    public double weight() {
        double Weight = 0.0;
        for (Packable packable : this.members) {
            Weight += packable.weight();
        }
        return Weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.members.size() + " items, total weight "
                + this.weight() + " kg";
    }

}
