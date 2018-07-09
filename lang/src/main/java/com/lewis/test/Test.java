package com.lewis.test;

import com.lewis.innerclass.Outter;
import com.lewis.innerclass.inner2.AutoCar;

/**
 * Created by lewis on 2018/6/23.
 */
public class Test extends Outter{

    public static void main(String[] args) {
        Outter outter = new Outter();
        outter.setName("david");
        Outter.Innner innner = outter.new Innner();

        System.out.println(innner.name());

    }
}
