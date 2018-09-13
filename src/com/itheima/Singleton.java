package com.itheima;

/**
 * @author 聂帅
 * 懒汉式
 */
public class Singleton {
    public static Singleton instance;
    Singleton(){};
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
