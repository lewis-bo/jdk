package com.lewis.test;

/**
 * Created by lewis on 17/4/3.
 */
public class CalculateStringTest {

    public static int add(int a, int b) {
        // a = 10 1010 b = 7 0111
        int res = 0;
        int temp = a ^ b;
        int followward = (a & b) << 1;
        if (followward != 0) {
           res = add(temp, followward);
        } else {
            res = temp;
        }
        return res;
    }


    public static int sub(int a, int b) {
        int temp = ~(b - 1);
        return add(a, temp);
    }

    public static int mul(int a, int b) {
        int sum = 0;
        int i = 0;
        while (b != 0) {
           if ((b & 1) == 1) {
                sum += a << i;
                b >>= 1;
                i++;
            } else{
                b >>= 1;
                i++;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 7));
        System.out.println(sub(10, 7));
        System.out.println(mul(10, 3));
        System.out.println(-9 << 1);
    }
}
