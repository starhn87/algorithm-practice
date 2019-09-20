/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 *
 * https://leetcode.com/problems/maximum-subarray/description/
 *
 * algorithms
 * Easy (44.42%)
 * Likes:    5107
 * Dislikes: 196
 * Total Accepted:    630.8K
 * Total Submissions: 1.4M
 * Testcase Example:  '[-2,1,-3,4,-1,2,1,-5,4]'
 *
 * Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum.
 * 
 * Example:
 * 
 * 
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * 
 * 
 * Follow up:
 * 
 * If you have figured out the O(n) solution, try coding another solution using
 * the divide and conquer approach, which is more subtle.
 * 
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int answer = nums[0], sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (0 < sum) {
                // sum? 0?? ?? ?? ??? ??
                sum += nums[i];
            } else {
                // ???? ?? ??? ?
                sum = nums[i];
            }
            answer = Math.max(answer, sum);
        }
        return answer;
    }
}
