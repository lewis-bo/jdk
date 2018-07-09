package com.lewis.innerclass;

/**
 * Created by lewis on 2018/6/23.
 */
public interface Selector {
    boolean end();

    Object current();

    void next();

    Sequence sequence();
}
