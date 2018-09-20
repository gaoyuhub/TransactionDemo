package com.person.yvan.utils;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest {

    public static void main(String[] args){

        Callable<Integer> myCallable  = new myCallable();

        FutureTask<Integer> ft = new FutureTask<>(myCallable);

        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            if(i == 30){
                Thread thread = new Thread(ft);
                thread.start();
            }
        }

        System.out.println("主线程for循环执行完毕..");

        try{
            int sum = ft.get();
            System.out.println("sum = " + sum);
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }

    }


}


class  myCallable implements Callable<Integer>{


    private int i = 0;

    @Override
    public Integer call(){

        int sum = 0;
        for(;i<100;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            sum += i;
        }

        return sum;

    }





}