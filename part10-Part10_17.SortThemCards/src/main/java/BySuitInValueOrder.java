
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card x, Card y) {
        if (x.getSuit() == y.getSuit()) {
            return x.compareTo(y);
        }
        return new SortBySuit().compare(x, y);
    }

}
