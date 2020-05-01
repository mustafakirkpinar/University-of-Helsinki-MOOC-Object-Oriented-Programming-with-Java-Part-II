
public class Container {

    private int number = 0;

    public void add(int add) {
        if (add > 0) {
            this.number += add;
            if (number > 100) {
                number = 100;
            }
        }
    }

    public void remove(int remove) {
        if (remove > 0) {
            number -= remove;
            if (number < 0) {
                number = 0;
            }
        }
    }

    public String toString() {
        return number + "/100";
    }
    
    public int contains() {
        return number;
    }
}
