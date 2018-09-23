package com.person.yvan.test.threadPool;


public interface ThreadPool {

    //submit task to thread pool
    void execute(Runnable runnable);

    //shutdown thread pool
    void shutdown();

    //get init size of thread pool
    int getInitSize();

    //get max size of thread pool
    int getMaxSize();

    //get core size of thread pool
    int getCoreSize();

    //get queue size of queue for caching the tasks
    int getQueueSize();


    //get active threads of thread pool
    int getActiveCount();


    //check if the thread pool is shutdown
    boolean isShutdown();






}
