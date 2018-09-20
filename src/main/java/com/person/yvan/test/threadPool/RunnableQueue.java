package com.person.yvan.test.threadPool;

public interface RunnableQueue {


    // task queue : use for caching the tasks that have submitted to thread pool
    void offer(Runnable runnable);

    //work thread get Runnable by take method
    Runnable take();

    //get task count of task queue
    int size();


}
