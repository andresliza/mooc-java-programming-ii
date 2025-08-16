import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> members;

    public Herd() {
        this.members = new ArrayList<>();
    }

    public String toString() {
        String toReturn = "";
        for (Movable member : this.members) {
            toReturn += member.toString() + "\n";
        }
        return toReturn;
    }

    public void addToHerd(Movable member) {
        this.members.add(member);
    }

    public void move(int dx, int dy) {
        for (Movable member : this.members) {
            member.move(dx, dy);
        }
    }

}
