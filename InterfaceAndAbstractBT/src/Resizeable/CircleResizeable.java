package Resizeable;

import Colorable.Colorable;

public class CircleResizeable implements Resizeable{
    private double radius;
    private double percent;
    private double area;

    public CircleResizeable(double radius, double percent) {
        this.radius = radius;
        this.percent = percent;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double Area() {
        area = radius * radius * Math.PI;
        return area;
    }
    public double areaPercent() {
        return area * percent / 100;
    }

}