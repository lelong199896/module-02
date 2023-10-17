package MoveablePoint;

import java.util.Arrays;

public class MoveablePointTest {
    public static void main(String[] args) {
        Point point = new Point(3.0f,3.5f);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(4.0f,4.5f,1.0f,1.0f);
        System.out.println(movablePoint);
        System.out.println("Point after = " + Arrays.toString(movablePoint.move()));
    }
}
