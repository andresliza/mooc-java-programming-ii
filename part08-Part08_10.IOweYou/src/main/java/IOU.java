import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> owings;

    public IOU() {
        this.owings = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {

        this.owings.put(toWhom, amount);

    }

    public double howMuchDoIOweTo(String toWhom) {

        return this.owings.getOrDefault(toWhom, 0.0);

    }

}
