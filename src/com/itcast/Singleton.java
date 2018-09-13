package com.itcast;

/**
 * @author 聂帅
 * 饿汉式
 */
public class Singleton {
    public static Singleton instance = new Singleton();
    private Singleton(){};
    public static Singleton getInstance() {
        return instance;
    }
}
