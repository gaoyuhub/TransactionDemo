package com.person.yvan.test;


public class EnumDemo{

    public static void main(String[] args){

        EnumTest day = EnumTest.MONDAY;
    }

}


enum  EnumTest{

    MONDAY("1","2") , TUESDAY("1","2") , WEDENSDAY("1","2") , THURSDAY("1","2") , FRIDAY("1","2"), SATURDAY("1","2") , SUNDAY("1","2");

    private String name;
    private String value;

    private EnumTest(String name,String value){
        this.name = name;
        this.value = value;
    }

    public String toString(){
        return this.name+"_"+this.value;
    }

}
