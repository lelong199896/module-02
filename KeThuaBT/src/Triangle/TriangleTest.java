package Triangle;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 triangle sides: ");
        System.out.print("Side 1: ");
        triangle.setSide1(scanner.nextDouble());
        System.out.print("Side 2: ");
        triangle.setSide2(scanner.nextDouble());
        System.out.print("Side 3: ");
        triangle.setSide3(scanner.nextDouble());
        System.out.print("Enter color: ");
        triangle.setColor(scanner.next());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Color: " + triangle.getColor());
    }
}
