package RacingCars;

import java.util.Random;

public class Car implements Runnable{
    //Khai báo tên của xe đua
    private String name;
    private final int DISTANCE = 100;
    private final int STEP = 2;
    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        //Khởi tạo điểm start(km ban đầu)
        int runDistance = 0;
        //Khởi tạo time bắt đầu cuộc đua
        long startTime = System.currentTimeMillis();
        //Kiểm tra chừng nào còn xe chưa kết thúc quãng đường đua thì xe vẫn tiếp tục chạy
        while (runDistance < DISTANCE) {
            try {
                //Random tốc độ KM/H
                int speed = (new Random()).nextInt(20);
                //Tính khoảng cách đã đi được
                runDistance += speed;
                //Vẽ đường đã đi của xe
                String log = "|";
                int percentTravel = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE,runDistance) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
