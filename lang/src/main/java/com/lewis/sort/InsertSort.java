package com.lewis.sort;

/**
 * Created by lewis on 17/9/10.
 */
public class InsertSort {


    public static void sort(int[] arr, int left, int right) {

        for (int i = left + 1; i < right; i++) {
            int temp = arr[i];


            int index = 0;
            boolean isOffset = false;
            for (int j = left; j < i; j++) {
                if (temp <= arr[j]) {
                    index = j;
                    isOffset = true;
                    break;
                }
            }

            if (isOffset) {
                for (int k = i; k > index; k --) {
                    arr[k] = arr[k - 1];
                }

                arr[index] = temp;
            }

        }
    }

    public static void insertSort(int[] a, int left, int right) {
        for (int i = left, j = i - 1; i < right; i++, j = i - 1) {
            int temp = a[i];
            for (; j >= 0 && a[j] > temp; j--) {
                a[j + 1] = a[j];
            }

            a[j + 1] = temp;
        }
    }

    /**
     * 插入排序
     * 默认左边有序
     * @param a
     * @param leftmost
     */
    public static void sort(int[] a, boolean leftmost) {
        if (a.length < 3) {
            return;
        }
        int left = 1;
        int right = a.length - 1;

        for (int i = left, j = i + 1; ++ left <= right; i=left) {
            int a1 = a[i], a2 = a[left];
            if (a1 > a2) {
                int temp = a1;
                a1 = a2;
                a[i] = a2;
                a2 = temp;
                a[left] = temp;
            }

            while (j >= 0 && a[j -1] > a2) {

                swap(a, j, j - 1);
                j --;
            }
            a[j] = a2;

            while (j>= 0 && a[j - 1] > a1) {
                swap(a, j, j - 1);
                j --;
            }
            a[j] = a1;
        }
    }
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 2,  4, 9, 1, 3, 8, 10};

        insertSort(arr, 0, arr.length - 1);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
