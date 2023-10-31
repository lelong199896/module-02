package EvenOld;

public class OldThread implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("Old number: ");
            for (int i = 1; i <= 10; i += 2) {
                System.out.println(i);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
