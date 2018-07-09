package com.lewis.innerclass;

public class Parcel8 {

    public Wrapping wrapping(int x){
        return new Wrapping(x) {
            public int value() {
                return super.value() * 47;
            }
        };
    }


    public static void main(String[] args) {
        Parcel8 p8 = new Parcel8();
        Wrapping w = p8.wrapping(10);
        System.out.println(w.value());
    }
}


