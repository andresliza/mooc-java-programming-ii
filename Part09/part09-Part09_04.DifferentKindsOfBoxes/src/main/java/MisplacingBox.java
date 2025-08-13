public class MisplacingBox extends Box {

    public MisplacingBox() {
        super();
    }

    @Override
    public void add(Item item) {
        this.items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }

}
