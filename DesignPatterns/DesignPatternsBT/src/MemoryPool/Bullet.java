package MemoryPool;

public class Bullet {
    public static int count = 0; //số lượng đạn tạo ra
    private int position; //vị trí của viên đạn

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Bullet() {
        count++;
    }

    public void move() {
        position++;
    }
}
