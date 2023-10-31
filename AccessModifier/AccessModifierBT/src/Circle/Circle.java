package Circle;

public class Circle {
    private double radius = 1.0;
    public static final double PI = 3.14;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        area = PI * radius * radius;
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    private String color = "red";
    private double area;

    public  Circle(double radius) {

    }
    public Circle(){

    }
    public double getRadius() {
        return radius;
    }


}
