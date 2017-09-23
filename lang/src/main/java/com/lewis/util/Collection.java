package com.lewis.util;

import com.lewis.lang.Iterable;

/**
 * Created by lewis on 17/9/9.
 *
 */
public interface Collection<E> extends Iterable<E>{

    /**
     * 集合长度
     * @return
     */
    int size();

    /**
     * 是否为空
     * @return
     */
    boolean isEmpty();


    /**
     * 是否包含某个ke
     * @param o
     * @return
     */
    boolean contains(Object o);


    /**
     *获取对应的迭代器
     * @return
     */
    Iterator<E> iterator();

    /**
     * 转换为数组
     * @return
     */
    Object[] toArray();

    /**
     * @param t
     * @param <T>
     * @return
     */
    <T> T[] toArray(T[] t);

    /**
     * 向集合中添加个元素
     * @param e
     * @return
     */
    boolean add(E e);

    /**
     * 删除指定元素
     * @param e
     * @return
     */
    boolean remove(E e);

    /**
     * 是否包含所有的元素
     * @param c
     * @return
     */
    boolean containsAll(Collection<?> c);


    /**
     * 添加集合元素
     * @param c
     * @return
     */
    boolean addAll(Collection<? extends E> c);


    /**
     * 删除指定集合元素的
     * @see #contains(Object)
     * @see #remove(Object)
     * @param c
     * @return
     */
    boolean removeAll(Collection<?> c);


    /**
     * 保存指定集合的元素
     * @param c
     * @return
     */
    boolean retainAll(Collection<?> c);

    /***
     * 清空集合元素
     * @return
     */
    boolean clear();

    /**
     * 是否相等
     * @param o
     * @return
     */
    boolean equals(Object o);


    /**
     * hash值
     * @return
     */
    int hashCode();
}


