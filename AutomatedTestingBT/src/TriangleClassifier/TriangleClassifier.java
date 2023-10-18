package TriangleClassifier;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter edge a: ");
        int a = scanner.nextInt();
        System.out.print("Enter edge b: ");
        int b = scanner.nextInt();
        System.out.print("Enter edge c: ");
        int c = scanner.nextInt();
        if (a == b && b == c) {
            System.out.println("equilateral triangle");
        } else if (a == b || b == c || c == a) {
            System.out.println("isosceles triangle");
        } else if (a + b < c || b + c < a || a + c < b) {
            System.out.println("not a triangle");
        } else {
            System.out.println("regular triangle");
        }
    }
}
