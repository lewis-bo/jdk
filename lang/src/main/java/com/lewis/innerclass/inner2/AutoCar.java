package com.lewis.innerclass.inner2;

import com.lewis.innerclass.exercise6.SimpleInterface;

/**
 * Created by lewis on 2018/6/23.
 */
public class AutoCar {

    protected class ToyotaCar implements SimpleInterface {
        public ToyotaCar() {

        }

        @Override
        public String run() {
            return "toyota";
        }
    }

    private class Hello {
        private class World {

        }
    }
}


