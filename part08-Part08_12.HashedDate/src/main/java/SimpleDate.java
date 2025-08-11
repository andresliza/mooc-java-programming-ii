
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }

    // To have as few similar has codes as possible, without developing
    // the hash code for each date will simply be the sum of days that
    // have passed between that date and 00/00/0000, without taking into account
    // leap years.

    // Example:
    // new SimpleDate(10, 12, 1961).hashCode = 10 + 12 * 31 + 1961 * 365.
    public int hashCode() {

        int hashCode = this.day;

        if (this.month == 1
                || this.month == 3
                || this.month == 5
                || this.month == 7
                || this.month == 8
                || this.month == 10
                || this.month == 12) {
            hashCode += this.month * 31;
        } else if (this.month == 2) {
            hashCode += 2 * 28;
        } else {
            hashCode += this.month * 30;
        }

        hashCode += this.year * 365;

        return hashCode;
    }

}
