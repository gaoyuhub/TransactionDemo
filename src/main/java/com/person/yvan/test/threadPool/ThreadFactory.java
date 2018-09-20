package com.person.yvan.test.threadPool;

import org.springframework.stereotype.Component;

//create thread factory
@FunctionalInterface
public interface ThreadFactory {


    Thread createThread(Runnable runnable);

}
