package com.person.yvan.test.threadPool;

public class RunnableDenyException extends RuntimeException {


    public RunnableDenyException(String message){

        super(message);
    }
}
