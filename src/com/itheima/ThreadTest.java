package com.itheima;

public class ThreadTest implements Runnable {
    public static int i = 0;

    public static void main(String[] args) {
        for (int j = 0;j<100;j++) {
            Thread t = new Thread(new ThreadTest());
            t.start();
        }
        System.out.println(i);
    }
    @Override
    public void run() {
        i=i+1;
    }
}
