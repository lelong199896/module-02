package EvenOld;

public class TestThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new OldThread());
        Thread thread2 = new Thread(new EvenThread());
        thread1.start();
        try {
            thread1.join(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }
}
