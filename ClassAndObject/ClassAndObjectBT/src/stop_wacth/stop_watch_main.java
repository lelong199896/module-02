package stop_wacth;

import java.util.Scanner;

public class stop_watch_main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = -1;
        stop_watch watch = new stop_watch(0, 0, false);
        while (choice != 0) {
            System.out.print("""
                    1. Start
                    2. Stop
                    3. Time
                    4. Exit
                    Enter your choice: 
                    """);
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Stop watch start");
                    watch.start();
                    break;
                }
                case 2: {
                    System.out.println("Stop watch stop");
                    watch.stop();
                    break;
                }
                case 3: {
                    long elapsedTime = watch.getElapsedTime();
                    System.out.println(elapsedTime);
                    break;
                }
                case 4: {
                    System.exit(0);
                }
            }
        }
    }
}
