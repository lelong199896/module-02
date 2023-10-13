package stop_wacth;

import java.util.Scanner;

public class stop_watch {
    private long startTime, stopTime;
    private boolean isRunning;

     public stop_watch(long startTime, long stopTime, boolean isRunning) {
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.isRunning = isRunning;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    public void setStopTime(long stopTime) {
        this.stopTime = stopTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
        isRunning = true;
    }

    public void stop() {
        stopTime = System.currentTimeMillis();
        isRunning = false;
    }

    public long getElapsedTime(){
        long elapseTime = 0;
        if (isRunning) {
            elapseTime = System.currentTimeMillis() - startTime;
        } else  {
            elapseTime = stopTime - startTime;
        }
        return  elapseTime;
    }
}
