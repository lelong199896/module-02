package fan;

public class Fan {
    public Fan(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }
    final static private int SLOW = 1;
    final static private int MEDIUM = 2;
    final static private int FAST = 3;
    private int speed = SLOW;
    private boolean status;

    @Override
    public String toString() {
        return "Fan{" +
                (status ? "fan is on: " : "fan is off: ") +
                "speed=" + speed +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    private double radius = 5;

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color = "blue";
}
