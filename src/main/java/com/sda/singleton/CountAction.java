package com.sda.singleton;

public class CountAction implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            CountService.instanceOf().increment();
        }
    }
}
