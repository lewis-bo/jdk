package com.lewis.test;

/**
 * Created by lewis on 17/9/23.
 */
public class DoThis {
    public class Inner {

        public DoThis outer() {
            return DoThis.this;
        }
    }

    public void display() {
        System.out.println("inner test");
    }

    public Inner inner() {
        return new Inner();
    }
}
