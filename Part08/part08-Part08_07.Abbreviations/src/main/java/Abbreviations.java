import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> abbreviationHashMap;

    public Abbreviations() {
        this.abbreviationHashMap = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {

        if (this.abbreviationHashMap.containsKey(abbreviation)) {
            return;
        }

        this.abbreviationHashMap.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbrevation) {
        return this.abbreviationHashMap.containsKey(abbrevation);
    }

    public String findExplanationFor(String abbreviation) {
        return this.abbreviationHashMap.get(abbreviation);
    }

}
