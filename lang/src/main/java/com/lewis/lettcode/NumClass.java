package com.lewis.lettcode;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by lewis on 17/9/12.
 */
public class NumClass {

    public static List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<Integer>(n);
        int curr = 1;
        for (int i = 1; i <= n; i++) {
            list.add(curr);
            if (curr * 10 <= n) {
                curr *= 10;
            } else if (curr % 10 != 9 && curr + 1 <= n) {
                curr++;
            } else {
                while ((curr / 10) % 10 == 9) {
                    curr /= 10;
                }
                curr = curr / 10 + 1;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
    }
}
