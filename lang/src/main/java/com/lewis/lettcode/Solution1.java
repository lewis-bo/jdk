package com.lewis.lettcode;

import java.util.Stack;

/**
 * Created by lewis on 17/9/17.
 */
public class Solution1 {

    private static int left = 0;
    private static int right = 0;
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> value = new Stack<Integer>();
        stack.push(root);
        value.push(1);
        int max = 0;
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int temp = value.pop();
            max = Math.max(temp, max);
            if(node.left != null) {
                stack.push(node.left);
                value.push(temp+1);
            }
            if(node.right != null) {
                stack.push(node.right);
                value.push(temp+1);
            }
        }
        return max;
    }

    static class TreeNode {
        private int val;

        private TreeNode left;

        private TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }


        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(3);

        TreeNode left2 = new TreeNode(3);
        TreeNode right2 = new TreeNode(4);
        root.left = left1;
        root.right = right1;
        left1.left = left2;
        left1.right = right2;

        System.out.println(new Solution1().maxDepth(root));
    }
}
