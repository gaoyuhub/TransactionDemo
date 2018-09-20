package com.person.yvan.test;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;



public class StringResource {

    public static void main(String[] args){

        CharSequence cs = new CharSequence() {
            @Override
            public int length() {
                return 0;
            }

            @Override
            public char charAt(int index) {
                return 0;
            }

            @Override
            public CharSequence subSequence(int start, int end) {
                return null;
            }
        };


        List ist = new ArrayList();


        ist.add(123);
        ist.add(123);
        ist.add(123);

        ist.forEach(x->out.println(x));


        new Thread(()->System.out.print("a")).start();

//        Integer[] it = (Integer[])ist.toArray();

//        testNew(ArrayList::new);

        out.println(Object[].class.getName());


        ArrayDeque ad = new ArrayDeque(10);
        out.println(ad.size());




    }


//    非抽象类不能有抽象方法
//    public abstract void abstractMethod();


    public static void testNew(List a){
        System.out.println("12312312312312311231");
        AbstractImpDemo aid = new AbstractImpDemo();


    }


    public void qqq(){

        int a = 3;

    }


}
