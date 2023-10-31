package EvenOld;

public class EvenThread implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("Even number: ");
            for (int i = 0; i <= 10; i += 2) {
                System.out.println(i);
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
