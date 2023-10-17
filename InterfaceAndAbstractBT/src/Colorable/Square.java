package Colorable;

public class Square implements Colorable{
    private double side = 1;
    private boolean filled = true;

    public Square(){
    }
    public Square(double side, boolean filled) {
        this.side = side;
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double Area() {
        return side * side;
    }
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
