import java.util.Arrays;

/*
 * @lc app=leetcode id=581 lang=java
 *
 * [581] Shortest Unsorted Continuous Subarray
 *
 * https://leetcode.com/problems/shortest-unsorted-continuous-subarray/description/
 *
 * algorithms
 * Easy (30.42%)
 * Likes:    1681
 * Dislikes: 75
 * Total Accepted:    80.9K
 * Total Submissions: 265.3K
 * Testcase Example:  '[2,6,4,8,10,9,15]'
 *
 * Given an integer array, you need to find one continuous subarray that if you
 * only sort this subarray in ascending order, then the whole array will be
 * sorted in ascending order, too.  
 * 
 * You need to find the shortest such subarray and output its length.
 * 
 * Example 1:
 * 
 * Input: [2, 6, 4, 8, 10, 9, 15]
 * Output: 5
 * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make
 * the whole array sorted in ascending order.
 * 
 * 
 * 
 * Note:
 * 
 * Then length of the input array is in range [1, 10,000].
 * The input array may contain duplicates, so ascending order here means . 
 * 
 * 
 */

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] arr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(arr);
        int start = getStartIndex(nums, arr);
        int end = getEndIndex(nums, arr);

        return end == start ? 0 : end - start + 1;
    }

    private int getStartIndex(int[] nums, int[] sortedNums) {
        for (int start = 0; start < nums.length; start++) {
            if (nums[start] != sortedNums[start]) {
                return start;
            }
        }
        return -1;
    }

    private int getEndIndex(int[] nums, int[] sortedNums) {
        for (int end = nums.length - 1; end >= 0; end--) {
            if (nums[end] != sortedNums[end]) {
                return end;
            }
        }
        return -1;
    }
}
