package CircleCylinder;

public class CircleCylinderTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2, "red");
        System.out.println(circle);
        System.out.println("Circle Area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(3,"Black", 3);
        System.out.println(cylinder);
        System.out.println("Cylinder Volume: " + cylinder.getVolume());
    }
}
