package Resizeable;

public class CircleTest {
    public static void main(String[] args) {
        CircleResizeable circleResizeable = new CircleResizeable(10,75);
        System.out.println("Before Area: " + circleResizeable.Area());
        System.out.println("After Area: " + circleResizeable.areaPercent());
    }
}