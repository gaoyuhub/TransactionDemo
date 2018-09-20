package com.person.yvan.test.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.System.out;


public class MyExecutor extends Thread {

    private int index;

    public MyExecutor(int i){
        this.index  = i;
    }


    public void run(){

        try {
            out.println("["+this.index+"] start ...");
            Thread.sleep((int)(Math.random()*1000));
            out.println("["+this.index+"] end.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args){
        ExecutorService service = Executors.newFixedThreadPool(4);

        for(int i=0;i<10;i++){
            service.execute(new MyExecutor(i));
        }

        out.println("submit finish");
        service.shutdown();









    }


}
