
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> herd = new ArrayList();

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : herd) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String out = "";
        for (Movable movable : this.herd) {
            out += movable.toString()+"\n";
        }
        return out;
    }

}
