package com.lewis.innerclass;

/**
 * Created by lewis on 2018/6/23.
 */
public class SequenceString {

    private String s;

    public SequenceString(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);

        SequenceString s1 = new SequenceString("hello");
        SequenceString s2 = new SequenceString("world");

        sequence.add(s1);
        sequence.add(s2);

        Selector selector = sequence.selector();
        while (!selector.end()) {
            SequenceString ss = (SequenceString) selector.current();
            System.out.println(ss.toString());

            selector.next();
        }
    }

}
