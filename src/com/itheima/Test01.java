package com.itheima;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test01 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      System.out.println(test01(str));
      System.out.println(test02(str));
  }

  public static String  test01(String str) {
      int num = 0;
      for(int i=0;i<str.length();i++) {
          for(int j=i+1;j<str.length()-1;j++) {
              if(str.charAt(i)>=65&&str.charAt(i)<=90||str.charAt(i)>=97&&str.charAt(i)<=122) {
                  if(str.charAt(i)==str.charAt(j)) {
                      num++;
                  }

              }
              if(num==2) {
                  return str.charAt(i)+"";
              }
          }

      }
      return null;
  }

    public static String test02(String str) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)>=65&&str.charAt(i)<=90||str.charAt(i)>=97&&str.charAt(i)<=122) {
                String str1 =str.charAt(i)+"";
                if(!map.containsKey(str1)) {
                    map.put(str1,0);
                }else {
                    Integer num = map.get(str1);
                    num++;
                    map.put(str1,num);
                    if(num==2) {
                        return str1;
                    }
                }
            }
        }
        return null;
    }
}
