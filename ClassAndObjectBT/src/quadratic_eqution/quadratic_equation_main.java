package quadratic_eqution;

import java.util.Scanner;

public class quadratic_equation_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        quadratic_equation quadraticEquation = new quadratic_equation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm: x1 = " + quadraticEquation.getRoot1() + " x2 = " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm: x = " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Phương trình vô  nghiệm");
        }
    }
}
