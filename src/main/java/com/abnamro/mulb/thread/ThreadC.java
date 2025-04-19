package com.abnamro.mulb.thread;

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class ThreadC {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Runnable a = () -> {
                for (int i = 0; i < 500; i++) {
                    counter.increment();
                }
            } ;
            Runnable b = () -> {
                    for (int i = 0; i < 1500; i++) {
                        counter.increment();
                    }
                } ;
            Thread t1 = new Thread(a);
            Thread t2 = new Thread(b);

            t1.start();
            t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

            System.out.println(counter.getCount());
            }

        }
