package com.lewis.test;

/**
 * Created by lewis on 17/9/23.
 */
public class LinkedStack<T> {

    /**
     * 私有静态内部类
     */
    private class Node {
        T item;
        Node next;
        Node() {
            item = null;
            next = null;
        }

        Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return null == item && null == next;
        }
    }

    private Node top = new Node();

    public void push(T item) {
        top = new Node(item, top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }


    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<String>();
        for (String s : "PXSD,DGDJG,gdd".split(",")) {
            lss.push(s);
        }

        String s = null;
        while ((s = lss.pop()) != null) {
            System.out.println(s);
        }
    }
}

