package com.person.yvan.test;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.System.out;

public class test3 {

    public static void main(String[] args){

        /*ArrayDeque ad = new ArrayDeque(10);

        out.println(ad);

        ad.add(123);
        ad.add(456);
        ad.add(789);

        out.println(ad.size());

        out.println(ad.pollFirst());
        out.println(ad.size());

        ad.pop();
        ad.push(22);


        out.println(ad.peekLast());
        out.println(ad.peekFirst());


        int b = 0b11000;
        out.println(b);
        b = b >>> 2;
        out.println(b);*/


        Map<String,String> linkedHashMap = new LinkedHashMap<String, String>(10,0.75f,true);
        linkedHashMap.put("NO1","小明");
        linkedHashMap.put("NO2","小赵");
        linkedHashMap.put("NO3","小周");
        // 对NO1进行get操作
        linkedHashMap.get("NO1");
        System.out.println("----按访问顺序遍历LinkedHashMap----");
        for(Map.Entry entry:linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }
}
