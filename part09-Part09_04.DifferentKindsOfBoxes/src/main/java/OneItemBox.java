
public class OneItemBox extends Box {

    private Item oneItem; 

    public OneItemBox() {
        this.oneItem = null;
    }

    @Override
    public void add(Item item) {
        if (this.oneItem == null) {
            this.oneItem = item;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (item == null || this.oneItem==null) {
            return false;
        }
        return this.oneItem.equals(item);
    }

}
