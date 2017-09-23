package com.lewis.test;

import sun.print.SunMinMaxPage;

/**
 * Created by lewis on 17/3/30.
 */
public class SubEmployee extends  Employee{


    public static void main(String[] args) {
        Employee em = new SubEmployee();
        System.out.println(em.age);
        System.out.println(em.getName());

        int n = -9;
        String s = Integer.toBinaryString(n);
        System.out.println(s);
        System.out.println(~n);

        System.out.println(-3%12);
    }
}
