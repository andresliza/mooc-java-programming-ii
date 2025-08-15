import java.util.ArrayList;

public class Box implements Packable {

    private double maxCapacity;
    private ArrayList<Packable> contents;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.contents = new ArrayList<>();
    }

    public void add(Packable item) {
        double newWeight = this.weight() + item.weight();

        if (newWeight > maxCapacity)
            return;

        this.contents.add(item);
    }

    public double weight() {
        double weight = 0;

        for (Packable item : this.contents) {
            weight += item.weight();
        }

        return weight;
    }

    public String toString() {
        return "Box: " + this.contents.size() + " items, total weight " + this.weight() + " kg";
    }

}
