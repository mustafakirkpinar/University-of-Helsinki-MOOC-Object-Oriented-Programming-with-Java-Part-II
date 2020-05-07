
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private final List<Card> hand = new ArrayList();

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        this.hand.stream().forEach(card -> System.out.println(card));
    }

    public void sort() {
        Collections.sort(hand);
    }

    public int handTotal(List<Card> hand) {
        return hand.stream().mapToInt(card -> card.getValue()).sum();
    }

    @Override
    public int compareTo(Hand h) {

        return this.handTotal(this.hand) - this.handTotal(h.hand);

    }

    public void sortBySuit() {

        Comparator<Card> comparator = Comparator
                .comparing(Card::getSuit)
                .thenComparing(Card::getValue);
        Collections.sort(this.hand, comparator);
    }
}
