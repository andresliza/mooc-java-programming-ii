public class Container {

    private int amount;
    public final int MAX_AMOUNT = 100;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return this.amount;
    }

    // We cannot add a negative amount, nor we can exceed its maximum.
    public void add(int amount) {
        if (amount < 0) {
            return;
        } else if (this.amount + amount > MAX_AMOUNT) {
            this.amount = MAX_AMOUNT;
        } else {
            this.amount += amount;
        }
    }

    // We cannot substract a negative amount, nor we can go below zero.
    public void remove(int amount) {
        if (amount < 0) {
            return;
        } else if (this.amount - amount < 0) {
            this.amount = 0;
        } else {
            this.amount -= amount;
        }
    }

    /*
     * Example:
     * Container c = new Container();
     * c.add(20);
     * System.out.println(c);
     * $ 20/100
     */
    public String toString() {
        return this.amount + "/" + this.MAX_AMOUNT;
    }

}
