package com.lewis.util;

/**
 * Created by lewis on 17/9/9.
 */
public abstract class AbstractCollection<E> implements Collection<E>{

    protected  AbstractCollection() {}


    /**
     * 获取集合长度
     * @return
     */
    public abstract int size();


    /**
     * 获取对应的迭代器
     */
    public abstract Iterator<E> iterator();


    /**
     * 集合是否为空
     * @return
     */
    public boolean isEmpty() {
        return size() == 0;
    }


    /**
     * 是否包含某个元素
     * @param o
     * @return
     */
    public boolean contains(Object o) {
       Iterator<E> it = this.iterator();
       if (null == o) {
          while(it.hasNext()) {
              if (it.next() == null) {
                  return true;
              }
          }
       } else {
           while (it.hasNext()) {
               if (o.equals(it.next())) {
                   return true;
               }
           }
       }
       return false;
    }


    /**
     * 将集合转为object 数组
     * @return
     */
    public Object[] toArray() {
        Object[] arr = new Object[this.size()];
        Iterator<E> it = this.iterator();
        for (int i = 0; i < arr.length; i++) {
            if (it.hasNext()) {

            }
        }

        return arr;
    }

}
