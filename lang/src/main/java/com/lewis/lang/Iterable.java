package com.lewis.lang;

import com.lewis.util.Iterator;

/**
 * Created by lewis on 17/9/3.
 * 迭代器接口
 * 实现该接口的的可被迭代 执行foreach
 */
public interface  Iterable<T> {

    /**
     *
     * @return
     */
    Iterator<T> iterator();
}
