package MoveablePoint;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float XSpeed = 0.0f;
    private float YSpeed = 0.0f;
    public MovablePoint() {
    }

    public MovablePoint(float XSpeed, float YSpeed) {
        this.XSpeed = XSpeed;
        this.YSpeed = YSpeed;
    }

    public MovablePoint(float x, float y, float XSpeed, float YSpeed) {
        super(x, y);
        this.XSpeed = XSpeed;
        this.YSpeed = YSpeed;
    }

    public float getXSpeed() {
        return XSpeed;
    }

    public void setXSpeed(float XSpeed) {
        this.XSpeed = XSpeed;
    }

    public float getYSpeed() {
        return YSpeed;
    }

    public void setYSpeed(float YSpeed) {
        this.YSpeed = YSpeed;
    }
    public void setSpeed(float XSpeed, float YSpeed) {
    }
    public float[] getSpeed() {
        float[] result = new float[2];
        result[0] = XSpeed;
        result[1] = YSpeed;
        return result;
    }

    @Override
    public String toString() {
        return "Point = " +
                Arrays.toString(getXY()) +
                "\nMovablePoint = " +
                Arrays.toString(getSpeed());
    }
    public float[] move() {
        this.x += XSpeed;
        this.y += YSpeed;
        return getXY();
    }
}
