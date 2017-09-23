package com.lewis.lettcode;

 class Solution {
    /**
     * Given a string, find the first non-repeating character in it and return it's index.
     * If it doesn't exist, return -1.
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int[] arr = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        for (int i = 0; i < chars.length; i++) {
            int index = chars[i] - 97;
            if (arr[index] == -1) {
                arr[index] = i;
            } else {
                arr[index] = -2;
            }
        }

        int currentInt = -1;
        for (int i : arr) {
            currentInt = (i <= -1) ? currentInt : (currentInt != -1 && currentInt < i) ? currentInt : i;
        }

        return currentInt;
    }



    public static void main(String[] args) {
        System.out.println(new Solution().firstUniqChar("aadadaad"));
    }
}