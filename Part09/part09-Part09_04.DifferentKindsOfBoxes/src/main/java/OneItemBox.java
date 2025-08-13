public class OneItemBox extends Box {

    private boolean full = false;

    public OneItemBox() {
        super();
    }

    @Override
    public void add(Item item) {
        if (full)
            return;

        this.items.add(item);
        full = true;
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }

}
