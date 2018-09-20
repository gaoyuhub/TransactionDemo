package com.person.yvan.utils;

public class TestABC {


    public static void main(String[] args){

        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("a");
            }
        });

        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("b");
            }
        });

        Thread c = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("c");
            }
        });



        for(int i=0;i<3;i++){
            a.start();
            b.start();
            c.start();
        }



    }
}
