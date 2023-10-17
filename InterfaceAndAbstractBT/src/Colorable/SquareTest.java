package Colorable;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(5,true);
        squares[1] = new Square(10,false);
        squares[2] = new Square();
        for (Square square : squares) {
            System.out.println("Square Area: " + square.Area());
            if (square.isFilled()) {
                square.howToColor();
            }
        }
    }
}
