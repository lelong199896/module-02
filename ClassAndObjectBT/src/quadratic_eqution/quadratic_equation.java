package quadratic_eqution;

import java.util.Scanner;

public class quadratic_equation {
    double a, b, c;

    public quadratic_equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public  double  getDiscriminant() { //Delta
        return  b * b - 4 * a * c;
    }

    public double getRoot1() { //X1
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    public double getRoot2() { //X2
        return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

}
