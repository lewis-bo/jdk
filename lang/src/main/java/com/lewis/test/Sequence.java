package com.lewis.test;

/**
 * Created by lewis on 17/9/23.
 */
public class Sequence {

    private Object[] items;

    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next ++] = x;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private class SubSequence implements Selector {

        private int i = 0;
        public boolean isEnd() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) {
                i ++;
            }
        }
    }


    public Selector selector() {
        return new SubSequence();
    }
}
