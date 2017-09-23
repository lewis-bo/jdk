package com.lewis.test;

/**
 * Created by lewis on 17/9/23.
 */
public interface Selector {
    boolean isEnd();

    Object current();

    void next();
}

