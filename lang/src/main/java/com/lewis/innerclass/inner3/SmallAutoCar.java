package com.lewis.innerclass.inner3;

import com.lewis.innerclass.exercise6.SimpleInterface;
import com.lewis.innerclass.inner2.AutoCar;

/**
 * Created by lewis on 2018/6/23.
 */
public class SmallAutoCar extends AutoCar{

    public SimpleInterface car() {
        return new ToyotaCar();
    }
}
