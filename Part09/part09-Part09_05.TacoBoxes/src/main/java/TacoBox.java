
public interface TacoBox {

    // Returns the amount of tacos remaining
    int tacosRemaining();

    // Decreases the amount of tacos by one.
    // The number of tacos cannot be negative.
    void eat();
}
