package com.itheima;

import java.util.Scanner;

/**
 * 规范身份证输入
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try {
            String s = toStandardization(str);
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String toStandardization(String str) throws Exception {
        String newStr = str.replaceAll(" ","");
        for(int i=0;i<newStr.length();i++) {
            if(!(newStr.charAt(i)>=48 && newStr.charAt(i)<=57 )){
                throw new Exception("请输入规范身份证号!");
            }
        }
        if(newStr.length()<=6) {
            return newStr;
        }
        if(newStr.length()>6&&newStr.length()<=14) {
            return newStr.substring(0,6)+" "+newStr.substring(6,newStr.length());
        }
        if(newStr.length()>14&&newStr.length()<=18) {
            return newStr.substring(0,6)+" "+newStr.substring(6,14)+" "+newStr.substring(14,18);
        }
        if(newStr.length()>18) {
            throw new Exception("超出身份证位数!");
        }
        return str;
    }


}
