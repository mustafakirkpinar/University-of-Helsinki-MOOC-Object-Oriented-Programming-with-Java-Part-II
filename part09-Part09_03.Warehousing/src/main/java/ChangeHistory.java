
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        double max = 0.;
        for (double d : this.history) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    public double minValue() {
        double min = Double.MAX_VALUE;
        if (this.history.isEmpty()) {
            min = 0;
            return min;
        }
        for (double d : this.history) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }

    public double average() {
        double total = 0.;
        for (double d : this.history) {
            {
                total += d;
            }
        }
        if (total == 0) {
            return total;
        }
        return total / this.history.size();
    }

}
