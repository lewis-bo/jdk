package com.lewis.util;

/**
 * Created by lewis on 17/9/3.
 * 迭代器接口
 *
 * 迭代遍集合集合
 */
public interface Iterator<E> {


    /**
     * 是否还有下一个元素
     * @return
     */
    boolean hasNext();


    /**
     * 获取下一个元素
     * @return
     */
    E next();


    /**
     *
     */
    void remove();
}
