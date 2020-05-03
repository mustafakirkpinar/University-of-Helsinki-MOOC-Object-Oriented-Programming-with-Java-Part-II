/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class MisplacingBox extends Box {

    private Item oneItem;

    public MisplacingBox() {
        this.oneItem = null;
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }

    @Override
    public void add(Item item) {
        this.oneItem = item;
    }

}
