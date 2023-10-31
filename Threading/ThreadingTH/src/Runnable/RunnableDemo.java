package Runnable;

public class RunnableDemo implements Runnable{
    private Thread t;
    private final String threadName;

    public RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    //Hiển thị luồng nào đang thực hiện
    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i >0 ; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                //Dừng vòng lặp trong 50ms
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    //Tạo ra các luồng với tên tương ứng
    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
