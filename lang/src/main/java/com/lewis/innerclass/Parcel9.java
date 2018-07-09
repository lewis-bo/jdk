package com.lewis.innerclass;

public class Parcel9 {

    public Wrapping wrapping(final int x, final int y) {
        return new Wrapping(x) {
            private int i = x;

            public void say() {
                System.out.println("i=" + i);
            }

            public int value() {
                return y;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p9 = new Parcel9();
        Wrapping wrapping = p9.wrapping(3, 6);
        System.out.println(wrapping.value());
    }
}
