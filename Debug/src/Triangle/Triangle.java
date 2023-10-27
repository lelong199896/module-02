package Triangle;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temporary edge: ");
        int a = scanner.nextInt();
        System.out.print("Enter the temporary edge: ");
        int b = scanner.nextInt();
        System.out.print("Enter the temporary edge: ");
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println(a + ", " + b + ", " + c + " are the three sides of the triangle");
        } else if (a < 0 || b < 0 || c < 0) {
            System.out.println(a + ", " + b + ", " + c + " is not three sides of the triangle");
        } else {
            System.out.println(a + ", " + b + ", " + c + " is not three sides of the triangle");
        }
    }
}
