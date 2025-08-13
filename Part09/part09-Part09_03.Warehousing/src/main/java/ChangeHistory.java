import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> changes;

    public ChangeHistory() {
        this.changes = new ArrayList<>();
    }

    public void add(double status) {
        changes.add(status);
    }

    public void clear() {
        changes.clear();
    }

    public String toString() {
        return changes.toString();
    }

    public double maxValue() {
        double maxValue = 0.0;

        for (Double balance : changes) {
            if (balance > maxValue) {
                maxValue = balance;
            }
        }

        return maxValue;
    }

    public double minValue() {
        double minValue = Double.POSITIVE_INFINITY;

        for (Double balance : changes) {
            if (balance < minValue) {
                minValue = balance;
            }
        }
        return minValue;
    }

    public double average() {
        if (changes.isEmpty())
            return 0.0;

        double sum = 0.0;

        for (Double balance : changes) {
            sum += balance;
        }

        double average = sum / changes.size();
        return average;
    }

}
