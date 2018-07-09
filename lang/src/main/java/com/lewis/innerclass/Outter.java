package com.lewis.innerclass;

/**
 * Created by lewis on 2018/6/23.
 */
public class Outter {
    private String name;

    public class Innner {


        public String say() {
            return "hello";
        }

        public String name() {
            return name;
        }
    }


    public Innner innner() {
        return new Innner();
    }

    public void setName(String name) {
       this.name = name;
    }
}
