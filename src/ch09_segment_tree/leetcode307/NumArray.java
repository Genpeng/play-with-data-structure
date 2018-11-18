package ch09_segment_tree.leetcode307;

import ch09_segment_tree.SegmentTree;

/**
 * This is the solution of No. 307 problem in the LeetCode, which uses
 * customized segment tree class, the website of the problem is as follow:
 * https://leetcode.com/problems/range-sum-query-mutable/
 *
 * @author  StrongXGP (xgp1227@gmail.com)
 * @date    2018/11/18
 */
public class NumArray {
    private SegmentTree<Integer> segmentTree;

    public NumArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("[ERROR] The array can not be null or empty!");
        }

        Integer[] data = new Integer[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            data[i] = nums[i];
        }
        segmentTree = new SegmentTree<>(data, (a, b) -> a + b);
    }

    public void update(int i, int val) {
        segmentTree.set(i, val);
    }

    public int sumRange(int i, int j) {
        return segmentTree.query(i, j);
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5};
        NumArray obj = new NumArray(nums);
        System.out.println(obj.sumRange(0, 2));
        obj.update(1, 2);
        System.out.println(obj.sumRange(0, 2));
    }
}
