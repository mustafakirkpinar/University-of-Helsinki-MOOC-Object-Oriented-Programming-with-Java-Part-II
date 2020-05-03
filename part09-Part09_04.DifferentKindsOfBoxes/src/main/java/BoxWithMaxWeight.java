
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class BoxWithMaxWeight extends Box {

    final private int capacity;
    private int fullness;
    private ArrayList<Item> repo;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.repo = new ArrayList();
        this.fullness = 0;
    }

    @Override
    public void add(Item item) {

        if (this.capacity >= this.fullness + item.getWeight()) {
            this.repo.add(item);
            this.fullness += item.getWeight();
        }

    }

    @Override
    public boolean isInBox(Item item) {
        return this.repo.contains(item);
    }

}
