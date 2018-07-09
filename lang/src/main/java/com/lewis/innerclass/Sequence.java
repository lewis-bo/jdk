package com.lewis.innerclass;

/**
 * Created by lewis on 2018/6/23.
 */
public class Sequence {

    private Object[] items;

    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add (Object o) {
        if (next < items.length) {
            items[next ++] = o;
        }
    }

    public Selector selector() {
        return new SquenceSeclector();
    }

    private class SquenceSeclector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i >= next;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) {
                i ++;
            }
        }

        public Sequence sequence() {
            return Sequence.this;
        }
    }


    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(i);
        }

        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }


        System.out.println(sequence);
        Sequence sequence1 = selector.sequence();
        System.out.println(sequence1);
    }
}
