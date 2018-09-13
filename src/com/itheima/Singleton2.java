package com.itheima;

/**
 * @author 聂帅
 * 线程安全式
 */
public class Singleton2 {
    public static Singleton instance;
    private Singleton2 (){};
    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
