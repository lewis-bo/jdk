package com.lewis.testx;

import com.lewis.test.Parcell;
import com.lewis.test.Selector;
import com.lewis.test.Sequence;

/**
 * Created by lewis on 17/9/23.
 */
public class Test {

    public static void main(String[] args) {
        Parcell pc = new Parcell();
        Parcell.Content content = pc.content();


        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(i);
        }

        Selector selector = sequence.selector();
        while (!selector.isEnd()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}
