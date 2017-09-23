package com.lewis.test;

/**
 * Created by lewis on 17/4/3.
 */
public class VolatileTest {



    public static void main(String[] args) {
        VolatileObj test = new VolatileObj();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);

        t1.start();
        t2.start();
    }
}


class VolatileObj implements  Runnable{
    private volatile boolean isRun = false;

    public void run() {
        boolean canExecute = !isRun;

        if (!canExecute) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (canExecute) {
            isRun = true;
            System.out.println(Thread.currentThread().getName() + "  I am run");
            try {
                Thread.currentThread().sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isRun = false;
    }
}
