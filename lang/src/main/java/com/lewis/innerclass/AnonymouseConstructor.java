package com.lewis.innerclass;

public class AnonymouseConstructor {

    public static Base getBase(final int i) {
        return new Base(i) {
            {
                System.out.println("sdgd");
            }
            @Override
            public void f() {

                System.out.println("hello innner baase" + i);
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}

abstract class Base {
    public Base(int i) {
        System.out.println("Base constructor i=" + i);
    }

    public abstract void f();
}
