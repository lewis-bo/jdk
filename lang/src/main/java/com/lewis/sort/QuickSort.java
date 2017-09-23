package com.lewis.sort;

/**
 * Created by lewis on 17/9/10.
 */
public class QuickSort {


    /**
     * 快速排序
     * 1.从
     * @param arr
     * @param left
     * @param right
     */
    public static void sort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        //左哨兵
        int l = left + 1;
        //右哨兵
        int r = right;
        //基数
        int pivot = arr[left];

        while (l != r) {
            //从右边开始移动
            //从右边数 取到第一个比pivot小的位置
            while (l < r && arr[r] >= pivot) {
                r --;
            }

            //从左边开始移动
            //从左边数 取到一个比pivot大的位置
            while (l < r && arr[l] <= pivot) {
               l ++;
            }


            //交换r 和 l的位置
            if (l < r) {
               int temp = arr[l];
               arr[l] = arr[r];
               arr[r] = temp;
            }
        }

        //完成一趟排序 交换基数的位置
        arr[left] = arr[l];
        arr[l] = pivot;

        //递归继续执行
        sort(arr, left, l - 1);
        sort(arr, l + 1, right);
    }


    public static void main(String[] args) {
        int[] arr = {58, 34, 23, 3536,646, 5, 3, 1,78, 88, 12, 24, 67, 75, 41, 23, 17, 57, 45, 5, 89};

        sort(arr, 0, arr.length - 1);
        for (int a : arr) {
            System.out.print(a + " ");
        }


        System.out.println(" ");
        System.out.println(4 << 3);
        System.out.println(23 >> 2);
    }
}
