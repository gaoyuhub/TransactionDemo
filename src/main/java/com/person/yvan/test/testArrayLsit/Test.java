package com.person.yvan.test.testArrayLsit;

import com.sun.xml.internal.rngom.parse.host.Base;

import java.io.Serializable;
import java.util.Arrays;

import static java.lang.System.out;

public class Test {

    public static interface MyInterface{

        void foo();
    }

    public static class BaseClass implements MyInterface,Cloneable,Serializable{

        @Override
        public void foo() {
            out.print("BaseClass.foo");
        }
    }


    public static class Class1 extends BaseClass{

        @Override
        public void foo() {
            super.foo();
            System.out.println("Class1.foo");
        }
    }

    static class Class2 extends BaseClass implements MyInterface, Cloneable,
            Serializable {

        @Override
        public void foo() {
            super.foo();
            System.out.println("Class2.foo");
        }
    }

    public static void main(String[] args) {

        showInterfacesFor(BaseClass.class);
        showInterfacesFor(Class1.class);
        showInterfacesFor(Class2.class);
    }

    private static void showInterfacesFor(Class<?> clazz) {
        System.out.printf("%s --> %s\n", clazz, Arrays.toString(clazz
                .getInterfaces()));
    }


}
