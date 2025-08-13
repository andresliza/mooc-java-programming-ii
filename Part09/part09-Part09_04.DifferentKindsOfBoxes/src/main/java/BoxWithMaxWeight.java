public class BoxWithMaxWeight extends Box {

    private int weight;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        super();
        this.capacity = capacity;
        this.weight = 0;
    }

    public void add(Item item) {
        if (weight + item.getWeight() > capacity)
            return;

        this.items.add(item);
        this.weight += item.getWeight();
    }

    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }

}
