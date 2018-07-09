package com.lewis.innerclass.exercise6;

public class SimpleClass {
    protected class Inner implements SimpleInterface {
    // Force constructor to be public:
        public Inner() {}

        @Override
        public String run() {
            return null;
        }
    }
}