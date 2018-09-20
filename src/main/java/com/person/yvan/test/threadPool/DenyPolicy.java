package com.person.yvan.test.threadPool;


import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface DenyPolicy {

    void reject(Runnable runnable, ThreadPool threadPool);

    class DiscardDenyPolicy implements DenyPolicy{

        @Override
        public void reject(Runnable runnable, ThreadPool threadPool){

            //TODO
        }
    }



    class AbortDenyPolicy implements  DenyPolicy{

        @Override
        public void reject(Runnable runnable, ThreadPool threadPool){

           throw new RunnableDenyException("The runnable" + runnable + "will be abort.");
        }
    }


    class RunnerDenyPoloicy implements DenyPolicy{


        @Override
        public void reject(Runnable runnable, ThreadPool threadPool){

            if(!threadPool.isShutdown()){
                runnable.run();
            }
        }


    }



}
