package Comparable;

public class ComparableCircle extends Circle implements Comparable{
    public ComparableCircle() {
    }
    public  ComparableCircle(double radius) {
        super(radius);
    }
    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }
    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) {
            return 1;
        } else if (getRadius() < o.getRadius()) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public int compareTo() {
        return 0;
    }
}
