package com.person.yvan.test.threadPool;


import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface DenyPolicy {

    void reject(Runnable runnable, ThreadPool threadPool);

    class DiscardDenyPolicy implements DenyPolicy{

        //该拒绝策略会将任务直接丢弃
        @Override
        public void reject(Runnable runnable, ThreadPool threadPool){

            //TODO
        }
    }


    //向任务提交者提交异常
    class AbortDenyPolicy implements  DenyPolicy{

        @Override
        public void reject(Runnable runnable, ThreadPool threadPool){

           throw new RunnableDenyException("The runnable" + runnable + "will be abort.");
        }
    }


    //该提交策略会使任务在提交者所在的线程中执行
    class RunnerDenyPoloicy implements DenyPolicy{


        @Override
        public void reject(Runnable runnable, ThreadPool threadPool){

            if(!threadPool.isShutdown()){
                runnable.run();
            }
        }


    }



}
