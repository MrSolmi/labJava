package com.company;

public class ThreadMethod implements Runnable {
    long runtime;
    public ThreadMethod (long _runtime) {
        runtime = _runtime;
    }

    public void run () {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("" + i);
                Thread.sleep(runtime);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Поток прерван");
        }
    }
}
