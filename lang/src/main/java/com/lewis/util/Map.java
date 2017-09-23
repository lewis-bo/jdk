package com.lewis.util;

/**
 * Created by lewis on 17/9/9.
 */
public interface Map<K, V> {

    /**
     * 获取map的长度
     * @return
     */
    int size();


    /**
     * map是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 是否包含某个key
     * @param key
     * @return
     */
    boolean containsKey(Object key);


    /**
     * 是否包含某个value
     * @param value
     * @return
     */
    boolean containsValue(Object value);


    /**
     *
     * @param k
     * @param v
     * @return
     */
    V put(K k, V v);

    /**
     *
     * @param key
     * @return
     */
    V get(Object key);


    /**
     * 删除某个key的映射
     * @param key
     * @return
     */
    V remove(Object key);

    /**
     *
     * @param map
     */
    void putAll(Map<? extends K, ? extends V> map);
}

